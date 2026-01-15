import static org.junit.Assert.*;
import org.junit.Test;

public class TestModulo {
    @Test
    public void testModuloCalculation() {
        ScientificCalculator calc = new ScientificCalculator();
        int result = calc.modulo(10, 3);

        assertEquals(1, result);

        System.out.println(">>> Modulo Calculation Test: PASSED SUCCESSFULLY <<<");
    }
}
