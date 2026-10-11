package CollectionFramework;

import java.util.Iterator;

public class iteratorBasic2  {
    static void main() {
        String[] names = {"saurav","aryan","keshav"};
        NameContainer container = new NameContainer(names);
        Iterator<String> it = container.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}


class NameContainer implements Iterable<String> {
    private String[] names;
    private int size;

    NameContainer(String[] names){
        this.names = names;
        this.size = this.names.length;


    }

    @Override
    public Iterator<String> iterator(){
        return new NameContainerIterator();

    }

    private class NameContainerIterator implements Iterator<String>{
        private int pos=0;

        @Override
        public boolean hasNext() {
            return pos<size;
        }

        @Override
        public String next() {
            return names[pos++];
        }
    }
}
