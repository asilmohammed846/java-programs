class BlockInitializerExample {
    // Static initializer block
    static {
    System.out.println("NCERs Static block executed: Class is loaded.");}
    // Instance initializer block
    {
    System.out.println("NCERs Instance block executed: Object is beingcreated.");
    }
    // Constructor
    public BlockInitializerExample() {
    System.out.println(" NCERs Constructor executed: Object is fullyinitialized.");
    }
    }

public class MainBlockInitializer {
    public static void main(String[] args) {
        System.out.println("NCERs Main method starts.");
// Create the first object
System.out.println(" \n NCERs Creating first object:");
BlockInitializerExample obj1 = new BlockInitializerExample();
// Create the second object
System.out.println("\n NCERs Creating second object:");
BlockInitializerExample obj2 = new BlockInitializerExample();
System.out.println("\n NCERs Main method ends.");
}
}