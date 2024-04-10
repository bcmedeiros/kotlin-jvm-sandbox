import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

interface DataEvent<D: Any> {
    val data: D
}

@Serializable
sealed interface Event {
    @Serializable
    data class EventA(
        val name: String,
        override val data: Info,
    ) : Event, DataEvent<EventA.Info> {
        @Serializable
        data class Info(
            val i: Int,
        )
    }
}

fun main() {
    val event: Event = Event.EventA(
        name = "ev1",
        data = Event.EventA.Info(1)
    )
    val json = Json.encodeToString(
        event
    )
    println(json)
}
