public class OperatorsAndPromotion {
    public static void main(String[] args) {
        // Part 1: Operators
        System.out.println("Part 1: Demonstrating Operators");

        int a = 10, b = 20;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\nRelational Operators:");
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));

        System.out.println("\nLogical Operators:");
        boolean x = true, y = false;
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + (!x));

        System.out.println("\nAssignment Operators:");
        int c = 5;
        c += 10; // c = c + 10
        System.out.println("c += 10 -> c = " + c);
        c *= 2; // c = c * 2
        System.out.println("c *= 2 -> c = " + c);

        System.out.println("\nPart 2: Demonstrating Arithmetic Promotion");

        byte byteVal = 10;
        short shortVal = 20;
        int intVal = 30;
        float floatVal = 40.5f;
        double doubleVal = 50.25;

        int result1 = byteVal + shortVal; // byte and short promote to int
        System.out.println("byte + short = " + result1 + " (int)");
        double result2 = intVal + doubleVal; // int promotes to double
        System.out.println("int + double = " + result2 + " (double)");
        float result3 = floatVal * intVal; // int promotes to float
        System.out.println("float * int = " + result3 + " (float)");
        double result4 = byteVal / 3.0; // byte promotes to double
        System.out.println("byte / double = " + result4 + " (double)");
    }
}

