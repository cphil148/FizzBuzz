

class FizzBuzz {


    fun compute(number: Int): String {

        return when {
            isDivisibleByThreeAndFive(number) -> "FizzBuzz"
            isDivisibleByThree(number) -> "Fizz"
            isDivisibleByFive(number) -> "Buzz"
            else -> number.toString()
        }
    }

    private fun isDivisibleByThreeAndFive(number: Int) = isDivisibleByThree(number) && isDivisibleByFive(number)

    private fun isDivisibleByFive(number: Int) = number % 5 == 0

    private fun isDivisibleByThree(number: Int) = number % 3 == 0

}