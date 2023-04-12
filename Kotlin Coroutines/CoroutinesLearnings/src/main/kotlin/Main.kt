import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

suspend fun SuspendThis(time: Long){
    delay(time)
}

fun main(args: Array<String>) {
    println("Main thread started ${Thread.currentThread().name}")
    // Creates a coroutine that does not block the main thread
    GlobalScope.launch {
        println("Background work start ${Thread.currentThread().name}")
        delay(2000)
        println("Background work finish ${Thread.currentThread().name}")
    }
    thread {
        println("Background work start ${Thread.currentThread().name}")
        Thread.sleep(2000)
        println("Background work finish ${Thread.currentThread().name}")
    }
    // This blocks the main thread in which it operates
    runBlocking {
        SuspendThis(2000)
    }
    println("Main thread ended ${Thread.currentThread().name}")
}