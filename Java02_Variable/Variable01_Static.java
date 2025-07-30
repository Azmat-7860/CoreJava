package Java02_Variable;

public class Variable01_Static {

    // 1.Declare as static ,static variable
    static String cmpName = "XYZ pvt ltd";  // Static variable (shared by all objects)

    // Instance variables (unique for each object)
    String name = "Azmat alli khan";
    int regsNum = 9999987;

    Variable01_Static() {
       
        /*
         * static String cmpNme = "XYZ pvt ltd"; // 2.we can't make static variable inside
         * local scope(inside method,constructor,loop)
         */

        // 3.we can use Static variable both inside Local and instance scope.
     
        System.out.println(
                "Company Name : " + cmpName + " ,Employee Name :" + name + " & Registration Number : " + regsNum);
    }

    public static void main(String[] args) {
        Variable01_Static obj = new Variable01_Static();
        // 4.we can access the static variable "cmpName" through obj or directly class name
        obj.cmpName = "ABC pvt ltd";
        Variable01_Static.cmpName = "IOU pvt ltd";
        System.out.println("I'm the owner of Main method..");
    }
}
