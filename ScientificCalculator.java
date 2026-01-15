public class ScientificCalculator {

    public double raiseToPower(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public int modulo(int number, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        return number % divisor;
    }
}
