package PolecenieV2;

public class MacroComm implements ICommand{

    ICommand[] commands;

    public MacroComm(ICommand[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for(int i=0; i< commands.length; i++){
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for(int i=0; i< commands.length; i++){
            commands[i].undo();
        }
    }
}
