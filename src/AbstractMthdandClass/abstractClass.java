package AbstractMthdandClass;

public class abstractClass {
    static void main() {
        System.out.println("..............");
        Bike h1= new Honda();
        h1.start();
        h1.accelerate();
        h1.brake();

    }
}

abstract class Bike{
    void start(){
        System.out.println("bike is starting...");
    }

    abstract void accelerate();

    void brake(){
        System.out.println("bike is stopping...");
    }
}

class Honda extends Bike{
    void accelerate(){
        System.out.println("honda bike is accelerating..");
    }

}
