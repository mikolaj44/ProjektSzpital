package GenerationAndIO;

import Person.Doctor;
import Person.HospitalWorker;

import java.util.ArrayList;
import java.util.List;

public class GuiShowAllDoctors implements GuiElement
{
    private List<HospitalWorker> _hospitalWorkers;

    public GuiShowAllDoctors() {
        _hospitalWorkers = new ArrayList<>();
    }

    public GuiShowAllDoctors(List<HospitalWorker> hospitalWorkers) {
        _hospitalWorkers = hospitalWorkers;
    }

    @Override
    public String getDescription() {
        return "Wyświetlanie wszystkich lekarzy";
    }

    @Override
    public void performAction() {
        if(_hospitalWorkers == null)
        {
            System.out.println("Nie ma żadnych lekarzy.");
            return;
        }

        boolean found = false;

        for(HospitalWorker hospitalWorker : _hospitalWorkers)
        {
            if(hospitalWorker instanceof Doctor) {
                System.out.println((Doctor) hospitalWorker);
                found = true;
            }
        }

        if(!found)
            System.out.println("Nie ma żadnych lekarzy.");
    }
}
