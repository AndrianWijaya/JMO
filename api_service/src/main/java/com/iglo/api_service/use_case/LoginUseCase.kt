package com.iglo.api_service.use_case

import com.iglo.common.LoginValidation
import kotlinx.coroutines.flow.flow

class LoginUseCase {
    operator fun invoke(username: String, password: String) = flow<String> {
        emit(LoginValidation.validate(username, password))
    }
}