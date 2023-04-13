package com.example.mscustomer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
class MsCustomerApplication

fun main(args: Array<String>) {
	runApplication<MsCustomerApplication>(*args)
}
