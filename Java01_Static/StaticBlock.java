package Java01_Static;

public class StaticBlock {
    static {
        System.out.println("this is static {} block it initialize before main method by JVM.");
    }
    public static void main(String[] args) {
        System.out.println("this is Main method..");
    }
}
