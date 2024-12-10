package GenerationAndIO;

import Person.Doctor;
import Person.HospitalWorker;

import javax.print.Doc;
import java.util.List;

public class ConsoleIODoctor implements ConsoleImputable
{
    private List<HospitalWorker> _hospitalWorkers;
    public ConsoleIODoctor() {
    }
    public ConsoleIODoctor(List<HospitalWorker> hospitalWorkers) {
    }

    @Override
    public String GetDescription() {
        return "Wyświetlanie lekarzy";
    }

    @Override
    public void ShowMenu() {
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
