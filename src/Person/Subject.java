package Person;

public interface Subject {

    void registerObserver(Observer o);

    void notifyObservers();

    void removeObserver(Observer o);
}
