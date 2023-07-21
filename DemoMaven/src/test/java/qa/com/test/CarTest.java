package qa.com.test;


import com.qa.main.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

     Car car = new Car();

    @Test
    public void carConstructorTest(){
        Assertions.assertTrue(car instanceof Car);
    }


    @Test
    public void testTwo(){
        Assertions.assertEquals(1, 1 );    }
}
