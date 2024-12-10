package Hospital;

public class Date {

    private int minute;
    private int hour;
    private int day;

    public Date(int minute, int hour, int day) {
        this.minute = minute;
        this.hour = hour;
        this.day = day;
    }

    @Override
    public String toString() {
        return "Dzień " + day + ", godzina " + hour + ":" + minute;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}