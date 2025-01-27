import br.com.kotlin.domain.service.NumberService
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class NumberServiceTest {
    private var numberService = NumberService

    @BeforeEach
    fun setUp() {}

    @Test
    fun convertToDouble() {
        assertEquals(10.0, numberService.convertToDouble("10"))
        assertEquals(10.0, numberService.convertToDouble("10.0"))
    }

    @Test
    fun isNumeric() {
        assertEquals(true, numberService.isNumeric("10"))
        assertEquals(true, numberService.isNumeric("10.0"))
        assertEquals(false, numberService.isNumeric("A"))
        assertEquals(false, numberService.isNumeric(null))
    }
}