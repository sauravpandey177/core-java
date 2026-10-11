package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


//try catch with resource
public class tryCatchwithResource {
    static void main() {
        try(FileReader fr = new FileReader("abc.txt")){

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}


