import org.junit.Test
import kotlin.test.assertEquals

class FizzBuzzTest{
     @Test
     fun  `returns 1 when recives 1`(){
          var fizzBuzz = FizzBuzz()
          assertEquals("1", fizzBuzz.perform(1))
     }

     @Test
     fun `returns 2 when recives 2`(){
          var fizzBuzz = FizzBuzz()
          assertEquals("2", fizzBuzz.perform(2))
     }

     @Test
     fun `returns 3 when recives 3`(){
          var fizzBuzz = FizzBuzz()
          assertEquals("Fizz", fizzBuzz.perform(3))
     }

}