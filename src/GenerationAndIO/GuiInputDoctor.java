package GenerationAndIO;

import Person.Doctor;
import Person.HospitalWorker;
import Person.Patient;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class GuiInputDoctor implements GuiElement{

    private List<HospitalWorker> _hospitalWorkers;

    public GuiInputDoctor() {
        _hospitalWorkers = new ArrayList<>();
    }

    public GuiInputDoctor(List<HospitalWorker> hospitalWorkers) {
        _hospitalWorkers = hospitalWorkers;
    }

    @Override
    public String getDescription() {
        return "Wprowadzanie lekarza do systemu";
    }

    @Override
    public void performAction() {
        Scanner scanner = new Scanner(System.in);

        // Póki co nie sprawdza poprawności wpisywanych danych

        System.out.print("Podaj imie doktora: ");
        String name = scanner.nextLine();
        System.out.println();

        System.out.print("Podaj nazwisko doktora: ");
        String surname = scanner.nextLine();
        System.out.println();

        System.out.print("Podaj wiek doktora: ");
        int age = scanner.nextInt();
        System.out.println();

        // Nie sprawdza na ten moment czy użytkownik dał poprawna odpowiedź
        scanner.nextLine();
        System.out.print("Podaj plec doktora (M/K): ");
        String sexString = scanner.nextLine();
        System.out.println();

        boolean isMale;

        isMale = Objects.equals(sexString, "M");

        System.out.print("Podaj narodowosc doktora: ");
        String nationality = scanner.nextLine();
        System.out.println();

        // TO DO

        //_hospitalWorkers.add(new Doctor(name, surname, age, isMale, nationality));

        System.out.println("Doktor dodany pomyślnie");
    }
}
