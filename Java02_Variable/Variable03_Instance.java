package Java02_Variable;

public class Variable03_Instance {

    //1.Variable declared within the class and outside the method,constructor,block,is known as Instance variable.
    String carName = "Bimmer"; // Instance variable
    String carColour ;// 2.Instance variables are automatically initialized by JVM.
   
    static {
        String model = "M4"; // Local variable to static block
        System.out.println("Car Model : " + model);
        // System.out.println(carName); 3.❌ Cannot access instance variable directly
    }

    public static void main(String[] args) {
        Variable03_Instance obj = new Variable03_Instance();
        System.out.println("Car Name: " + obj.carName+ " & Colour : "+obj.carColour); // Access via object
    }
}
