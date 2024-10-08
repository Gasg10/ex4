fun main(){
    println("Introduza um numero inteiro")
    val num1 = readln().toInt()
    if(num1 % 3 == 0 && num1 % 5 == 0){
        println("FizzBuzz");
    } else if(num1 % 3 == 0) {
        println("Fizz")
    } else if(num1 % 5 == 0){
        println("Buzz")
    }
}
