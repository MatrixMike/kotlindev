import java.util.Calendar
import java.util.*

fun calendarDemo() {  // some weird code 
    val calendar = Calendar.getInstance()
    if (calendar.firstDayOfWeek == Calendar.SUNDAY) {  // call getFirstDayOfWeek()
        calendar.firstDayOfWeek == Calendar.MONDAY       // call setFirstDayOfWeek()
        calendar.firstDayOfWeek == Calendar.THURSDAY      // call setFirstDayOfWeek()
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
    println("Hello, World! 1")
//    println(args.len)
    
    val fruits = listOf("banana", "avocado", "apple", "kiwi", "blackberry")
    fruits
    .filter { it.startsWith("b") }
 //   .filter { it.endsWith("o") }
    .sortedBy { it }
    .map { it.uppercase() }
    .forEach { println(it) }
    println(fruits)
    
    val items = setOf("apple", "banana", "kiwi")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
    println("Number of "+ items)
    println("Hello, World! 2")
    calendarDemo()
    println("Hello, World! 3")
    
    val arrayInt = arrayOf(1, 2, 3, 4)

//	for (x in arrayInt) { // no iterator created
//			arrayInt[x] = arrayInt[x] * 2 // no actual calls to get() and set() generated  // TODO 
//    print(arrayInt)
//	}
	print (arrayInt[2])
	print (arrayInt[1])
    print("\n")
}
