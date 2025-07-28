import java.util.Arrays;

public class Basic03_Datatype {
    /*  Datatype specifies the "type & size" of the values that can be stored in variable
        --> Java Datatype mainly 2 types : (Discuss later)
                i.Primitive data type (short,byte,int,long,float,double,char,boolean)
                ii.Non-Primitive data type (String, Array,class etc...)
    */
    public static void main(String[] args) {
        int age = 34; //integer data type
        boolean  isPass = true; //boolean value

        int[] marks = {87,98,77,58}; // integer type of array
        String name = "Azmat alli khan";

        // we can print in console using "System.out.println()"
        System.out.println("Name is : "+name);
        System.out.println("age : " + age);
        System.out.println("Marks are : " +Arrays.toString(marks));
        System.out.println("Am i pass : "+ isPass);

    }
}
