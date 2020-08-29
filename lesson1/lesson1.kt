package social.ict

class Greeter {
    var text: String = ""

    fun greet(name: String) {
        println("$text $name")
    }
}

fun main(args: Array<String>) {
val greeter = Greeter()
greeter.text = "Hi "
greeter.greet("Carl")
greeter.greet("Peter")
greeter.text = "Hello programmer"
greeter.greet("Richard")
}	
// https://www.ict.social/kotlin/oop/first-object-oriented-app-in-kotlin-hello-object-world
