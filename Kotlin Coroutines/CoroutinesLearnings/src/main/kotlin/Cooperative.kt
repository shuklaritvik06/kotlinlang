import kotlinx.coroutines.*

fun main(){
    runBlocking {
        val job: Job = launch(Dispatchers.Default) {
            try {
                for (i in 0..500){
                    if (!isActive){
//                    break
                        return@launch
                    }
                    println("$i")
//                delay(100)
                    Thread.sleep(100)
                    yield()
                }
            }catch (ex: CancellationException){
                println("Exception caught ${ex.message}")
            }finally {
                withContext(NonCancellable){
                    delay(1000)
                }
                println("Finally!")
            }
        }
        delay(10)
        job.cancel(CancellationException("This is cancelled!"))
        job.join()
//        job.cancelAndJoin()
    }
}