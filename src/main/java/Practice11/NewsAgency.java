package Practice11;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject{

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String news) {
        for (Observer observer:
             observers) {
            observer.update(news);
        }
    }

}
