package com.phantomdoor.corpdashcore

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class CorpdashCoreApplication

fun main(args: Array<String>) {
	runApplication<CorpdashCoreApplication>(*args)
}
