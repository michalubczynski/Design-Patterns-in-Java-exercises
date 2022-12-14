package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Kelnerka {
    ArrayList menus;

    public void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            PozycjeMenu menuItem = (PozycjeMenu) iterator.next();
            System.out.println(menuItem.getCena());
            System.out.println(menuItem.getNazwa());
        }
    }
    public void printMenu(){
        Iterator menuITerator = menus.iterator();
        while(menuITerator.hasNext()){
            IMenu menu = (IMenu) menuITerator.next();
            printMenu(menu.utworzIterator());
        }
    }
}
