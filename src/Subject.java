import java.util.ArrayList;

public interface Subject {

    void registerObserver(Observer o);
    void notifyObservers(ArrayList<Observer> l);
    void removeObserver(Observer o);
}
