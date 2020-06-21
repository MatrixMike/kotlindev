import java.util.Calendar

fun calendarDemo() {
    val calendar = Calendar.getInstance()
    if (calendar.firstDayOfWeek == Calendar.FRIDAY) {  // call getFirstDayOfWeek()
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
    val gears = listOf(9,3,10,1,5)
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
    println(gears)
    gears
    .sortedBy{it}
    .forEach { println(it) }
    }
//   printf("%n")
/* for (ch in 'a' .. 'z' // step 2){
 {
 print(ch)
 }

}
*/
