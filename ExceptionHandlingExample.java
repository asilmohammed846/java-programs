import java.util.Scanner;
public class ExceptionHandlingExample {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
try {
// Step 1: Read inputs
System.out.print("Enter a numerator: ");
int numerator = scanner.nextInt();
System.out.print("Enter a denominator: ");
int denominator = scanner.nextInt();
// Step 2: Perform division
int result = numerator / denominator;
System.out.println("Result: " + result);
}
catch (ArithmeticException e)
{
// Step 3: Handle specific exception
System.out.println("Error: Division by zero is not allowed.");
}
catch (Exception e)
{
    // Handle any other exceptions
    System.out.println("Error: An unexpected error occurred - " + e.getMessage());
    } finally {
    // Step 4: Execute cleanup code
    System.out.println("Finally block executed: Closing resources.");
    scanner.close();
    }
    System.out.println("Program continues...");
    }
    }