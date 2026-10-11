package methods;

public class ScopeOfAvariable {
    static int a = 12;  //global variable

    static void main() {
        System.out.println(a);
        System.out.println(square(a));
        int i =0;
        for(i = 0; i< 3; i++){
            int dubleProduct = i*2;
        }
        System.out.println(i);
    }

    static int square(int a){
        return a*a;

    }
}
