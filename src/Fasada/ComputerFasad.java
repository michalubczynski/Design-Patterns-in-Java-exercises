package Fasada;

public class ComputerFasad {
    private HardDisk hardDisk;
    private Mainboard mainboard;
    private Processor processor;
     public ComputerFasad(){
         hardDisk = new HardDisk("Tysionc");
         mainboard = new Mainboard("Pyta");
         processor = new Processor("Intel i5");
     }
     public void on(){
         System.out.println("WLACZONO: "+hardDisk.getName()+" "+mainboard.getName()+" "+processor.getName() );
     }
    public void off(){
         System.out.println("Wylaczono: "+hardDisk.getName()+" "+mainboard.getName()+" "+processor.getName() );

    }
}
