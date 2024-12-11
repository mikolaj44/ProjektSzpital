package GenerationAndIO;

import java.util.ArrayList;

import Hospital.HospitalDepartment;
import Hospital.HospitalInfo;
import Person.Patient;

import static ListUtils.ListPrint.*;

public class GuiShowAllPatients implements GuiElement {

    private HospitalInfo _hospitalInfo;

    public GuiShowAllPatients() {
    }

    public GuiShowAllPatients(HospitalInfo hospitalInfo) {
        _hospitalInfo = hospitalInfo;
    }

    @Override
    public String getDescription() {
        return "Wyświetlanie wszystkich pacjentów";
    }

    @Override
    public void performAction() {

        ArrayList<Patient> patients = new ArrayList<>();

        for(HospitalDepartment department : _hospitalInfo.getDepartments()){

            patients.addAll(department.getPatients());
        }

        if (patients.isEmpty()) {
            System.out.println("Zaden pacjent nie zostal jeszcze wprowadzony");
        } else {
            System.out.println("Pacjenci: ");
            printLnList(patients);
        }

    }
}
