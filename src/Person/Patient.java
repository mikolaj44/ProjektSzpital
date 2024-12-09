package Person;

import java.util.ArrayList;

public class Patient extends Person implements Subject{

    // private boolean isIll; // na razie może niech tego nie będzie
    private VitalSigns vitalSigns;
    private ArrayList<Illness> illnesses;
    private ArrayList<Doctor> doctors;
    // private Room room;

    public Patient(String name, String surname, double age, boolean isMale, String nationality, VitalSigns vitalSigns, ArrayList<Illness> illnesses) {
        super(name, surname, age, isMale, nationality);
        this.vitalSigns = vitalSigns;
        this.illnesses = illnesses;
        this.doctors = new ArrayList<>(); // nie ustawiamy doktorów tutaj (tak samo nie ma settera)
    }

    public void registerObserver(Observer o){
        doctors.add((Doctor)o);
    }

    public void notifyObservers(){
        for(Observer o : doctors)
            o.update(this);
    }

    public void removeObserver(Observer o){

        Doctor d = (Doctor)o;

        for(Doctor doctor : doctors){

            if(doctor.equals(d)){
                doctors.remove(doctor);
                return;
            }
        }
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

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    // NIE MA SETTERA DLA DOKTORÓW NA RAZIE BO TO PSUJE
}