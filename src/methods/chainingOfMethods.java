package methods;

public class chainingOfMethods {
    static void A(){
        B();
        System.out.println("hie i am A ");

    }
    static void B(){
        System.out.println("hie i am B");
        C();
    }
    static void C(){
        System.out.println("hie i am C");
        D();
    }

    static void D(){
        System.out.println("hie i am D");
        E();
    }

    static void E(){
        System.out.println("hie i am E");
        F();

    }
    static void F(){
        System.out.println("hie i am F");
        System.out.println("this is the end of the chaining....");
    }

    static void main(String[] args){
        A();

    }
}
