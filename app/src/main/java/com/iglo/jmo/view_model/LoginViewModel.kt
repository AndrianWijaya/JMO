package com.iglo.jmo.view_model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.iglo.api_service.use_case.LoginUseCase
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class LoginViewModel(
    val loginUseCase : LoginUseCase,
    application: Application
) : AndroidViewModel(application)  {

    val data = MutableLiveData<String>()

    fun checkUsernamePassword(username: String, password: String){
        viewModelScope.launch {
            loginUseCase(username, password).collect{
                data.postValue(it)
            }
        }
    }
}