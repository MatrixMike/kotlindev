package ch02.ex3_3_UsingWhenWithArbitraryObjects

//import ch02.colors.Color
//import ch02.colors.Color.*

// combining enum in a function
// printing the word in the enum list
// https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/set-of.html
enum class Color {
    RED, ORANGE, YELLOW, GREEN_1, BLUE, INDIGO, VIOLET
}
fun mix(c1: Color, c2: Color) =
        when (setOf(c1, c2)) {
            setOf(Color.RED,    Color.YELLOW) -> Color.ORANGE
            setOf(Color.YELLOW, Color.BLUE)   -> Color.GREEN_1
            setOf(Color.BLUE,   Color.VIOLET) -> Color.INDIGO
            else -> throw Exception("Dirty color")
        }

fun main(args: Array<String>) {
    println(mix(Color.BLUE, Color.YELLOW))
    println(mix(Color.YELLOW, Color.BLUE))
    println(mix(Color.RED,  Color.YELLOW))
    println(String.format("0x%08X", 1))
    //    println(String.format("0x%08X", mix(Color.RED,  Color.YELLOW)))
//    println(mix(Color.BLUE, Color.BLUE))   // uncomment this for Exception
}
