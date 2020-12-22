package com.artemissoftware.penelopestore.ui.frame

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.artemissoftware.penelopestore.api.models.ProductDto
import com.artemissoftware.penelopestore.repositories.MakeupRepository
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class StoreFrameViewModel @ViewModelInject constructor(private val makeupRepository: MakeupRepository) : ViewModel(){


    private val _products: MutableLiveData<List<ProductDto>> = MutableLiveData()
    val products: LiveData<List<ProductDto>> get() = _products


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