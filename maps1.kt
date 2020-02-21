//import java.util.*

fun main(args: Array<String>) {
    val readWriteMap: HashMap< String, Int > = hashMapOf("foo" to 1, "bar" to 2, "xtc" to 4, args[1] to 6)
    println( readWriteMap )  // prints "1"
    //     println(readWriteMap["foo"])  // prints "1"
    val snapshot: Map<String, Int> = HashMap(readWriteMap)
    println(snapshot)
    println(args)
    println(args[1])
}
