package com.example.mhapp4.ui.trends

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TrendsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Trends Fragment"
    }
    val text: LiveData<String> = _text
}