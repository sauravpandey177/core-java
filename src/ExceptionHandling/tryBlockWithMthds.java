package ExceptionHandling;

public class tryBlockWithMthds {
    static void main() {
        int x =9, y=10;
        try{
            methodA(x,  y);
        }
        catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }

    static void methodA(int x, int y){
            methodB();
        System.out.println(x+y);

    }

    static void methodB(){
        System.out.println(10/0);
    }
}
