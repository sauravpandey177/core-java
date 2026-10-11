package Streams;

import java.util.Optional;

public class OptionalMethods {
    static void main() {

        Optional<String> name = getName();

//        if(name.isPresent()){
//            System.out.println(name.get());
//        }

        name.ifPresent(System.out::println);

        System.out.println(name.orElse("unknown"));
    }


    public static Optional<String> getName(){
//        return Optional.of("saurav");
//        return Optional.empty();
        return Optional.ofNullable(null);
    }

}
