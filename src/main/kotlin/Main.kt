package main

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.locations.Locations
import routes.HerosRoute

fun main(args: Array<String>) {
    embeddedServer(
            Netty,
            watchPaths = listOf("solutions/exercise4"),
            port = 60101,
            module = Application::hellomodule
    ).apply {
        start(wait = true)
    }
}

fun Application.hellomodule() {
    install(Locations)
    install(Routing) {
        HerosRoute()
    }
//    routing {
//        get("/plain") {
//            call.respondText("Hello World!")
//        }
//    }
}