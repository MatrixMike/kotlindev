/**
* Created by www.tutorialkart.com
* main function in kotlin example program
https://www.tutorialkart.com/kotlin/main-function-in-kotlin/
*/
 
fun main() { // was fun main(args: Array)
    val user1 = User(name="Yogi", age=27)
    printUser(user1)
    
        var daysOfWeek = listOf("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")
    for((index,day) in daysOfWeek.withIndex()){
        println("$index :$day")
    } 
    
    var nums = listOf(25, 54, 68, 72)
    for((index,num) in nums.withIndex()){
        println(index.toString()+" - "+num)
    } 
}
 
fun printUser(user: User){
    println(user)
}
 
data class User(val name: String, val age: Int); 


// see also https://www.tutorialkart.com/kotlin/kotlin-for-loop/
