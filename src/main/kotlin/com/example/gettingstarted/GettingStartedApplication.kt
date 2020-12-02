package com.example.gettingstarted

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import java.util.*

// this app follows the https://spring.io/guides/gs/spring-boot/ getting started tutorial, but converts the code into Kotlin

@SpringBootApplication
class GettingStartedApplication {
	@Bean
	fun commandLineRunner(ctx: ApplicationContext): CommandLineRunner{

		return CommandLineRunner {

			println("Let's inspect the beans provided by Spring Boot")
			val beanNames = ctx.beanDefinitionNames
			Arrays.sort(beanNames)
			for (b in beanNames) println(b)
		}
	}
}


fun main(args: Array<String>) {
	runApplication<GettingStartedApplication>(*args)
}

