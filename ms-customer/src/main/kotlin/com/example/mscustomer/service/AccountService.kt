package com.example.mscustomer.service

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name="ms-account", url="http://localhost:8081/realms/software/protocol/openid-connect/token")
interface AccountService {
    @GetMapping("/accounts/test")
    fun test(): String
    @GetMapping("/accounts/list")
    fun getAccounts(): List<String>
}