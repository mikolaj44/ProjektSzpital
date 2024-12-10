package GenerationAndIO;
import Person.Patient;

import java.util.ArrayList;

public class ConsoleIOViewAllPatients implements ConsoleInputtable {
    private ArrayList<Patient> _patients;

    public ConsoleIOViewAllPatients(ArrayList<Patient> _patients) {
        this._patients = _patients;
    }

    @Override
    public String getDescription() {
        return "Wyswietl liste wszystkich pacjentow";
    }

    @Override
    public void showMenu() {
        if (_patients.isEmpty()) {
            System.out.println("Zaden pacjent nie zostal jeszcze wprowadzony");
        } else {
            System.out.println("Pacjenci: ");
            for (Patient patient : _patients) {
                System.out.println(patient.toString());
            }
        }

    }
}
