package FabrykaV3;

import FabrykaV3.WorkShop.BasicWorkShop;
import FabrykaV3.WorkShop.MotorcycleWorkShop;

public class Main { //
        public static void main(String[] args){
                BasicWorkShop cars = new BasicWorkShop();
                cars.changeOil("synth");
                MotorcycleWorkShop moto = new MotorcycleWorkShop();
                moto.changeOil("semi-moto");
        }
}
