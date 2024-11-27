public class MethodCallExample
{
//user-defined static method
static void showMessage()
{
System.out.println("The static method invoked.");
}
//user-defined non-static method
void displayMessage()
{
System.out.println("Non-static method invoked.");
}
public static void main(String[] args)
{
    showMessage(); //called method
    //creating an object of the class
    MethodCallExample me=new MethodCallExample();
    //calling non-static method
    me.displayMessage(); //called method
    }
    }