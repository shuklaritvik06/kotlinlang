import kotlinx.coroutines.*

suspend fun HelloFunc(){
    println("Hello")
}
fun main(){
    runBlocking {
        // Any Delay can happen , there is no such restriction
        val job:Job = launch {
            println("Child")
            delay(2000)
            println("I am after delay child")
        }
        val job2: Deferred<String> = async {
            println("Child ${Thread.currentThread().name}")
            delay(2000)
            println("I am after delay child ${Thread.currentThread().name}")
            "Hello"
        }
        println("Parent")
        // Waits for the above job to complete first then it will go further
        job.join()
        val result = job2.await()
        println(result)
        println("I am after delay parent")
    }
}