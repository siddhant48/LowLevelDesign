package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class SoftwareUpdateNotifier implements NotificationNotifier {
    private List<Observer> observerList = new ArrayList<>();
    private String updatedMessage;

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }
    @Override
    public void updateMessageAndNotify(String updatedMessage){
        this.updatedMessage = updatedMessage;
        notifyObserver();
    }

    public void notifyObserver() {
        for(Observer observer: observerList) {
            observer.update(updatedMessage);
        }
    }

}
