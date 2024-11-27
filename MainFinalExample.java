// Class demonstrating a final variable
class FinalVariableExample {
    final int MAX_SPEED = 120; // Final variable

    void displayMaxSpeed() {
        System.out.println("The maximum speed is: " + MAX_SPEED);
    }
}

// Parent class with a final method
class Vehicle {
    final void showVehicleType() {
        System.out.println("This is a vehicle.");
    }

    void start() {
        System.out.println("Vehicle is starting.");
    }
}

// Child class of Vehicle
class Car extends Vehicle {
    // This method cannot override the final method in Vehicle
    // Uncommenting the below will cause a compilation error:
    // @Override
    // void showVehicleType() {
    //     System.out.println("This is a car.");
    // }

    @Override
    void start() {
        System.out.println("Car is starting with a key.");
    }
}

// Final class demonstration
final class Bike {
    void ride() {
        System.out.println("Bike is being ridden.");
    }
}

// Uncommenting the below will cause a compilation error
// class SportsBike extends Bike {
//     // Error: Cannot inherit from final class
// }

public class MainFinalExample {
    public static void main(String[] args) {
        // Final variable demonstration
        FinalVariableExample finalVar = new FinalVariableExample();
        finalVar.displayMaxSpeed();

        // Final method demonstration
        Vehicle myCar = new Car();
        myCar.showVehicleType(); // Calls final method from Vehicle class
        myCar.start();           // Calls overridden method in Car class

        // Final class demonstration
        Bike myBike = new Bike();
        myBike.ride();
    }
}
