import static org.junit.Assert.*;
import org.junit.Test;

public class TestPower {
    @Test
    public void testPowerCalculation() {
        ScientificCalculator calc = new ScientificCalculator();
        double result = calc.raiseToPower(2.0, 3.0);

        assertEquals(8.0, result, 0.001);

        System.out.println(">>> Power Calculation Test: PASSED SUCCESSFULLY <<<");
    }
}
