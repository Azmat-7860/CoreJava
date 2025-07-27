package Java01_Static;

public class StaticBlock02 {
    static{// this will execute before the constructor even we can say before object creation
        System.out.println("I am the owner of the Static block..");
    }
    StaticBlock02(){
        System.out.println("I am the owner of the Constructor...");
    }
    public static void main(String[] args) {
        StaticBlock02 obj1 = new StaticBlock02();
        StaticBlock02 obj2 = new StaticBlock02();

    }
}
