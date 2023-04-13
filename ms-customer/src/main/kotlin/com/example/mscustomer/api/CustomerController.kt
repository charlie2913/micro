package com.example.mscustomer.api

import com.example.mscustomer.service.AccountService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/customers")

class CustomerController @Autowired constructor(val accountService: AccountService){

    @Value("\${server.port}")
    lateinit var port: String

    @GetMapping("/test")
    fun test(): String {
        val result=accountService.test();
        return "server port: $port -> $result"
    }
    @GetMapping("/list")
    fun getCustomers() = listOf("John", "Jane", "Jack")
}
