package PolecenieV2;

public class GarageDoorOffComm implements ICommand {
    GarageDoor garageDoor;
    static int prevState;

    public GarageDoorOffComm(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
    prevState = garageDoor.getActivState();
    garageDoor.Off();
    }

    @Override
    public void undo() {
        switch (prevState){
        case 0: //off
            garageDoor.Off();
            break;
        case 1:
            garageDoor.On();
            break;
        case 2://open
            garageDoor.Open();
            break;
        case 3://close
            garageDoor.Close();
            break;
        case 4://lock
            garageDoor.Lock();
            break;
        }
    }
}
