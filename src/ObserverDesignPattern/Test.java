package ObserverDesignPattern;

public class Test {
    public static void main(String[] args) {
       Observer user1 = new User("Siddhant");
       Observer user2 = new User("Aman");
       Observer user3 = new User("Hustler");
       NotificationNotifier notificationNotifier = new SoftwareUpdateNotifier();
       notificationNotifier.addObserver(user1);
       notificationNotifier.addObserver(user2);
       notificationNotifier.addObserver(user3);
       notificationNotifier.updateMessageAndNotify("New Model of onePlus is added !!");
       notificationNotifier.removeObserver(user1);
       notificationNotifier.updateMessageAndNotify("New Car Model is launched!!");
    }
}
