package Week2Writing;
/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Programme4 {
    //4.1 Declare two instance and two static variables.
    // instance variable
    String Name = "Prime";
    String Surname = "Testing";
    //static variable
    static boolean a = true;
    static boolean b = false;
    //Declare one instance method
    //Call all four instance and static variable into the instance method inside the print statement
    public void instanceMethod(){
        Programme4 programme4 = new Programme4();
        System.out.println(programme4.a);
        System.out.println(programme4.b);
        System.out.println(Name);
        System.out.println(Surname);

    }
    //Declare one static Method.
    //Call all instance and static variable into the static Method inside the print statement.
    public static void staticMethod(){
        Programme4 programme4 = new Programme4();
        System.out.println(a);
        System.out.println(b);
        System.out.println(programme4.Name);
        System.out.println(programme4.Surname);
    }
    // Declare one main Method.
    // Call both instance and static methods into the Main Method and run the programme
    public static void main(String[] args) {
        Programme4 programme4 = new Programme4();
        programme4.instanceMethod();
        staticMethod();
    }
}
