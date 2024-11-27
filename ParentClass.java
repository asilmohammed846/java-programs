// package mypackage;
public class ParentClass {
public void publicMethod() {
System.out.println("This is a public1 method.");
}

public void protectedMethod() {
    System.out.println("This is a protected1 method.");
    }
    public void privateMethod() {
    System.out.println("This is a private1 method.");
    }
    void defaultMethod1() {
    System.out.println("This is a default1 (package-private) method.");}

    public void callPrivateMethod() {
        System.out.println("Calling the private method within the class:");privateMethod(); // Private method called internally
        }
        }
