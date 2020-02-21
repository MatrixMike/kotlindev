
// https://dev.to/cjbrooks12/kotlin-reified-generics-explained-3mie
// https://kotlinexpertise.com/kotlin-reified-types/
import java.util.*


fun Mammal.knownSpeciesCount(): Int {
    return when (this) {
        is Sloth -> 6
        is Panda -> 2
        is Manatee -> 3
    }
}

fun mammalFactCheck(mammal: Mammal, factCheck: KFunction1<Mammal, Int>): Int {
    return factCheck(mammal)
}

fun main() {

    val crewCrewCrew = listOf(
        Sloth("Jerry", false, 15),
        Panda("Tegan"),
        Manatee("Manny")
    )

    crewCrewCrew.forEach {
        println("${it.name} - mammalFactCheck(it, Mammal::knownSpeciesCount")
    }
}
