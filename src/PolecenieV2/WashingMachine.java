package PolecenieV2;

public class WashingMachine {
    final int sOff=0;
    final int sOn=1;
    final int sNormal=2;
    final int sFast=3;

    int activState;

    public int getActivState() {
        return activState;
    }

    public void On() {
        System.out.println("Electrical has been injected");
        activState = sOn;
    }
    public void Off() {
        System.out.println("Electrical has been removed");
        activState = sOff;
    }
    public void Normal() {
        System.out.println("Mode: normal");
        activState=sNormal;
    }
    public void Fast() {
        System.out.println("Mode: fast");
        activState = sFast;
    }
}
