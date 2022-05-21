package com.aldikitta.viewmodelscope_livedata_withcoroutines

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.aldikitta.viewmodelscope_livedata_withcoroutines.model.User
import com.aldikitta.viewmodelscope_livedata_withcoroutines.model.UserRepository
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivityViewModel : ViewModel() {
    private var userRepository = UserRepository()
    var users = liveData(IO) {
        val result = userRepository.getUsers()
        emit(result)
    }
//    val users: MutableLiveData<List<User>> = MutableLiveData()
//    fun getUserData() {
//        viewModelScope.launch {
//            var result: List<User>? = null
//            withContext(IO) {
//                result = userRepository.getUsers()
//            }
//            users.value = result
//        }
//    }
}