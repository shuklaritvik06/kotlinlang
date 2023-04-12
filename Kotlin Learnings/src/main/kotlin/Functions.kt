fun main(){
    Hello()
    Sum(1,2)
    println(Factorial(3))
    val result = HighOrderFunction(4,5,::sum)
    println(result)
    val func = operation()
    println( func(4) )
    val res = Hey()
    println(res(1,5))
    var lambdafunc = { str:String -> str.uppercase()}
    println(lambdafunc("Ramesh"))
    println(HelloBroReturningLambda()(1,2))
    myFunction { println("Jello") }
}
fun Hello(): String{
    println("Hello World!")
    return "Hello"
}
fun Sum(a:Int, b:Int): Unit{
    println(a+b)
}
fun Factorial(a: Int): Int{
    if (a<=1){
        return 1
    }
    else{
        return a*Factorial(a-1)
    }
}
fun sum(a: Int, b: Int) = a + b

fun HighOrderFunction(a: Int, b:Int,operation: (Int,Int)->Int): Int {
    return operation(a, b)
}

fun square(x: Int) = x * x

fun operation(): (Int)->Int{
    return ::square
}
fun getRange(a:Int,b:Int) = (a..b).sum()
fun Hey(): (Int,Int)->Int{
    return ::getRange
}
// Returning a Lambda Function
fun HelloBroReturningLambda(): (Int,Int)->Int{
    return { a:Int,b:Int -> a+b }
}
// Inline Function
inline fun myFunction(function:()->Unit){
    function()
}