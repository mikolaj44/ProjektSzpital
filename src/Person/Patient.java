package Person;

import java.util.ArrayList;

public class Patient extends Person implements Subject{

    // private boolean isIll; // na razie może niech tego nie będzie
    // private Room room;
    private VitalSigns vitalSigns;
    private String description;
    private String diagnosis = "";

    private ArrayList<Illness> illnesses;
    private ArrayList<Doctor> doctors;

    public Patient(String name, String surname, double age, boolean isMale, String nationality, String description, String diagnosis, VitalSigns vitalSigns, ArrayList<Illness> illnesses) {
        super(name, surname, age, isMale, nationality);
        this.vitalSigns = vitalSigns;
        this.illnesses = illnesses;
        this.description = description;
        this.diagnosis = diagnosis;
        this.doctors = new ArrayList<>(); // nie ustawiamy doktorów tutaj (tak samo nie ma settera)
    }

    // Konstruktor bez diagnozy, chorób i vitalSigns
    public Patient(String name, String surname, double age, boolean isMale, String nationality, String description) {
        super(name, surname, age, isMale, nationality);
        this.description = description;
        this.doctors = new ArrayList<>();
        this.diagnosis = "";
        this.illnesses = null;
        this.vitalSigns = null;
    }

    public Patient(){};

    public boolean isAlive(){ // TO DO

        return true;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    // NIE MA SETTERA DLA DOKTORÓW NA RAZIE BO TO PSUJE
}