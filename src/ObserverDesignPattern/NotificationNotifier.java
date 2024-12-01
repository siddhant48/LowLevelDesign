package ObserverDesignPattern;

public interface NotificationNotifier {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void updateMessageAndNotify(String updatedMessage);
}
// It like there are 2 entity one is notifier whose role is adding , removing observers and send notification
// notifier and observer are independent like notifier doesn't care what observer will do with the notification
// we can have update method in observer and we can send the message/event in update method
// we can have some more logic in update like sending mail or anything but it's not related to notifier

// Also, it's like one to many relation like for one notification there will be multiple observer



//Context:You are developing a system where multiple users can subscribe to
// notifications about specific events. Each time an event occurs, a set of
// subscribed users must be notified. The system should allow users to subscribe
// or unsubscribe from receiving these notifications, and ensure that the notifications
// are sent out automatically when the event happens.

