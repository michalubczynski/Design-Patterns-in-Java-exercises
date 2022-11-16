package PolecenieV2;

public class Programmer {
    public static void main(String[] args){
    Pilot pilot = new Pilot();
    ICommand[] commands = new ICommand[3];


    GarageDoor garageDoor = new GarageDoor();
    WashingMachine washingMachine = new WashingMachine();
    GarageDoorCloseComm garageDoorCloseComm = new GarageDoorCloseComm(garageDoor);
    GarageDoorOpenComm garageDoorOpenComm = new GarageDoorOpenComm(garageDoor);
    WashingMachineOnComm washingMachineOnComm = new WashingMachineOnComm(washingMachine);
    WashingMachineOffComm washingMachineOffComm = new WashingMachineOffComm(washingMachine);
    commands[0] = washingMachineOffComm;
    commands[1] = washingMachineOnComm;
    commands[2] = garageDoorOpenComm;
    MacroComm macroComm = new MacroComm(commands);
    pilot.setCommand(0,garageDoorOpenComm,garageDoorCloseComm);
    pilot.setCommand(1,washingMachineOnComm,washingMachineOffComm);
    pilot.setCommand(2,macroComm,macroComm);
    pilot.onButtonPushed(0);
    pilot.offButtonPushed(0);
    pilot.onButtonPushed(1);
    pilot.offButtonPushed(1);
    pilot.onButtonPushed(2);
    pilot.undoButtonPushed();
    System.out.println(pilot);
    }
}
