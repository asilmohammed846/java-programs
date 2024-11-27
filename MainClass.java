// package test;
// import ParentClass;
// import ChildClass;
public class MainClass {
public static void main(String[] args) {
ParentClass parent = new ParentClass();
ChildClass child = new ChildClass();
// Access methods via ParentClass object
System.out.println("Testing access via ParentClass:");

parent.publicMethod(); // Accessible
parent.protectedMethod(); // Error: Not accessible outside package
parent.privateMethod(); // Error: Not accessible
parent.defaultMethod1(); // Error: Not accessible outside packageparent.callPrivateMethod(); // Works (indirectly calls privatemethod)
// Access methods via ChildClass object
System.out.println("\nTesting access via ChildClass:");
child.publicMethod(); // Accessible
child.testInheritedMethods(); // Tests inherited methods
}
}