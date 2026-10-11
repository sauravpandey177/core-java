package allAboutObjects;

public class GenericClassCreation {
    static void main() {
        Pair<Integer, String> p  = new Pair<>(10, "saurav");
        System.out.println(p.first +" "+ p.second);


        Object value = true;
        System.out.println(value);


    }
}
//generic class
class Pair<T, U>{
    T first;
    U second;

    Pair(T first, U second){
        this.first = first;
        this.second = second;
    }

}
