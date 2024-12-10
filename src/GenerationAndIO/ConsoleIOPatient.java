package GenerationAndIO;

import Person.Patient;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ConsoleIOPatient implements ConsoleImputable {

    private ArrayList<Patient> _patients;

    public ConsoleIOPatient() {
        _patients = new ArrayList<>();
    }

    public ConsoleIOPatient(ArrayList<Patient> patients) {
        _patients = patients;
    }

    @Override
    public String GetDescription() {
        return "Wprowadzanie pacjenta do systemu";
    }

    @Override
    public void ShowMenu() {
        Scanner scanner = new Scanner(System.in);

        // Póki co nie sprawdza poprawności wpisywanych danych

        System.out.print("Podaj imie pacjenta: ");
        String name = scanner.nextLine();
        System.out.println();

        System.out.print("Podaj nazwisko pacjenta: ");
        String surname = scanner.nextLine();
        System.out.println();

        System.out.print("Podaj wiek pacjenta: ");
        int age = scanner.nextInt();
        System.out.println();

        // Nie sprawdza na ten moment czy użytkownik dał poprawna odpowiedź
        System.out.print("Podaj plec pacjenta (M/K): ");
        String sexString = scanner.nextLine();

        boolean isMale;

        isMale = Objects.equals(sexString, "M");

        System.out.print("Podaj narodowosc pacjenta: ");
        String nationality = scanner.nextLine();
        System.out.println();

        System.out.print("Podaj powód przybycia pacjenta i opis stanu pacjenta: ");
        String description = scanner.nextLine();
        System.out.println();

        _patients.add(new Patient(name, surname, age, isMale, nationality, description));

        System.out.println("Pacjent dodany pomyślnie");
    }
}
