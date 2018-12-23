import org.junit.Test
import kotlin.test.assertEquals

class FizzBuzzTest{
     var fizzBuzz = FizzBuzz()

     @Test
     fun  `returns 1 when recives 1`(){
          assertEquals("1", fizzBuzz.perform(1))
     }

     @Test
     fun `returns 2 when recives 2`(){
          assertEquals("2", fizzBuzz.perform(2))
     }

     @Test
     fun `returns 3 when recives 3`(){
          assertEquals("Fizz", fizzBuzz.perform(3))
     }

     @Test
     fun `returns 4 when recives 4`(){
          assertEquals("Fizz", fizzBuzz.perform(3))
     }

     @Test
     fun `returns Buzz when recives 5`(){
          assertEquals("Buzz", fizzBuzz.perform(5))
     }

     @Test
     fun `returns Fizz when recives 6`(){
          assertEquals("Fizz", fizzBuzz.perform(6))
     }

     @Test
     fun `returns Fizz when recives 9`(){
          assertEquals("Fizz", fizzBuzz.perform(9))
     }

     @Test
     fun `returns Buzz when recives 10`(){
          assertEquals("Buzz", fizzBuzz.perform(10))
     }

     @Test
     fun `returns FizzBuzz when recives 45`(){
          assertEquals("FizzBuzz", fizzBuzz.perform(45))
     }

     @Test
     fun `returns FizzBuzz when recives 15`(){
          assertEquals("FizzBuzz", fizzBuzz.perform(15))
     }
}