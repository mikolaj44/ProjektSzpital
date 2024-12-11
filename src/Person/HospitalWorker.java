package Person;

public abstract class HospitalWorker extends Person{

    protected int startWorkHour;
    protected int endWorkHour;

    public HospitalWorker(String name, String surname, double age, boolean isMale, String nationality, int startWorkHour, int endWorkHour) {
        super(name, surname, age, isMale, nationality);
        this.startWorkHour = startWorkHour;
        this.endWorkHour = endWorkHour;
    }

    public boolean isAvailable(int currentHour){
        return (currentHour >= startWorkHour && currentHour <= endWorkHour);
    }

    @Override
    public String toString() {
        return "HospitalWorker{" +
                "startWorkHour=" + startWorkHour +
                ", endWorkHour=" + endWorkHour +
                '}';
    }

    public int getStartWorkHour() {
        return startWorkHour;
    }

    public void setStartWorkHour(int startWorkHour) {
        this.startWorkHour = startWorkHour;
    }

    public int getEndWorkHour() {
        return endWorkHour;
    }

    public void setEndWorkHour(int endWorkHour) {
        this.endWorkHour = endWorkHour;
    }
}