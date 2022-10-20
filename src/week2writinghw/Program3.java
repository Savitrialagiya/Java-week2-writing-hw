package week2writinghw;
/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Program3 {
    //Declare one instance and one static variable.
    String name = "Prime";
    static String surName = "Testing";

    //Declare one instance method
    //3.4 Call both instance and static variables into both instance and static methods inside the print statement.
public void instanceMethod(){
    System.out.println(name);
    System.out.println(Program3.surName);
}
//3.3 Declare one static method.
// 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
public static void staticMethod(){
    Program3 program3 = new Program3();
    System.out.println(program3.name);
    System.out.println(surName);
}
    //3.5 Declare the Main method.
    //3.6 Call both instance and static methods into the Main method and run the programme.
    public static void main(String[] args) {
        Program3 program3 = new Program3();
        program3.instanceMethod();
        staticMethod();

    }
}

