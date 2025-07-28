package Java02_Static;

public class StaticMethod {
    static void display(){
        System.out.println("this is static display() method");
    }
    public static void main(String[] args) {
        // A static method can be invoked without the need for creating an instance/Object of a class.
        display();

        //or
        
     /*   StaticMethod sm = new StaticMethod();
        sm.display(); */
    }
}
