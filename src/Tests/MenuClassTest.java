package Tests;

import GenerationAndIO.*;
import Hospital.HospitalDepartment;
import Hospital.HospitalInfo;
import Person.HospitalWorker;
import Person.Patient;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuClassTest {

    public static void main(String[] args) {

        ArrayList<HospitalDepartment> departments = new ArrayList<>();
        departments.add(new HospitalDepartment("SOR"));
        departments.add(new HospitalDepartment("Oddzial polozniczy"));

        HospitalInfo hospitalInfo = new HospitalInfo(-1,-1,departments);

        Menu mainMenu = new Menu(new GuiInputPatient(hospitalInfo), new GuiInputDoctor(hospitalInfo), new GuiShowAllPatients(hospitalInfo), new GuiShowAllDoctors(hospitalInfo));

        while (true) {
            if (!mainMenu.showMenu()) break;
        }
    }
}