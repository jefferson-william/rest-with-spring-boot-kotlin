import br.com.kotlin.domain.service.MathService
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MathServiceTest {
    private var mathService = MathService()

    @BeforeEach
    fun setUp() {}

    @Test
    fun sum() {
        assertEquals(10.0, mathService.sum(5.0, 5.0))
    }

    @Test
    fun subtraction() {
        assertEquals(0.0, mathService.subtraction(5.0, 5.0))
    }

    @Test
    fun multiplication() {
        assertEquals(4.0, mathService.multiplication(2.0, 2.0))
    }

    @Test
    fun division() {
        assertEquals(2.0, mathService.division(10.0, 5.0))
    }

    @Test
    fun average() {
        assertEquals(7.5, mathService.average(10.0, 5.0))
    }

    @Test
    fun square() {
        assertEquals(3.1622776601683795, mathService.square(10.0))
    }
}