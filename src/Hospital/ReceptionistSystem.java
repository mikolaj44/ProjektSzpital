package Hospital;

import Person.*;

import java.util.Scanner;

public class ReceptionistSystem extends HospitalSystem{

    public ReceptionistSystem(DepartmentManager departmentManager, HospitalInfo hospitalInfo) {
        super(departmentManager, hospitalInfo);
    }

    // TO DO:

    public static boolean wpiszOsobe(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podawaj kolejne pola klasy . Żeby anulować kiedykolwiek, wpisz 'esc'.");

        String currentInput = "";

        Patient patient = new Patient();

        String[] fieldNamesPatient = {"imię", "nazwisko", "wiek", "czy jest mężczyzną", "narodowość", "*", "opis"};

        int fieldIndex = 0;

        while(fieldIndex < fieldNamesPatient.length){

            if(fieldNamesPatient[fieldIndex].equals("*"))
                fieldIndex++;

            System.out.println(fieldNamesPatient[fieldIndex] + ": ");
            currentInput = scanner.next();

            if (currentInput.equals("esc"))
                return false;

            boolean result = patient.setField(fieldIndex, currentInput);

            if (!result) {
                System.out.println("Nie można ustawić pola.");
            }
            else{
                fieldIndex++;
            }
        }

        // podać wydział
        // sprawdzić w liście wydziałów i znaleźć wydział
        // hospitalInfo.departments.znalezionyWydzial.patients.add(patient)

        return true;
    }
}
