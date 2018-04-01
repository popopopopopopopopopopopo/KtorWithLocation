package routes
import io.ktor.application.call
import io.ktor.routing.Route
import io.ktor.locations.*
import io.ktor.response.respond
import services.HeroService
import HerosIndex

fun Route.HerosRoute() {
    val heroService = HeroService()

    get<HerosIndex> {
        val heros = heroService.getAll()
        call.respond("hogemoge")
    }
}