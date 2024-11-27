class Animal {
    // Method in parent class
    public void makeSound() {
    System.out.println("Animal makes a sound");
    }
    // Additional method in parent class
    public void sleep() {
    System.out.println("Animal is sleeping");
    }
    }
    // Child class inherits from Animal
    class Dog extends Animal {
    // Overriding method of parent class
    @Override
    public void makeSound() {
    System.out.println("Dog barks");
    }
    // Unique method in child class
    public void fetch() {
    System.out.println("Dog is fetching the ball");
    }
    }

    // Main class to run the program
