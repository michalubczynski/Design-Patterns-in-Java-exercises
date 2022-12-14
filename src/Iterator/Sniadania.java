package Iterator;

import java.util.Arrays;
import java.util.Iterator;

public class Sniadania implements IMenu {
    PozycjeMenu[] menuItems = new PozycjeMenu[10];
    int maxSize, actSize;

    public Sniadania(){
        addItem("Tani", 10);
        addItem("Typowy", 30);
        addItem("Drogi",50);
        maxSize = 10;
        actSize=0;
    }
    @Override
    public Iterator utworzIterator(){
        return Arrays.stream(menuItems).iterator();
    }
    public void addItem(String nazwa, double cena) {
        PozycjeMenu pozycjeMenu = new PozycjeMenu(nazwa, cena);
        menuItems[actSize] = pozycjeMenu;
        actSize+=1;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getActSize() {
        return actSize;
    }

    public void setActSize(int actSize) {
        this.actSize = actSize;
    }
}
