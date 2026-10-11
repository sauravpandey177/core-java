package LAMBDAS;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class coreInterfaces {

    static void main() {
        Function<Integer, Integer> sq = x -> x * x;
        System.out.println(sq.apply(5));

        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(100);

        Supplier<Double> randomValue = ()-> Math.random();
        System.out.println(randomValue.get());

        Predicate<Integer> isEven = x -> x%2==0;
        System.out.println(isEven.test(5));

        List<Integer> list = new ArrayList<>(List.of(1,23,4,5));
        list.forEach(x-> System.out.println(x));

        System.out.println();

        for(Integer i: list) System.out.println(i);


    }

}
