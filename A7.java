// Define the Printable interface
interface Printable {
    void print();
}

// Define the Showable interface
interface Showable {
    void show();
}

// Class A7 implements both Printable and Showable interfaces
class A7 implements Printable, Showable {
    // Implement the print method from the Printable interface
    public void print() {
        System.out.println("Hello NCER");
    }

    // Implement the show method from the Showable interface
    public void show() {
        System.out.println("Welcome to NCER");
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        A7 obj = new A7(); // Create an object of class A7
        obj.print();       // Call the print method
        obj.show();        // Call the show method
    }
}
