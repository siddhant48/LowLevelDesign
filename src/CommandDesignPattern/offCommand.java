package CommandDesignPattern;

public class offCommand implements Command{
    ACReceiver acReceiver;
    offCommand(ACReceiver acReceiver){
        this.acReceiver = acReceiver;
    }
    @Override
    public void execute() {
        acReceiver.acOff();
    }

    @Override
    public void undo() {
        acReceiver.undo();
    }
}
