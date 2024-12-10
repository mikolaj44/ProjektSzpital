package GenerationAndIO;

import Person.Doctor;
import Person.HospitalWorker;

import java.util.List;

public class ConsoleIODoctor implements ConsoleInputtable
{
    private List<HospitalWorker> _hospitalWorkers;
    public ConsoleIODoctor() {
    }
    public ConsoleIODoctor(List<HospitalWorker> hospitalWorkers) {
    }

    @Override
    public String getDescription() {
        return "Wyświetlanie lekarzy";
    }

    @Override
    public void showMenu() {
        if(_hospitalWorkers == null)
        {
            System.out.println("Nie ma żadnych lekarzy.");
            return;
        }
        for(HospitalWorker hospitalWorker : _hospitalWorkers)
        {
            if(hospitalWorker instanceof Doctor)
                System.out.println(hospitalWorker);
        }
    }
}
