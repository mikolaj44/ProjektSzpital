package Person;

import java.util.ArrayList;

public abstract class Doctor extends HospitalWorker implements Observer {

    protected FieldOfMedicine fieldOfMedicine;
    protected ArrayList<Patient> patients;

    public Doctor(int startWorkHour, int endWorkHour, FieldOfMedicine fieldOfMedicine) {
        super(startWorkHour, endWorkHour);
        this.fieldOfMedicine = fieldOfMedicine;
        this.patients = new ArrayList<>(); // tak samo jak w pacjencie, nie dodajemy w konstruktorze
    }

    //public void update()

    public abstract void update(Subject s);

    public abstract void diagnose(Patient p);

    public void registerWith(Subject s){

        s.registerObserver(this);
    }

    public void assignPatient(Patient p){
        patients.add(p);
    }

    @Override
    public String toString() {
        return super.toString() + "Doctor{" +
                "fieldOfMedicine=" + fieldOfMedicine +
                ", patients=" + patients +
                '}';
    }

    public FieldOfMedicine getFieldOfMedicine() {
        return fieldOfMedicine;
    }

    public void setFieldOfMedicine(FieldOfMedicine fieldOfMedicine) {
        this.fieldOfMedicine = fieldOfMedicine;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }
}
