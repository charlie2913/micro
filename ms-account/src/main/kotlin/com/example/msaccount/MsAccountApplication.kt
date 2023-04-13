package com.example.msaccount

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class MsAccountApplication

fun main(args: Array<String>) {
	runApplication<MsAccountApplication>(*args)
}
