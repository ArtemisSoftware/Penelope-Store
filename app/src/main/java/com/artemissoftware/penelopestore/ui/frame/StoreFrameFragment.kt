package com.artemissoftware.penelopestore.ui.frame

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.artemissoftware.penelopestore.R
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StoreFrameFragment : Fragment(R.layout.fragment_store_frame){

    private val viewModel : StoreFrameViewModel by viewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val binding = FragmentTasksBinding.bind(view)
//
//        val taskAdapter = TasksAdapter(this)
//
//        binding.apply {
//            recyclerViewTasks.apply {
//                adapter = taskAdapter
//                layoutManager = LinearLayoutManager(requireContext())
//                setHasFixedSize(true)
//            }
//
//            ItemTouchHelper(object : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT) {
//                override fun onMove(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder, target: RecyclerView.ViewHolder ): Boolean {
//                    return false
//                }
//
//                override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
//                    val task = taskAdapter.currentList[viewHolder.adapterPosition]
//                    viewModel.onTaskSwiped(task)
//                }
//            }).attachToRecyclerView(recyclerViewTasks)
//
//
//            fabAddTask.setOnClickListener {
//                viewModel.onAddNewTaskClick()
//            }
//        }
//
//
//        setFragmentResultListener("add_edit_request"){ requestKey, bundle ->
//            val result = bundle.getInt(requestKey)
//            viewModel.onAddEditResult(result)
//        }
//
//
        viewModel.newReleases.observe(viewLifecycleOwner) {

        }
//
//        viewLifecycleOwner.lifecycleScope.launchWhenStarted {
//            viewModel.tasksEvent.collect{ event ->
//                when(event){
//
//                    is TasksViewModel.TasksEvent.ShowUndoDeleteTaskMessage ->{
//                        Snackbar.make(requireView(), "Task deleted", Snackbar.LENGTH_LONG)
//                            .setAction("UNDO") {
//                                viewModel.onUndoDeleteClick(event.task)
//                            }.show()
//                    }
//
//                    is TasksViewModel.TasksEvent.NavigateToAddTaskScreen -> {
//                        val action = TasksFragmentDirections.actionTasksFragmentToAddEditTaskFragment(null, "New Task")
//                        findNavController().navigate(action)
//                    }
//
//                    is TasksViewModel.TasksEvent.NavigateToEditTaskScreen -> {
//                        val action = TasksFragmentDirections.actionTasksFragmentToAddEditTaskFragment(event.task, "Edit Task")
//                        findNavController().navigate(action)
//                    }
//                    is TasksViewModel.TasksEvent.ShowTaskSavedConfirmationMessage ->{
//                        Snackbar.make(requireView(), event.msg, Snackbar.LENGTH_LONG).show()
//                    }
//                    is TasksViewModel.TasksEvent.NavigateToDeleteAllCompletedScreen -> {
//                        val action = TasksFragmentDirections.actionGlobalDeleteAllCompletedDialogFragment()
//                        findNavController().navigate(action)
//                    }
//                }.exhaustive
//            }
//        }
//
//        setHasOptionsMenu(true)
    }

}