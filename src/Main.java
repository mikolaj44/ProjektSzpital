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
        // show all options
        while (ShowMenu()) {

        }
    }

    // returns false if chosen option "end" else return true
    private static boolean ShowMenu() {
        int i;
        // show all options to choose
        for(i = 1; i <= _ConsoleMenuOprions.size(); i++)
        {
            System.out.println(i + ". " + _ConsoleMenuOprions.get(i).GetDescription());
        }
        // add options to end program
        i++;
        System.out.println(i + ". Zakończ.");
        Scanner scanner = new Scanner(System.in);
        try
        {
            int choose =  scanner.nextInt();
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