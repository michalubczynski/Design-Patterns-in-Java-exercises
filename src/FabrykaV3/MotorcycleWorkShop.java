package FabrykaV3;

public class MotorcycleWorkShop extends WorkShop {

    @Override
    public Oil CreateOil(String type) {

        Oil oil = null;
        if(type == "semi-moto"){
            oil = new SemiSyntheticMotoOil();
            System.out.println(oil.ToString()) ;

        }
        else if(type == "synth-moto"){
            oil = new SyntheticMotoOil();
            System.out.println(oil.ToString()) ;

        }
        else if(type == "mineral-moto") {
            oil = new MineralMotoOil();
            System.out.println(oil.ToString());
        }
        else throw new IllegalArgumentException("Brak oleju");
        return oil;

    }
}
