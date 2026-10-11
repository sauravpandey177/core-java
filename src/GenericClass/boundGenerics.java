package GenericClass;

public class boundGenerics {
    static void main() {

    }
}

class Animal{
    void display(){
        System.out.println("displaying animal... ");
        Boxx<Fish> b1 = new Boxx<>();
    }
}
class Boxx<T extends Animal & Swimmable>{
    T value;


}

interface Swimmable{
    void swim();
}

class Dog extends Animal{

}

class Fish extends Animal implements Swimmable{
    @Override
    public void swim(){
        System.out.println("Fish is swimming.");
    }
}