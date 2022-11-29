package Stan;

public class Stan1 {
    public static void main(String[] args) {//ładujemy automat 5 gumami
        Maszyna maszyna = new Maszyna(5);
        System.out.println(maszyna);//wypisujemy info o stanie automatu
        maszyna.wkładanieMonety();//wrzucamy monetę
        maszyna.przekrecanieGalki();//przekręcamy gałkę
        System.out.println(maszyna);//jeszcze raz stan autoamtu
        maszyna.wkładanieMonety();//wrzuc monetę
        maszyna.zwracanieMonety();//zażadaj zwrocu
        maszyna.przekrecanieGalki();//przekrec gałkę-nie powinienes dostac gumy
        System.out.println(maszyna);//wypisanie info o stanie automatu
        maszyna.wkładanieMonety();//wloz monete
        maszyna.przekrecanieGalki();//przekrec gałke-otrzymasz gume
        maszyna.wkładanieMonety();//wloz monete
        maszyna.przekrecanieGalki();//przekrec gałkę-otrzymasz gume
        maszyna.zwracanieMonety();//zazadaj zwortu monety ktorej nie wlozyles
        System.out.println(maszyna);//wypisz info o stanie autoamtu
        maszyna.wkładanieMonety();//wloz dwie monety
        maszyna.wkładanieMonety();
        maszyna.przekrecanieGalki();//przekrec galke- otryzmasz gume
        maszyna.wkładanieMonety();//testy wytrzymalosciowe
        maszyna.przekrecanieGalki();//wypada guma - brak gum
        maszyna.wkładanieMonety();//nie mozesz wlozyc moent gdy automat jest pusty
        maszyna.przekrecanieGalki();//automat jest pusty
        System.out.println(maszyna);//wypisanie info o stanie autoamtu
    }
}
