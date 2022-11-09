package AdapterIterator;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationIteratorTest {

    public static void main(String[] args) {

    Vector vector = new Vector(Arrays.asList("Imie1","Imie2","Imie3"));

    Iterator iterator3 = new EnumerationIterator(vector.elements());
        while(iterator3.hasNext()) {
            System.out.println(iterator3.next());

            Enumeration enumeration = vector.elements();

            while(enumeration.hasMoreElements()) {
                System.out.println(enumeration.nextElement());
            }

            for (Enumeration<String> e = vector.elements();e.hasMoreElements();)
                System.out.println(e.nextElement());

        }

    }
}
