package GenerationAndIO;

import java.util.Objects;
import java.util.Scanner;

import Hospital.HospitalDepartment;
import Hospital.HospitalInfo;
import Person.Patient;

import static ListUtils.ListPrint.*;

public class GuiInputPatient implements GuiElement {

    private HospitalInfo _hospitalInfo;

    public GuiInputPatient() {
    }

    public GuiInputPatient(HospitalInfo hospitalInfo) {
        _hospitalInfo = hospitalInfo;
    }

    @Override
    public String getDescription() {
        return "Wprowadzanie pacjenta do systemu";
    }

    @Override
    public void performAction() {
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
        scanner.nextLine();
        System.out.print("Podaj plec pacjenta (M/K): ");
        String sexString = scanner.nextLine();
        System.out.println();

        boolean isMale;

        isMale = Objects.equals(sexString, "M");

        System.out.print("Podaj narodowosc pacjenta: ");
        String nationality = scanner.nextLine();
        System.out.println();

        System.out.print("Podaj powód przybycia pacjenta i opis stanu pacjenta: ");
        String description = scanner.nextLine();
        System.out.println();

        System.out.println("Wydziały w szpitalu:");
        printLnList(_hospitalInfo.getDepartments());
        System.out.println();

        System.out.println("Podaj numer wydziału:");
        int number = scanner.nextInt();

        if (number <= 0 || number > _hospitalInfo.getDepartments().size()) // dodać komunikaty itd
            return;

        HospitalDepartment department = _hospitalInfo.getDepartments().get(number - 1);

        HospitalDepartment.RoomManager roomManager = department.new RoomManager(); // to boli
        HospitalDepartment.PersonManager personManager = department.new PersonManager();

        Patient patient = new Patient(name, surname, age, isMale, nationality, description);

        personManager.addPatient(patient);

        // CHWILOWO TAK USTAWIAM
        boolean result = true; // roomManager.assignRoom(patient);

        if (!result) {
            System.out.println("Nie można dodać pacjenta - brak miejsca na salach");
            personManager.removePatient(patient);
            return;
        }

        System.out.println("Pacjent dodany pomyślnie");
    }
}
