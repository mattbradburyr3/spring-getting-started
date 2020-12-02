package com.example.gettingstarted

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.web.server.LocalServerPort
import org.springframework.core.env.Environment
import org.springframework.http.ResponseEntity
import java.net.URL

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloControllerIT {


    @LocalServerPort
    private var port: Int = 0

    lateinit var base: URL

    @Autowired
    lateinit var template: TestRestTemplate

    @BeforeEach
    fun setUp() {
        this.base = URL("http://localhost:$port/")
    }

    @Test
    fun getHello(){

        val response: ResponseEntity<String> = template.getForEntity(base.toString(), String::class.java)
        assertThat(response.body).isEqualTo("Greetings from Spring Boot!")
    }


}