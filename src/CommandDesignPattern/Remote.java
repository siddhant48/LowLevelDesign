package CommandDesignPattern;

import java.util.Stack;

public class Remote {
    Command command;
    Stack<Command> commandsSeq = new Stack<>();

    public void setCommand(Command command){
        this.command = command;
    }
    public void pressButton() {
        command.execute();
        commandsSeq.add(command);
    }

    public void pressUndo(){
        if(!commandsSeq.isEmpty()){
            Command lastCommand = commandsSeq.pop();
            lastCommand.undo();
        }
    }
}
