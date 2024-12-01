package ObserverDesignPattern;

public class User implements Observer{
    private String userName;
    User(String userName) {
        this.userName = userName;
    }
    @Override
    public void update(String updatedMessage) {
        System.out.println(userName+" received update: "+ updatedMessage);
    }
}
