/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */

fun main(args: Array<String>) {
        val frontGears = listOf(32.0,22.0,42.0)
        val rearGears = listOf(14,16,20,30,48)
        val items = setOf("apple", "banana", "kiwi")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }

    println("Hello, world! 1")
    frontGears
    .sortedBy{it}
    .forEach { println(it/1.0) }
    println(frontGears)

    val numbers: MutableList<Double> = mutableListOf()
    for (f in frontGears){
        for (r in rearGears)
        numbers.add(f/r)  // create a list of the values needed to be processed
    }
        println("Hello, world! 2")
    println(numbers)  // prints the whole collection
    println("Hello, world! 3")
    numbers.sortedBy{it}.forEach{println(it)}  // prints unformatted
    //val formatted = String.format("%.2f   %.2f %.2f", frontGears/rearGears, frontGears, rearGears ) ;
    // val formatted = String.format("%.2f  %.2f", 1.2, 1/2)
    val formatted = String.format(" test text %.2f  ", 1.2)
        println(formatted) 
    numbers
    .sortedBy{it}  // so we want a sorted list and then we want it to be printed with a specific format
    .forEach{ println("%6.3f  ".format(it))}
        println("Hello, world! 4")
}
//    numbers.add(2.3)
//    numbers.add(2.0)    
//    println(numbers)

