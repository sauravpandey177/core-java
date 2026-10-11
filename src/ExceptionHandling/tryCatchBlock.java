package ExceptionHandling;


public class tryCatchBlock {
    static void main() {
        try {
            System.out.println("hello");
            System.out.println(12 / 0); // new ArithmeticException
            System.out.println("error ke bad wla msg ");
        }
        catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("i am executed always  ");
        }
    }
}
