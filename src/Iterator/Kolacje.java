package Iterator;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

public class Kolacje implements IMenu  {
    ArrayList menuItems = new ArrayList();

    public ArrayList getMenuItems() {
        return menuItems;
    }
    public Kolacje(){
        addItem("Tani", 10);
        addItem("Typowy", 30);
        addItem("Drogi",50);
    }
    @Override
    public Iterator utworzIterator(){
        return menuItems.iterator();
    }
    public void addItem(String nazwa, double cena) {
        PozycjeMenu pozycjaMenu = new PozycjeMenu(nazwa, cena);
        menuItems.add(pozycjaMenu);
    }
}
