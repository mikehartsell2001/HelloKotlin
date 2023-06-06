
var name: String = " mike "
var greeting: String? = null
var strVar: String? = " a string "

fun main(args: Array<String>) {
    //below is an if statement
    if(greeting!=null) {
        println("if statement executed")
    }else{
        println("else statements executed")
    }
    //below is a when statement
    when(greeting){
        null -> println("when null statement executed")
        else -> println("when else statement executed")
    }
    // assigning values using if statements
    val valIf = if(greeting!=null)"val if executed" else "val else executed"
    println(valIf)
    // assigning values using when statements
    val valWhen = when(greeting){
        null-> println("when null executed")
        else-> println("when else executed")
    }

}