package CommandDesignPattern;

public class Test {
    public static void main(String[] args) {
        // Invoker -> Command -> Receiver

        ACReceiver acReceiver = new ACReceiver();
        Remote remote = new Remote();

        remote.setCommand(new onCommand(acReceiver));
        remote.pressButton();

        remote.setCommand(new offCommand(acReceiver));
        remote.pressButton();

        remote.pressUndo();
        remote.pressUndo();
    }
}

// In this code of AC turn/off undo functiinality can be implemented because in undo in ACReceiver
// we are checking and updating the on variable is persisting but when there are many commands and we want to
// know the last command so that we can undo we should use stacks
// Remote (invoker) -> command -> AC (receiver)
