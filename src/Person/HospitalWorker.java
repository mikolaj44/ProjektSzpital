package Person;

public abstract class HospitalWorker {

    protected int startWorkHour;
    protected int endWorkHour;

    public HospitalWorker(int startWorkHour, int endWorkHour) {
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