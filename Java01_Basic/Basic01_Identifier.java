import java.time.LocalDate;

public class Basic01_Identifier {
    /*
     A name in java programm is IDENTIFIER..
      --> It may be class name, method name, variable name
       The only allowed characters in java identifiers are:
            1) a to z 
            2) A to Z 
            3) 0 to 9 
            4) _(underscore) and $ (if we use another symbols we get error)
        RULE.
        i. we can't use java keyword,predifind class,interface
        ii. identifier can't start with number
        iii.space not allowed
     */
    static void printDate() {
        LocalDate date = LocalDate.now();
        System.out.println("Date is :" + date);
    }

    public static void main(String[] args) {

        // class name "Identifier01" is identifier
        int age = 33; // "age" is identifier
        double phnNum = 0987654321f; // "phnNum" is identifier
        printDate();// "printDate" is identifier
    }
}
