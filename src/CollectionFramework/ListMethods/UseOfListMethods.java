package CollectionFramework.ListMethods;

import java.util.*;

public class UseOfListMethods {
    static void main() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

//        System.out.println(list.get(0));
        list.set(0,11111);
        System.out.println(list);
        list.add(1,5555);
        System.out.println(list);

        list.addAll(2, List.of(60,70,80,90));
        System.out.println(list);
        System.out.println(list.remove(0));
        System.out.println(list);

        ListIterator<Integer> it = list.listIterator(2);
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }

    }
}
