package Person;

public interface Observer {

    void registerWith(Subject s);

    void unRegisterWith(Subject s);

    // void update();
    void update(Subject s);
}
