package CommandDesignPattern;

public class ACReceiver {
    boolean on = false;
    public void acON(){
        on = true;
        System.out.println("AC is ON !!");
    }

    public void acOff() {
        on = false;
        System.out.println("AC is OFF !!");
    }

    public void undo() {
        if(on){
            on = false;
            System.out.println("AC is off now with undo operation !!");
        }else{
            on = true;
            System.out.println("AC is on now with undo operation !!");
        }
    }
}
