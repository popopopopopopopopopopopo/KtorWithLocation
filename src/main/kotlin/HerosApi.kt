import io.ktor.locations.Location

@Location("/heros") class HerosIndex

@Location("/heros/{name}") class HerosSetAndGet(val name : String)