package com.example.mvvm_sample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.text.SimpleDateFormat
import java.util.Date

class TaskViewModel : ViewModel() {

    private val _newTaskEvent = MutableLiveData<Task>()
    val newTaskEvent: LiveData<Task> = _newTaskEvent

    fun createNewTask() {
        val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        val dateFormat = sdf.format(Date(System.currentTimeMillis()))
        _newTaskEvent.value = Task("Current Time: $dateFormat")
    }
}