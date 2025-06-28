import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(1)
    public void testStepOne() {
        System.out.println("Step 1");
        assertTrue(true);
    }

    @Test
    @Order(2)
    public void testStepTwo() {
        System.out.println("Step 2");
        assertTrue(true);
    }

    @Test
    @Order(3)
    public void testStepThree() {
        System.out.println("Step 3");
        assertTrue(true);
    }
}
