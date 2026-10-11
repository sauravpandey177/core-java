package ExceptionHandling;

public class illegalArguExceptionUse {
    static void main() {
        try{
            checkAge(-2);
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());  // exception handle krliya
        }
    }

    static void checkAge(int age){
        if(age<0){
            throw new IllegalArgumentException("age cant be negative");  // exception aayi
        }
        if(age>18) System.out.println("you are eligible to vote.");

        System.out.println("thank you . !!");
    }
}
