import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main(){
    runBlocking {
        val time = measureTimeMillis {
            val messageOne = async(start = CoroutineStart.LAZY) {
                getMessageOne()
            }
            val messageTwo = async(start = CoroutineStart.LAZY) {
                getMessageTwo()
            }
            println("${messageOne.await()} ${messageTwo.await()}")
         }
        println(time)
    }
}
suspend fun getMessageOne():String{
    delay(1000)
    return "Hello"
}
suspend fun getMessageTwo():String{
    delay(1000)
    return "Hello"
}