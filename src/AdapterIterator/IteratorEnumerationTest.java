package AdapterIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

import static java.util.Collections.addAll;

public class IteratorEnumerationTest {

    public static void main(String[] args) {
        String[] osoby = new String[]{"Imie1_1","Imie2_2","Imie3_3"};
        ArrayList<String> im = new ArrayList<>();
        addAll(im,osoby);
        Enumeration enumeration1 = new IteratorEnumeration(im.iterator());
        while(enumeration1.hasMoreElements()) {
            System.out.println(enumeration1.nextElement());
        }

        ArrayList osoby2 = new ArrayList(Arrays.asList("Imie1_11","Imie1_22","Imie3_33"));
        Enumeration enumeration = new IteratorEnumeration(osoby2.iterator());
        while(enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
