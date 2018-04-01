package models
import interfaces.ICharacter
import enums.Episode

class Droid (
        override val id: String,
        override val name: String?,
        override val friends: List<ICharacter>,
        override val appearsIn: Set<Episode>,
        val primaryFunction: String
) : ICharacter