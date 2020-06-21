fun main(args: Array<String>) {

    val myInt = 5;
    val myString = "myInt = $myInt"

    println(myString)
    sub1()
    sub2()
    sub3()
    sub4()
}
// https://www.programiz.com/kotlin-programming/string

fun sub1() {
    val myString = "Hey!"

    for (item in myString) {
        println(item)
    }
}
fun sub2() {

    val myInt = 5;
    val myString = "myInt = $myInt"

    println(myString)
}
fun sub3() {
    val a = 5
    val b = 6

    val myString = """
    |${if (a > b) a else b}
"""
    println("Larger number is: ${myString.trimMargin()}")
}
fun sub4() {

    val s1  = "Hey there!"
    val s2 = "Hey there!"
    var result: String

    println("Length of s1 string is ${s1.length}.")

    result = if (s1.compareTo(s2) == 0) "equal" else "not equal"
    println("Strings s1 and s2 are $result.")

    // s1.get(2) is equivalent to s1[2]
    println("Third character is ${s1.get(2)}.")

    result = s1.plus(" How are you?") // result = s1 + " How are you?"
    println("result = $result")

    println("Substring is \"${s1.subSequence(4, 7)}\"")

}
