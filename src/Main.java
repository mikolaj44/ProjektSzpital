import GenerationAndIO.ConsoleImputable;
import Person.Patient;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Patient> patients = new ArrayList<Patient>();

        List<ConsoleImputable> listOfOptions = new ArrayList<ConsoleImputable>();
        for(int i = 1; i <= listOfOptions.size(); i++)
        {
            System.out.println(i + ". " + listOfOptions.get(i).GetDescription());
        }
        Scanner scanner = new Scanner(System.in);
        try
        {
            int choose =  scanner.nextInt();
            listOfOptions.get(choose).ShowMenu();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Podaj numer opcji.");
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("Nie ma takiej opcji.");
        }
    }
}