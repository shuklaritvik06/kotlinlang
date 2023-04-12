import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import kotlinx.coroutines.withTimeoutOrNull

fun main(){
    runBlocking {
        withTimeout(10){
        try {
            for (i in 0..10000){
                println("$i.")
            }
        }catch (ex: TimeoutCancellationException){
            println("Exception: ${ex.message}")
        }
        }
        val result:String? = withTimeoutOrNull(10){
            for (i in 0..10000){
                println("$i.")
            }
            "Hello"
        }
        println(result)
    }
}