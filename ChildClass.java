// package mypackage;

public class ChildClass extends ParentClass {
    public void testInheritedMethods() {
    publicMethod(); // Accessible
    protectedMethod(); // Accessible (inherited)
    // privateMethod1(); // Error: Not accessible
    defaultMethod1(); // Accessible (same package)
    }
    }