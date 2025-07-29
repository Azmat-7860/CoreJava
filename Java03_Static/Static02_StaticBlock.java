package Java03_Static;

public class Static02_StaticBlock {
    static {// 1. Is used to initialize the static data member.
            // 2.it is execute before the Main method even we can say before object creation
        System.out.println("I am the owner of the Static block..");
    }
    static {
        // 3.We can difine more than one static block/initializer.
        System.out.println("2nd static block invoked");
        System.exit(0);// JVM terminate the program here
    }

    // Constructor
    Static02_StaticBlock() {
        System.out.println("I am the owner of the Constructor...");
    }

    public static void main(String[] args) {
        Static02_StaticBlock obj1 = new Static02_StaticBlock();
    }
}
