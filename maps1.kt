import java.util.*
    val readWriteMap: HashMap< String, Int > = hashMapOf("foo" to 1, "bar" to 2)
    println( readWriteMap )  // prints "1"
    //     println(readWriteMap["foo"])  // prints "1"
    val snapshot: Map<String, Int> = HashMap(readWriteMap)
