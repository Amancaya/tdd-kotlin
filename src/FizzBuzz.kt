class FizzBuzz{
    var result = ""
    fun perform(number: Int) :String {

        verifyFizz(number)
        verifyBuzz(number)
        verifyAnother(number)
        return result
    }

    private fun verifyAnother(number: Int) {
        if (result.isEmpty())
            result = number.toString()
    }

    private fun verifyBuzz(number: Int) {
        if (isDivisible(number, 5)) result += "Buzz"
    }

    private fun verifyFizz(number: Int) {
        if (isDivisible(number, 3)) result += "Fizz"
    }

    private fun isDivisible(dividend: Int, divisor: Int) = dividend % divisor == 0
}