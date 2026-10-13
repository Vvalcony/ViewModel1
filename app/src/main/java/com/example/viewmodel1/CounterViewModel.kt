package com.example.viewmodel1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    private val _count = MutableLiveData(0)
    val count: LiveData<Int> = _count

    fun up() {
        _count.value = (_count.value ?: 0) + 1
    }

    fun down() {
        val current = _count.value ?: 0
        if (current > 0) {
            _count.value = current - 1
        }
    }

    fun reset() {
        _count.value = 0
    }
}