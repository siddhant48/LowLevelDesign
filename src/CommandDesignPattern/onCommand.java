package CommandDesignPattern;

public class onCommand implements Command{
    ACReceiver acReceiver;
    onCommand(ACReceiver acReceiver){
        this.acReceiver = acReceiver;
    }
    @Override
    public void execute() {
        acReceiver.acON();
    }

    @Override
    public void undo() {
        acReceiver.undo();
    }
}
