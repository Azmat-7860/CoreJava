package Java02_Variable;

public class Variable02_Local {
    // 1. Those variable declare inside Local scope(inside mehod,constructor,block),
    // is known as local variable
    static String cmpName;

    public static void main(String[] args) {
        // Local variable bcz inside the method & it destroy when method finshed
        String name = "Azmat alli khan";
        int age;
        // System.out.println(age);// 2.JVM not automatically initialize static variable
        System.out.println(cmpName);// JVM bydefault initialize static variable

        for (int i = 0; i < 5; i++) {
            String greet = "Hello";// 3.local scope to loop it destroy when loop is completed
            System.out.println(greet + " Mr/Mrs " + name + " Nice to meet you..");
        }
    }

}
