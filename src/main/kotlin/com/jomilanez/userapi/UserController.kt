package com.jomilanez.userapi

import io.swagger.annotations.*
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/user")
@Api(description = "Users management API", tags = ["UserDto"])
class UserController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation("Gets a user")
    @ApiResponses(
        ApiResponse(code = 201, message = "UserDto has been found"),
        ApiResponse(code = 500, message = "Internal server error")
    )
    fun getUser(): UserDto = UserDto(userId = "id", country = "BR", language = "pt")
}

data class UserDto(
    val userId: String,
    val country: String,
    val language: String
)
