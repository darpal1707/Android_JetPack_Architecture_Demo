package com.darpal.openapi.repository.auth

import com.darpal.openapi.api.auth.OpenApiAuthService
import com.darpal.openapi.room.AccountPropertiesDao
import com.darpal.openapi.room.AuthTokenDao
import com.darpal.openapi.session.SessionManager

class AuthRepository
constructor(
    val authTokenDao: AuthTokenDao,
    val accountPropertiesDao: AccountPropertiesDao,
    val openApiAuthService: OpenApiAuthService,
    val sessionManager: SessionManager
){

}