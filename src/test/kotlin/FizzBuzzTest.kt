import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class FizzBuzzTest{

    val fizzbuzz = FizzBuzz()

    @Test
    fun `fizzbuzz should return fizz when given a number divisible by 3`() {
        assertThat(fizzbuzz.compute(3)).isEqualTo("Fizz")
        assertThat(fizzbuzz.compute(6)).isEqualTo("Fizz")
    }

    @Test
    fun `If a number is divisible by 5, print Buzz`() {
        assertThat(fizzbuzz.compute(5)).isEqualTo("Buzz")
        assertThat(fizzbuzz.compute(10)).isEqualTo("Buzz")
    }

    @Test
    fun `If a number is divisible by both 3 and 5, print FizzBuzz`() {
        assertThat(fizzbuzz.compute(15)).isEqualTo("FizzBuzz")
        assertThat(fizzbuzz.compute(30)).isEqualTo("FizzBuzz")
    }

    @Test
    fun `If a number is not divisible by 3 or 5, print the number`() {
        assertThat(fizzbuzz.compute(1)).isEqualTo("1")
        assertThat(fizzbuzz.compute(2)).isEqualTo("2")
    }
}
