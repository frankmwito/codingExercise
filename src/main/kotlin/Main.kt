fun main(){
    var num1: Int  // Declare num1 as an Int variable
    var num2: Int  // Declare num2 as an Int variable

    println("Enter the first number!")
    num1 = readlnOrNull()?.toInt()!!
    println("Enter the second number!")
    num2 = readlnOrNull()?.toInt()!!

    val result= num1 + num2
    println("the answer is $result")

    if (result>100){
        println("wassup motherfucker")
    }
    else{
        println("You are not succecsful")
    }
    println("Enter any operation of choice,(-, *, %, /):")
    val operation = readLine()
    when(operation){
        '+'.toString() -> println("$num1 + $num2 = ${num1 + num2}")
        '-'.toString() -> println("$num1 - $num2 = ${num1 - num2}")
        '*'.toString() -> println("$num1 * $num2 = ${num1 * num2}")
        '/'.toString() -> {
            if (num2 == 0) {
                println("Error: Cannot divide by zero")
            } else {
                println("$num1 / $num2 = ${num1 / num2}")
            }
        }
        '%'.toString() -> println("$num1 % $num2 = ${num1 % num2}")
        else -> println("Invalid operation")
    }
    fun youmadeit(name:String ="frank",age:Int=22):Any{
println(" $name you made it at only $age")
        return Unit
    }
    println(youmadeit())
}