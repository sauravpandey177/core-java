package Polymorphism;

public class variableOnOverride {
    static void main() {
        Aa a = new Bb();
        System.out.println(a.x);
        Bb b = new Bb();
        System.out.println(b.x);
    }
}

class Aa{
    int x =3;
}

class Bb extends Aa{
    int x =12;
}
