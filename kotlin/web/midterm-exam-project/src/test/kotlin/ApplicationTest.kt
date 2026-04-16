package com.example

import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.server.testing.*
import kotlin.test.Test
import kotlin.test.assertEquals
import java.util.concurrent.ConcurrentHashMap

class ApplicationTest {

    @Test
    fun testRoot() = testApplication {
        application {
            module(ConcurrentHashMap()) // Pass an empty database for testing
        }
        client.get("/").apply {
            assertEquals(HttpStatusCode.OK, status)
        }
    }

}
