package com.example.schnauzer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SchnauzerApplication

fun main(args: Array<String>) {
	runApplication<SchnauzerApplication>(*args)
}
