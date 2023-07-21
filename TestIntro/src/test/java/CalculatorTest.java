import com.qa.calc.Calculator;
import org.junit.jupiter.api.*;


public class CalculatorTest {
    int num = 1;
    Calculator calc = new Calculator();
    Calculator calcTwo = new Calculator(num);



    @BeforeAll
    public static void init(){
        System.out.println("Before all");
    }

    @BeforeEach
    public void setUp(){
        System.out.println("Before each");
    }


    @Test
    public void constructorTest() {
        Assertions.assertTrue(calc instanceof Calculator);
        Assertions.assertTrue(calcTwo instanceof Calculator);
    }

    @Test
    public void addTest() {
        Assertions.assertEquals(calc.add(1, 2), 3);
    }


    @AfterAll
    public static void closure(){
        System.out.println("After all");
        // Typically close down resources that were required by test
    }

    @AfterEach
    public void tearDown(){
        System.out.println("After each");
    }

}