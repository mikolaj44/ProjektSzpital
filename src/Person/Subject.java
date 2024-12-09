package Person;

import java.util.ArrayList;

public interface Subject {

    void registerObserver(Observer o);
    void notifyObservers();
    void removeObserver(Observer o);
}
