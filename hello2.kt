import java.util.Calendar

fun calendarDemo() {
    val calendar = Calendar.getInstance()
    if (calendar.firstDayOfWeek == Calendar.SUNDAY) {  // call getFirstDayOfWeek()
        calendar.firstDayOfWeek = Calendar.MONDAY       // call setFirstDayOfWeek()
    }
    print("Cal DOW" )
    println(calendar.firstDayOfWeek)
}


fun main(args: Array<String>) {
	println(args[0])
	println(args[1])
	val scope = "world"
    println("Hello, $scope!")
    println("Hello, World!")
//    println(args.len)
    
    val fruits = listOf("banana", "avocado", "apple", "kiwi", "blackberry")
    fruits
    .filter { it.startsWith("a") }
    .sortedBy { it }
    .map { it.toUpperCase() }
    .forEach { println(it) }
    
    val items = setOf("apple", "banana", "kiwi")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
    calendarDemo()
//   printf("%n")
}