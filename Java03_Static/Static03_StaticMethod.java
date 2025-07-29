package Java03_Static;

public class Static03_StaticMethod {
    static String cmpName = "XYZ pvt ltd";
    String name = "Azmat alli khan";

    static void display() {// 1.Any method declared as static ,it is known as static method
        System.out.println("Company Name : "+cmpName);

        // System.out.println("Name is : "+name);// 2. Can't use instance variabel/non-static variable
        Static03_StaticMethod obj = new Static03_StaticMethod();
        System.out.println("Name is : "+obj.name); // 3. For instance variable we need object
        
        System.out.println("this is static display() method");
    }

    public Static03_StaticMethod() {
        System.out.println("I am the owner of StaticMethod-Constructor...");
    }

    public static void main(String[] args) {
       

        Static03_StaticMethod sm = new Static03_StaticMethod();
         /* A static method can be invoked without the need for creating an
         instance/Object of a class.*/
        display();
        // or
        // sm.display();
    }
}
