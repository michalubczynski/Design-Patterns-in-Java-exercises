package PolecenieV2;

public class GarageDoor {
    final int sOff=0;
    final int sOn=1;
    final int sOpened=2;
    final int sClosed=3;
    final int sLocked=4;
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
    public void Open() {
        System.out.println("Door opened");
        activState=sOpened;
    }
    public void Close() {
        System.out.println("Door closed");
        activState = sClosed;
    }
    public void Lock(){
        System.out.println("Door locked");
        activState = sLocked;
    }
}
