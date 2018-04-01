package interfaces

import enums.Episode

interface ICharacter {
    val id : String
    val name : String?
    val friends : List<ICharacter>
    val appearsIn: Set<Episode>
}