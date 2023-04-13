package com.example.msaccount.api

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/accounts")
class AccountController {
    companion object {
        val accounts = listOf("9121241431", "7325629", "89253938")
    }
    @Value("\${server.port}")
    lateinit var port: String

    @GetMapping("/test")
    fun test(): String {
        return "Account server port: $port"
    }
    @GetMapping("/list")
    fun getAccounts(): List<String> {
        return accounts
    }
    @GetMapping("/{id}")
    fun getAccount(@PathVariable id: Int): String {
        return accounts[id];
    }
}