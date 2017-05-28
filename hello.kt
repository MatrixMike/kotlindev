import java.util.Calendar
import java.util.*

fun calendarDemo() {
    val calendar = Calendar.getInstance()
    if (calendar.firstDayOfWeek == Calendar.SUNDAY) {  // call getFirstDayOfWeek()
        calendar.firstDayOfWeek == Calendar.MONDAY       // call setFirstDayOfWeek()
    }
    println(calendar.firstDayOfWeek)
}

/*fun demo(source: List<Int>) {
    val list = ArrayList<Int>()
    // 'for'-loops work for Java collections:
    for (item in source) {
        list.add(item)
    }
    // Operator conventions work as well:
    for (i in 0..source.size() - 1) {
        list[i] = source[i] // get and set are called
    }
}
*/

fun main(args: Array<String>) {
	println(args[0])
	println(args[1])
	val scope = "world"
    println("Hello, $scope!")
    println("Hello, World!")
//    println(args.len)
    
    val fruits = listOf("banana", "avocado", "apple", "kiwi", "blackberry")
    fruits
    .filter { it.startsWith("b") }
 //   .filter { it.endsWith("o") }
    .sortedBy { it }
    .map { it.toUpperCase() }
    .forEach { println(it) }
    println(fruits)
    
    val items = setOf("apple", "banana", "kiwi")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
    println("Number of "+ items)
    calendarDemo()
    
    val array = arrayOf(1, 2, 3, 4)
//	array[x] = array[x] * 2 // no actual calls to get() and set() generated
	for (x in array) { // no iterator created
    print(x)
}
}
