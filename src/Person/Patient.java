package Person;

import java.util.ArrayList;

public abstract class Patient extends Person{

    // boolean isIll; // na razie może niech tego nie będzie
    private VitalSigns vitalSigns;
    private ArrayList<Illness> illnesses;
    // Room room;


    public Patient(String name, String surname, double age, boolean isMale, String nationality, VitalSigns vitalSigns, ArrayList<Illness> illnesses) {
        super(name, surname, age, isMale, nationality);
        this.vitalSigns = vitalSigns;
        this.illnesses = illnesses;
    }

    @Override
    public String toString() {
        return super.toString() + "Patient{" +
                "vitalSigns=" + vitalSigns +
                ", illnesses=" + illnesses +
                '}';
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public ArrayList<Illness> getIllnesses() {
        return illnesses;
    }

    public void setIllnesses(ArrayList<Illness> illnesses) {
        this.illnesses = illnesses;
    }
}