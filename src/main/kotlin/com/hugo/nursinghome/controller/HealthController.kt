package com.hugo.nursinghome.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthController {

    @GetMapping("ping")
    fun getPong(): String {
        return "pong"
    }

}
