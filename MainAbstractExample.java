// Abstract class Animal
abstract class Animal {
    // Abstract method (does not have a body)
    abstract void sound();

    // Regular method
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass of Animal class Dog
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The dog barks: Woof Woof!!!!!!!!!!!!");
    }
}

// Subclass of Animal class Cat
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("The cat meows: Meow Meow……….!");
    }
}

public class MainAbstractExample {
    public static void main(String[] args) {
        // Cannot instantiate abstract class
        // Animal animal = new Animal(); // Error

        // Create objects of Dog and Cat
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Call methods
        dog.sound();  // Output: The dog barks: Woof Woof!!!!!!!!!!!!
        dog.eat();    // Output: This animal eats food.

        cat.sound();  // Output: The cat meows: Meow Meow……….!
        cat.eat();    // Output: This animal eats food.
    }
}
