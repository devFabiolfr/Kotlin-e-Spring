package com.bookXis.bookXis.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/books")
@RestController

class CustomController {
    @GetMapping
    fun helloWorld(): String {
        return "CustomController hello world"
    }

    @GetMapping("/2")
    fun helloWorld2(): String {
        return "CustomController hello world 2"
    }

}