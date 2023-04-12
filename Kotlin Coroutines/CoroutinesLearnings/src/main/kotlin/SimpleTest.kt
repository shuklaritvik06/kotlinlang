import kotlinx.coroutines.runBlocking
import org.junit.Test

class SimpleTest {
    @Test
    fun TestSuspending() = runBlocking{
        HelloFunc()
    }
}