package GenericClass;

public class basicOfGenerics {
    static void main() {
        Box<Integer> b = new Box<>(10);


    }
}


class Box<T> {
    private T value;

    Box(T value){
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }
    public void setValue(){
        this.value = value;
    }


}