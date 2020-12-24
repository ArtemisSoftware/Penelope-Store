package com.artemissoftware.penelopestore.ui.frame

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.artemissoftware.penelopestore.api.models.ProductDto
import com.artemissoftware.penelopestore.repositories.MakeupRepository
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*

class StoreFrameViewModel @ViewModelInject constructor(private val makeupRepository: MakeupRepository) : ViewModel(){


    private val _products: MutableLiveData<List<ProductDto>> = MutableLiveData()
    val products: LiveData<List<ProductDto>> get() = _products

    // The current _hint
    val newReleases: LiveData<List<ProductDto>> = Transformations.map(_products) {

        val objSDF = SimpleDateFormat("dd-mm-yyyy")
        val dt_1: Date = objSDF.parse("01-09-2018")


        it.filter { it.updatedAt.after(dt_1)  }
    }



    init {
        viewModelScope.launch {
            val result = makeupRepository.getAllProducts()
            _products.value = result
        }
    }



//    private val _products: Job =  viewModelScope.launch {
//        makeupRepository.getAllProducts()
//    }
//    val hint = Transformations.map(_products) {
//
//    }

//    val hint: LiveData<String> = Transformations.map(word) {
//
//        val filteredWord = it.filter { !it.isWhitespace() }
//        val randomPosition = (1..filteredWord.length).random()
//
//        "Current word has " + filteredWord.length + " letters" +
//                "\nThe letter at position " + randomPosition + " is " +
//                filteredWord.get(randomPosition - 1).toUpperCase()
//    }

}