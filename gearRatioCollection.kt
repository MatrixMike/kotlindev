/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */

fun main(args: Array<String>) {
        val frontGears = listOf(22.0,32.0,42.0)
        val rearGears = listOf(14.0,16.0,20.0,30.0,48.0)
        val items = setOf("apple", "banana", "kiwi")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }

    println("Hello, world!")
    frontGears
    .sortedBy{it}
    .forEach { println(it/2.0) }
    println("==")
    for (f in frontGears){
    for (r in rearGears){
        val formatted = String.format("%.2f   %.2f %.2f", f/r, f, r ) ;
        println(formatted) 
//        println(f/r )
    }
 
    }   
    val numbers: MutableList<Int> = mutableListOf(1, 2, 3)
val readOnlyView: List<Int> = numbers
println(numbers)        // prints "[1, 2, 3]"
numbers.add(4)
println(readOnlyView)   // prints "[1, 2, 3, 4]"
//readOnlyView.clear()    // -> does not compile

val strings = hashSetOf("a", "b", "c", "c")
assert(strings.size == 3)
}
