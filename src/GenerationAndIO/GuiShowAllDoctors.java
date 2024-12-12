package GenerationAndIO;

import java.util.ArrayList;

import Hospital.*;
import Person.*;

import static ListUtils.ListPrint.*;

public class GuiShowAllDoctors implements GuiElement {
    private HospitalInfo _hospitalInfo;

    public GuiShowAllDoctors() {
    }

    public GuiShowAllDoctors(HospitalInfo hospitalInfo) {
        _hospitalInfo = hospitalInfo;
    }

    @Override
    public String getDescription() {
        return "Wyświetlanie wszystkich lekarzy";
    }

    @Override
    public void performAction() {

        ArrayList<Doctor> doctors = new ArrayList<>();

        for (HospitalDepartment department : _hospitalInfo.getDepartments()) {

            for (HospitalWorker worker : department.getWorkers()) {

                if (worker instanceof Doctor)
                    doctors.add((Doctor) worker);
            }
        }

        if (doctors.isEmpty()) {
            System.out.println("Zaden lekarz nie zostal jeszcze wprowadzony");
        } else {
            System.out.println("Doktorzy: ");
            printLnList(doctors);
        }
    }
}
