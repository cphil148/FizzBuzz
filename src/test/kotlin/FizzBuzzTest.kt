import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class FizzBuzzTest{

    @Test
    fun `fizzbuzz should return one when given one`() {
        val fizzbuzz = FizzBuzz()

        assertThat(fizzbuzz.compute(1)).isEqualTo("1")
    }
    @Test
    fun `fizzbuzz should return two when given two`() {
        val fizzbuzz = FizzBuzz()

        assertThat(fizzbuzz.compute(2)).isEqualTo("2")
    }
}