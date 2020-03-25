import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class FizzBuzzTest{

    val fizzbuzz = FizzBuzz()

    @Test
    fun `If a number is not divisible by 3 or 5, print the number`() {
        assertThat(fizzbuzz.compute(1)).isEqualTo("1")
        assertThat(fizzbuzz.compute(2)).isEqualTo("2")
    }

    @Test
    fun `fizzbuzz should return fizz when given 3`() {
        assertThat(fizzbuzz.compute(3)).isEqualTo("Fizz")
    }
}