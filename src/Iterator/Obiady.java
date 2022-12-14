package Iterator;


import java.util.Hashtable;
import java.util.Iterator;

public class Obiady implements IMenu {
    Hashtable menuItems = new Hashtable();

    public Hashtable getMenuItems() {
        return menuItems;
    }
    public Obiady(){
        addItem("Tani", 10);
        addItem("Typowy", 30);
        addItem("Drogi",50);
    }
    @Override
    public Iterator utworzIterator(){
        return menuItems.values().iterator();
    }
    public void addItem(String nazwa, double cena) {
        PozycjeMenu pozycjeMenu = new PozycjeMenu(nazwa, cena);
        menuItems.put(pozycjeMenu.getNazwa(), pozycjeMenu);
    }
}
