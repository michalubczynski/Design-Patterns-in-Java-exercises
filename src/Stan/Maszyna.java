package Stan;

public class Maszyna {//4 stany jak w diagramie
    final static int BRAK_GUM = 0;//brak gum
    final static int NIE_MA_MONETY = 1;//nie ma monety
    final static int JEST_MONETA = 2;//jest moneta
    final static int GUMA_SPRZEDANA = 3;//guma sprzedana
    int stan = BRAK_GUM; //zmienna egzemplarza, która posłuzy do sledzenia bieżącego stanu obiektu, inicjowana wartościa brak gum
    int liczbaGum = 0;//liczba gum w automacie

    public Maszyna(int count) {//konstruktor pobiera informacje o początkowej liczbie gum //jeżeli jest ich więcej niż 0 automat wchodzi w stan nie ma monety - znaczy ze czeka na klienta
        this.liczbaGum = count;
        if (count > 0) {
            stan = NIE_MA_MONETY; //gdy gum nie ma automat pozostaje w stanie brak gum
        }
    }

    //teraz implementacja akcji jako metod //każdemu ze stanów odpowiada instrukcja wykonania warunkowego zapewniająca // że zachowanie obiektu będzie odpowiadało jego stanowi
//a w pewnych wypadkach wyróżnionych w diagramie prowadząca do zmiany stanu
    public void wkładanieMonety() {//operacja wkładanie monety
        if (stan == JEST_MONETA) {//inna moneta została już włozona informujemy o tym klienta
            System.out.println("Nie możesz włożyć kolejnej monety");
        } else if (stan == NIE_MA_MONETY) {//w przeciwnym wypadku przyjmujemy monetę i przechodzimy do stanu jest moneta
            stan = JEST_MONETA;
            System.out.println("Włożyłeś monetę");
        } else if (stan == BRAK_GUM) {//gdy automat jest pusty odmawiamy przyjęcia moenty
            System.out.println("Nie możesz włożyć monety, maszyna jest pusta - brak gum");
        } else if (stan == GUMA_SPRZEDANA) {//jesli klient wlasnie kupil gumę, rpzed wlozeniem kolejnej monety musi zaczekac
            System.out.println("Proszę czekać na zakończenie poprzedniej operacji czyli wydania gumy");//na zakonczenie transakcji
        }
    }

    public void przekrecanieGalki() {//operacja przekęcanie gałki
        if (stan == GUMA_SPRZEDANA) {//klient probuje oszukiwać
            System.out.println("Dwukrotne przekręcenie gałki nie da ci kolejnej gumy!");
        } else if (stan == NIE_MA_MONETY) {//najpierw moneta
            System.out.println("Przekręciłęś gałkę do wydania gumy ale nie włożyłęś monety");
        } else if (stan == BRAK_GUM) {//automat jest pusty-nie mozna wydac gum
            System.out.println("Przekręciłeś gałkę, ale w automacie brak kulek gumowych");
        } else if (stan == JEST_MONETA) {//sukces-klient otrzyma gumę
            System.out.println("Przekręciłeś gałkę i otrzymujesz gumę");//zmiana stanu na guma sprzedana
            stan = GUMA_SPRZEDANA;
            wydawanieGumy();//i wywołujemy metodę wydania gumy
        }
    }

    public void wydawanieGumy() {//wydawanie to wewnetrzna operacja inicjowana samoczynnie przez automat //operacja wydawanie gumy- metoda wywoływana w celu wydania gumy
        if (stan == GUMA_SPRZEDANA) {//jesli jestesmy w stanie guma sprzedana - dajemy gume
            System.out.println("Guma wysuwa się z automatu");
            liczbaGum = liczbaGum - 1;
            if (liczbaGum == 0) {
                System.out.println("Ups, brak kulek gumowych!");
                stan = BRAK_GUM;//po wydaniu ostatniej gumy przestawiamy automat w stan brak gum
            } else {//w innych przypadkach przechodzimy do stanu oczekiwania na monetę
                stan = NIE_MA_MONETY;
            }
        } else if (stan == NIE_MA_MONETY) {//zadna z tych sytuacji nie powinna miesc miejsca ale gdyby tak sie stalo wynikiem
            System.out.println("Błąd - Musisz najpierw zapłacić");//operacji musi być bład a nie wydanie gumy
        } else if (stan == BRAK_GUM) {
            System.out.println("Błąd - Nie wydano gumy do żucia");
        } else if (stan == JEST_MONETA) {
            System.out.println("Błąd - Nie wydano gumy do żucia");
        }
    }

    public void zwracanieMonety() {//operacja zwracanie monety //przy próbie odzyskania monety przez klienta
        if (stan == JEST_MONETA) {//jezeli w automacie jest moneta zwracamy ją i wracamy do stanu nie ma monety
            System.out.println("Moneta zwrócona");
            stan = NIE_MA_MONETY;
        } else if (stan == NIE_MA_MONETY) {//jesli nie ma monety nie mozemy jej zwrocic
            System.out.println("Nie włożyłeś monety");
        } else if (stan == GUMA_SPRZEDANA) {//jesli klient przekrecil gałkę nie mozna oddać monety-czeka on juz na gume
            System.out.println("Już przekręciłeś gałkę i wydano gumę, nie można już zwrócić moenety");
        } else if (stan == BRAK_GUM) {//nie mozna zwrocic monety gdy automat jest pusty-w tym stanie nie mogl jej przyjac
            System.out.println("Nie możesz zwrócić monety której nie włożyłeś");
        }
    }

    public void uzupelnijGumy(int numGumBalls) {
        this.liczbaGum = numGumBalls;
        stan = NIE_MA_MONETY;
    }

    @Override
    public String toString() {
        return "Maszyna{" +
                "stan=" + stan +
                ", liczbaGum=" + liczbaGum +
                '}';
    }
}