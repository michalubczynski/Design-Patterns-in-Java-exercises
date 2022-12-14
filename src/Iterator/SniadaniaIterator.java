package Iterator;

import java.util.Iterator;

public class SniadaniaIterator implements Iterator {
    PozycjeMenu[] lista;
    int pozycja=0;


    public SniadaniaIterator(PozycjeMenu[] menu){
        this.lista = menu;
    }

    @Override
    public boolean hasNext() {
        if(pozycja < lista.length-1 && lista[pozycja] != null){
            return true;
        }
        else return false;
    }

    @Override
    public PozycjeMenu next() {
        return lista[pozycja++];
    }
}
