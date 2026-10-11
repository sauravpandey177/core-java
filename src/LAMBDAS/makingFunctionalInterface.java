package LAMBDAS;

public class makingFunctionalInterface {
    static void main() {

        Salary display = ()-> System.out.println("hello, lambda here!");
        System.out.println(display);




    }
}


@FunctionalInterface
interface Salary{
    void print();
}


