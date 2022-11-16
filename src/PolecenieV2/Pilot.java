package PolecenieV2;

public class Pilot {
    private static final int numOfProg = 12;
    ICommand[] on;
    ICommand[] off;
    ICommand empty;
    ICommand iCommand;

    public Pilot(){
        on = new ICommand[numOfProg];
        off = new ICommand[numOfProg];
        empty  = new EmptyCommand();
        for (int i=0; i<numOfProg; i++){
            on[i] = empty;
            off[i]= empty;
        }

    }
    public void setCommand(int slot, ICommand onComm, ICommand offComm){
        on[slot]=onComm;
        off[slot]=offComm;

    }

    public void onButtonPushed(int prog){
           iCommand = on[prog];
           iCommand.execute();
    }
    public void offButtonPushed(int prog){
        iCommand = off[prog];
        iCommand.execute();
    }
    public void undoButtonPushed(){
        iCommand.undo();
    }
    @Override
    public String toString() {
        System.out.println("\n------ Zdalne sterowanie -------\n");
        for (int i = 0; i < on.length; i++) {
            System.out.print("[slot " + i + "] " + on[i].getClass().getName()
                    + " " + off[i].getClass().getName() + "\n");
        }
        return "";
    }
}
