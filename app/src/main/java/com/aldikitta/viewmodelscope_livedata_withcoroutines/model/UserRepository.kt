package com.aldikitta.viewmodelscope_livedata_withcoroutines.model

import kotlinx.coroutines.delay

class UserRepository {
    suspend fun getUsers(): List<User> {
        delay(8000)
        val users: List<User> = listOf(
            User(1, "Sam"),
            User(2, "Joe"),
            User(3, "Amy"),
            User(4, "Tom"),
            User(5, "Ana"),

            )
        return users
    }
}