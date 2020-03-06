package com.darpal.openapi.session

import android.app.Application
import com.darpal.openapi.room.AuthTokenDao

class SessionManager
constructor(
    val authTokenDao: AuthTokenDao,
    val application: Application
){

}