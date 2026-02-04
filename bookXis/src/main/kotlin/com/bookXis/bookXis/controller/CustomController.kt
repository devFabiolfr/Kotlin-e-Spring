package com.bookXis.bookXis.controller

import com.bookXis.bookXis.model.CustomModel
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/books")
@RestController

class CustomController {

    @GetMapping
    fun getCustomer(): CustomModel {
        return CustomModel("1","Gustavo","email@gmail.com")
    }

}