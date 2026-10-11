package ExceptionHandling;

public class useOfThrow {
    static void main() {

        int age =-1;
        if(age<0){
            throw new RuntimeException("age cant be negative");
            //java doesnt give automatiicaly ex here, hmne khud check krke throw krwai ex.
        }
    }
}

