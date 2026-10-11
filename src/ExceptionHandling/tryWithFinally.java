package ExceptionHandling;

public class tryWithFinally {
    static void main() {
        System.out.println("step 1 ");

        try{
            System.out.println(10/0);
            System.out.println("this is after error statement");
        }
        catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("this is from finnaly block");

        }

    }
}
