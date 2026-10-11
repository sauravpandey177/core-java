package AbstractMthdandClass;

public class interfaceUsage {
    static void main() {
        System.out.println();
        Dog dog = new Dog();
        dog.eat();
        dog.hunt();
    }
}

interface Animal{
    void eat();
    void hunt();

}

class Dog implements Animal{
    public void eat(){
        System.out.println("dog is eating...");
    }

    public void hunt(){
        System.out.println("dog can hunt..");
    }

}

