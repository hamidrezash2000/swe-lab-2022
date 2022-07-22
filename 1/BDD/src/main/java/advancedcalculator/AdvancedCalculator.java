package advancedcalculator;

public class AdvancedCalculator {
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        return Math.floorDiv(a, b);
    }
    public int power(int a, int b) {
        return (int) Math.pow(a, b);
    }
    public int calculate(int a, int b, char opt) throws Exception {
        switch (opt) {
            case '*':
                return this.multiply(a, b);
            case '/':
                return this.divide(a, b);
            case '^':
                return this.power(a, b);
            default:
                throw new Exception("Invalid opt");
        }
    }
}
