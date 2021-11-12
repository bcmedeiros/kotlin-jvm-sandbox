import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    val server = embeddedServer(
        Netty,
        port = 8093,
    ) {
        module()
    }
    server.start(wait = true)
}

fun Application.module() {
    routing {
        get("/test") {
            call.respondText("hello", ContentType.Text.Plain)
        }
    }
}
