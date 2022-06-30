package com.example.fragmentcomm

import android.text.Editable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicationViewModel : ViewModel() {
    private val mName = MutableLiveData<String>()
    private val mUmur = MutableLiveData<Int>()

    val name : LiveData<String> get() = mName
    val umur : LiveData<Int> get() = mUmur

    fun setName(name : String){
        mName.value = name
    }

    fun setUmur(umur: Int){
        mUmur.value = umur
    }
}