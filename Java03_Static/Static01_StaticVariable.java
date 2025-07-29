package Java03_Static;

public class Static01_StaticVariable {

    // Static variable (shared by all objects)
    static String cmpName = "XYZ pvt ltd"; // 1.Declare as static ,static variable

    // Instance variables (unique for each object)
    String name = "Azmat alli khan";
    int regsNum = 9999987;

    Static01_StaticVariable() {
       
        /*
         * static String cmpNme = "XYZ pvt ltd"; // 2.we can't make static variable inside
         * local scope(inside method,constructor,loop)
         */

        // 3.we can use Static variable both inside Local and instance scope.
     
        System.out.println(
                "Company Name : " + cmpName + " ,Employee Name :" + name + " & Registration Number : " + regsNum);
    }

    public static void main(String[] args) {
        Static01_StaticVariable obj = new Static01_StaticVariable();
        // 4.we can access the static variable "cmpName" through obj or directly class name
        obj.cmpName = "ABC pvt ltd";
        Static01_StaticVariable.cmpName = "IOU pvt ltd";
        System.out.println("I'm the owner of Main method..");
    }
}
