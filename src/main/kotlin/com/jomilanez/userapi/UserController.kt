package com.jomilanez.userapi

import io.swagger.annotations.*
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/user")
@Api(description = "Users management API", tags = ["UserDto"])
class UserController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("Registers new user")
    @ApiResponses(
        ApiResponse(code = 201, message = "UserDto has been successfully created"),
        ApiResponse(code = 500, message = "Internal server error")
    )
    fun create(
        @ApiParam(value = "Application Version", required = true)
        @RequestHeader(name = "X-App-Version", required = true) appVersion: String,
        @ApiParam(value = "UserDto object containing all the information needed to create a user", required = true)
        @RequestBody user: UserDto
    ): UserDto = UserDto(userId = "id", country = "BR", language = "pt")
}

data class UserDto(
    val userId: String,
    val country: String,
    val language: String
)
