package GenerationAndIO;
import Person.Patient;

import java.util.ArrayList;

public class GuiShowAllPatients implements GuiElement {
    private ArrayList<Patient> _patients;

    public GuiShowAllPatients(ArrayList<Patient> _patients) {
        this._patients = _patients;
    }

    @Override
    public String getDescription() {
        return "Wyświetlanie wszystkich pacjentów";
    }

    @Override
    public void performAction() {
        if (_patients.isEmpty()) {
            System.out.println("Zaden pacjent nie zostal jeszcze wprowadzony");
        } else {
            System.out.println("Pacjenci: ");
            for (Patient patient : _patients) {
                System.out.println(patient);
            }
        }

    }
}
