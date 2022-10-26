package FabrykaV3;

public class Main { //
        public static void main(String[] args){
                BasicWorkShop cars = new BasicWorkShop();
                cars.changeOil("synth");
                MotorcycleWorkShop moto = new MotorcycleWorkShop();
                moto.changeOil("semi-moto");
        }
}
