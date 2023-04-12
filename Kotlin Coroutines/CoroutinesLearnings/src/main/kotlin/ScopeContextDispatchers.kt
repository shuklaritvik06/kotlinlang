import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        println("$this")
        println(coroutineContext)
        launch {
            // Dispatcher decided the thread of the coroutine
            println("$this")
            println("${Thread.currentThread().name}")
            delay(2000)
            println("${Thread.currentThread().name}")
        }
        // Without params it will inherit the context of the parent
        // If the param is default dispatcher, similar to GlobalScope.launch
        launch(Dispatchers.Default) {
            println("${Thread.currentThread().name}")
            delay(2000)
            println("${Thread.currentThread().name}")
        }
        // Immediate parent
        launch{
            launch(Dispatchers.Unconfined) {
                println("${Thread.currentThread().name}")
                delay(2000)
                println("${Thread.currentThread().name}")            }
        }
    }
}