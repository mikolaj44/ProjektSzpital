import GenerationAndIO.ConsoleIODoctor;
import GenerationAndIO.ConsoleImputable;
import Person.Patient;
import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<ConsoleImputable> _ConsoleMenuOprions;

    public static void main(String[] args) {

        ArrayList<Patient> patients = new ArrayList<Patient>();

        _ConsoleMenuOprions = new ArrayList<ConsoleImputable>();
        _ConsoleMenuOprions.add(new ConsoleIODoctor());
        // show all options
        while (ShowMenu()) {

        }
    }

    // returns false if chosen option "end" else return true
    private static boolean ShowMenu() {
        int i;
        // show all options to choose
        for(i = 0; i < _ConsoleMenuOprions.size(); i++)
        {
            // variable i will be shown from 1 to n+1
            System.out.println((i+1) + ". " + _ConsoleMenuOprions.get(i).GetDescription());
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
            _ConsoleMenuOprions.get(choose).ShowMenu();
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