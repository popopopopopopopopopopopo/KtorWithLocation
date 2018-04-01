package services

import models.Hero
import enums.Episode

class HeroService {
    fun getAll() : List<Hero> {
        val dummyHeros = listOf<Hero>(Hero("2000", "Luke Skywalker", emptyList(), Episode.values().toSet(), "Tatooine", 1.72),
                Hero("2000", "Luke Skywalker", emptyList(), Episode.values().toSet(), "Tatooine", 1.72))
        return dummyHeros
    }
}