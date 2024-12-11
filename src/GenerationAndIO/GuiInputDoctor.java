package GenerationAndIO;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import Hospital.HospitalDepartment;
import Hospital.HospitalInfo;
import Person.*;

import static ListUtils.ListPrint.*;

public class GuiInputDoctor implements GuiElement{

    private HospitalInfo _hospitalInfo;

    public GuiInputDoctor() {
    }

    public GuiInputDoctor(HospitalInfo hospitalInfo) {
        _hospitalInfo = hospitalInfo;
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

        System.out.print("Podaj godzinę rozpoczęcia pracy: ");
        int startHour = scanner.nextInt();
        System.out.println();

        System.out.print("Podaj godzinę zakończenia pracy: ");
        int endHour = scanner.nextInt();
        System.out.println();

        // TU JESZCZE MU WPISAĆ SPECJALIZACJĘ

        System.out.println("Wydziały w szpitalu:");
        printLnList(_hospitalInfo.getDepartments());
        System.out.println();

        System.out.println("Podaj numer wydziału:");
        int number = scanner.nextInt();

        if(number <= 0 || number > _hospitalInfo.getDepartments().size()) // dodać komunikaty itd
            return;

        HospitalDepartment department = _hospitalInfo.getDepartments().get(number - 1);

        HospitalDepartment.RoomManager roomManager = department.new RoomManager(); // to boli
        HospitalDepartment.PersonManager personManager = department.new PersonManager();

        Doctor doctor = new ExampleDoctor(name, surname, age, isMale, nationality, startHour, endHour, new FieldOfMedicine(new ArrayList<>()) );

        personManager.addHospitalWorker(doctor);

        System.out.println("Doktor dodany pomyślnie");
    }
}
