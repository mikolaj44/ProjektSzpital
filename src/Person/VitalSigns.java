package Person;

import java.util.Arrays;

public class VitalSigns {

    private int[] bloodPressureMmHg;
    private int breathingRatePerMinute;
    private int pulseRatePerMinute;
    private double temperatureCelsius;

    public VitalSigns(int[] bloodPressureMmHg, int breathingRatePerMinute, int pulseRatePerMinute, double temperatureCelsius) {
        this.bloodPressureMmHg = bloodPressureMmHg;
        this.breathingRatePerMinute = breathingRatePerMinute;
        this.pulseRatePerMinute = pulseRatePerMinute;
        this.temperatureCelsius = temperatureCelsius;
    }

    @Override
    public String toString() {
        return "VitalSigns{" +
                "bloodPressureMmHg=" + Arrays.toString(bloodPressureMmHg) +
                ", breathingRatePerMinute=" + breathingRatePerMinute +
                ", pulseRatePerMinute=" + pulseRatePerMinute +
                ", temperatureCelsius=" + temperatureCelsius +
                '}';
    }

    public int[] getBloodPressureMmHg() {
        return bloodPressureMmHg;
    }

    public void setBloodPressureMmHg(int[] bloodPressureMmHg) {
        this.bloodPressureMmHg = bloodPressureMmHg;
    }

    public int getBreathingRatePerMinute() {
        return breathingRatePerMinute;
    }

    public void setBreathingRatePerMinute(int breathingRatePerMinute) {
        this.breathingRatePerMinute = breathingRatePerMinute;
    }

    public int getPulseRatePerMinute() {
        return pulseRatePerMinute;
    }

    public void setPulseRatePerMinute(int pulseRatePerMinute) {
        this.pulseRatePerMinute = pulseRatePerMinute;
    }

    public double getTemperatureCelsius() {
        return temperatureCelsius;
    }

    public void setTemperatureCelsius(double temperatureCelsius) {
        this.temperatureCelsius = temperatureCelsius;
    }
}
