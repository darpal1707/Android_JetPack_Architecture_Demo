package com.darpal.openapi.ui.auth

import androidx.lifecycle.ViewModel
import com.darpal.openapi.repository.auth.AuthRepository

class AuthViewModel
constructor(
    val authRepository: AuthRepository
):ViewModel(){

}