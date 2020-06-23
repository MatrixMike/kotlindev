package org.electroteach
/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */
/*
26.06.2018 12:21:10
my aim is to display (create) a sorted list of the bike gear ratios produced by
dividing the front gear size by the rear gear size
A function that took two collections of front and rear gear sizes and returned
a collection of the sorted ratios would be useful. Further I would like to retain 
the cause of the ratio i.e. which front/rear gear combination caused that ratio.
*/

fun main(args: Array<String>) {
        val frontGears = listOf(42.0, 32.0, 22.0)   // deliberately not sorted
//        val rearGears = listOf(26.0, 23.0, 21.0, 19.0, 17.0, 15.0, 13.0, 12.0)  // number of teeth on gear is an integer
        // but for the moment I make them real for the division and formatting to work
        val items = setOf("apple", "banana", "kiwi")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }

    println("Hello, world!")
    frontGears
    .sortedBy{it}
//    .max()
    .forEach { println(it/2.0) }
    println("==*")
//    var formatted ="%"
   gearsOut()
        println("==*")
    val numbers: MutableList<Int> = mutableListOf(1, 2, 3)
val readOnlyView: List<Int> = numbers
println(numbers)        // prints "[4, 2, 3]"
numbers.add(2)   // .sortedBy{it}.forEach {println(it) }

println(readOnlyView)   // prints "[1, 2, 3, 4]"
//readOnlyView.clear()    // -> does not compile

val strings = hashSetOf("a", "b", "c", "c")
assert(strings.size == 3)
}


