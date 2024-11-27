class StaticBindingExample {
    // Step 1: Define a static method
    static void display() {
    System.out.println("Static Binding: display() method in StaticBindingExample class");
    }
    // Step 2: Define an overloaded method (compile-time binding)
    void show(int number) {
    System.out.println("Static Binding: show(int) method, number = " + number);
    }
    void show(String text) {
    System.out.println("Static Binding: show(String) method, text = " + text);
    }
    }
    public class StaticBindingDemo {
        public static void main(String[] args) {
            // Step 3: Call static method using class name
StaticBindingExample.display();
// Step 4: Create an instance of StaticBindingExample
StaticBindingExample example = new StaticBindingExample();
// Step 5: Call overloaded methods
example.show(10); // Calls show(int) method
example.show("Hello"); // Calls show(String) method
}
}