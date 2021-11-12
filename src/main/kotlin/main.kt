import io.ktor.client.*
import io.ktor.client.engine.java.*
import io.ktor.client.request.*
import kotlinx.coroutines.runBlocking

private val client = HttpClient(Java) {
    engine {
        threadsCount = 1
        config {
            version(java.net.http.HttpClient.Version.HTTP_1_1)
        }
    }
}

fun main() {
    var count = 0
    while (true) {
        val getResult: String = runBlocking{
            client.get("http://localhost:8093/test")
        }
        count++
        if (count % 1000 == 0) {
            println("$getResult: $count requests")
        }
    }
}