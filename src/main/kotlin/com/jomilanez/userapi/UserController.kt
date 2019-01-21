package com.jomilanez.userapi

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class UserController {
    @GetMapping("/user")
    @ResponseStatus(HttpStatus.OK)
    fun getDefaultContent(
    ) = User(id = "id", language = "pt", country = "BR")
}

data class User(
    val id: String,
    val language: String,
    val country: String
)
