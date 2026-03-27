package com.example

import io.ktor.http.HttpStatusCode
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.serialization.Serializable

@Serializable
data class User(val id: String, val name: String )

fun Application.configureRouting() {

    routing {
        get("/") {
            call.respondText("Hello World!")
        }

        get("/user/{id}") {
            val id = call.parameters["id"]!!
            val user = User(id, "Hendrix")
            call.respond(user)

//            return@get call.respondText("Viewing user with id: $id!")
        }

        // Static plugin. Try to access `/static/index.html`
        staticResources("/static", "static")
    }
}
