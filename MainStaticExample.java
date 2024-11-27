class StaticExample {
    static int counter = 0; // Static variable
    // Static block
    static {
    System.out.println("Static block executed.");
    }
    // Static method
    static void incrementCounter() {
    counter++;
    System.out.println("Counter incremented to: " + counter);
    }
    // Instance method
    void displayCounter() {
    System.out.println("Counter value: " + counter);
    }
    }

    public class MainStaticExample {
        public static void main(String[] args) {
        // Call static method without object
        StaticExample.incrementCounter();
        StaticExample.incrementCounter();
        // Create an object and access instance method
        StaticExample obj = new StaticExample();
        obj.displayCounter();
        }
        }