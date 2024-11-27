public class MathOperations {
    // Method to find the absolute value
    public int absoluteValue(int a) {
    return Math.abs(a);
    }
    // Method to find the maximum of two numbers
    public int maxOfTwo(int a, int b) {
    return Math.max(a, b);
    }
    // Method to find the minimum of two numbers
    public int minOfTwo(int a, int b) {
    return Math.min(a, b);
    }

    // Method to calculate the power of a number (a^b)
public double power(double base, double exponent) {
    return Math.pow(base, exponent);
    }

    public double squareRoot(double a) {
        return Math.sqrt(a);
        }
        // Method to calculate the sine of an angle in degrees
        public double sineOfAngle(double angleDegrees) {
        return Math.sin(Math.toRadians(angleDegrees));
        }
        // Method to calculate the cosine of an angle in degrees
        public double cosineOfAngle(double angleDegrees) {
        return Math.cos(Math.toRadians(angleDegrees));
        }

// Method to calculate a random number between 0 and 1
public double randomValue() {
    return Math.random();
    }
    // Method to round a number to the nearest integer
    public long roundValue(double a) {
    return Math.round(a);

}
// Method to get the floor value of a number
public double floorValue(double a) {
return Math.floor(a);
}
// Method to get the ceiling value of a number
public double ceilValue(double a) {
return Math.ceil(a);
}
}