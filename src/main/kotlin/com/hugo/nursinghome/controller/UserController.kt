package com.hugo.nursinghome.controller

import com.hugo.nursinghome.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(private val userService: UserService) {

    @GetMapping("user")
    fun getUser(): String {
        return userService.getUserById()
    }

}
