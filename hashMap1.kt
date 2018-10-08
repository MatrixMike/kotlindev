import java.util.*

fun main(args: Array<String>) {
    val map: HashMap<Int, String> = hashMapOf(1 to "x", 2 to "y", -1 to "zz")
    println(map.size)     // isEmpty()
    println(map) // {-1=zz, 1=x, 2=y}
    map.put(6,"six")
    println(map.size)     // isEmpty()
    println(map)
}
