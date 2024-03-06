package com.example.firebase.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
 class LiveDataViewModel: ViewModel(){

     var counter = MutableLiveData<Int>()

     init {
         counter.value = 0
     }
     fun updateCount() {
         counter.value = (counter.value)?.plus(1)
     }
}