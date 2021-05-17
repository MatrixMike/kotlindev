fun main(args: Array<String>) {
    val a = 6
    val b = 0
    var c : Int
 
    try {
        c = a/b
    } catch (e : Exception){
        println("Exception is handled.")
    }
} 
