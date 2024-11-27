class SuperClass {
    // Step 1: Define a method in superclass
    void display() {
    System.out.println("Dynamic Binding: display() method in SuperClass");
    }
    }
    class SubClass extends SuperClass {
    // Step 2: Override the method in subclass
    @Override
    void display() {
    System.out.println("Dynamic Binding: display() method in SubClass");
    }
    }

    public class DynamicBindingDemo {
        public static void main(String[] args) {
        // Step 3: Create a reference of SuperClass pointing to SubClass
        SuperClass obj = new SubClass();
        // Step 4: Call the overridden method
        obj.display(); // This will call the display() method in SubClass
        }
        }