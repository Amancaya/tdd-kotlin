class FizzBuzz{
    fun perform(number: Int) :String {
        if (isDivisible(number, 3) && isDivisible(number, 5)) return "FizzBuzz"
        if (isDivisible(number, 3)) return "Fizz"
        if (isDivisible(number, 5)) return "Buzz"
        return number.toString()
    }

    private fun isDivisible(dividend: Int, divisor: Int) = dividend % divisor == 0
}