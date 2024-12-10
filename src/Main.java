import GenerationAndIO.ConsoleIODoctor;
import GenerationAndIO.ConsoleIOViewAllPatients;
import GenerationAndIO.ConsoleImputable;
import Person.HospitalWorker;
import Person.Patient;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<ConsoleImputable> _ConsoleMenuOptions;

    public static void main(String[] args) {

        ArrayList<Patient> patients = new ArrayList<>();
        ArrayList<HospitalWorker> workers = new ArrayList<>();

        // TO DO: add doctors (cannot now because doctor is abstract)
        // How to pass data to classes that output co console?
        // In what class are all patients and workers?
        //workers.add()

        _ConsoleMenuOptions = new ArrayList<>();
        _ConsoleMenuOptions.add(new ConsoleIOViewAllPatients(patients));
        _ConsoleMenuOptions.add(new ConsoleIODoctor(workers));
        // show all options
        while (true) {
            if (!ShowMenu()) break;
        }
    }

    // returns false if chosen option "end" else return true
    private static boolean ShowMenu() {
        int i;
        // show all options to choose
        for(i = 0; i < _ConsoleMenuOptions.size(); i++)
        {
            // variable i will be shown from 1 to n+1
            System.out.println((i+1) + ". " + _ConsoleMenuOptions.get(i).GetDescription());
        }
        // add options to end program
        System.out.println((i + 1)  + ". Zakończ.");
        Scanner scanner = new Scanner(System.in);
        try
        {
            // variable i will be shown from 1 to n+1
            int choose =  scanner.nextInt() - 1;
            if (choose == i)
                return false;
            _ConsoleMenuOptions.get(choose).ShowMenu();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Podaj numer opcji.");
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("Nie ma takiej opcji.");
        }
        return true;
    }
}