package Person;

import java.util.ArrayList;

public class Doctor extends HospitalWorker implements Observer {

    protected FieldOfMedicine fieldOfMedicine;
    protected ArrayList<Patient> patients;

    public Doctor(String name, String surname, double age, boolean isMale, String nationality, int startWorkHour, int endWorkHour, FieldOfMedicine fieldOfMedicine) {
        super(name, surname, age, isMale, nationality, startWorkHour, endWorkHour);
        this.fieldOfMedicine = fieldOfMedicine;
        this.patients = new ArrayList<>();
    }

    //public void update()

    public void update(Subject s) {

    }

    public void diagnose(Patient p) {

    }

    public void registerWith(Subject s){

        s.registerObserver(this);
        patients.add((Patient)s); // usunąłem dla bezpieczeństwa assignPatient bo ktoś mógłby niechący wywołać zapominając o modelu Obserwatora itd
    }

    public void unRegisterWith(Subject s){

        s.removeObserver(this);
    }

    public void performAction(Patient p) {

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
