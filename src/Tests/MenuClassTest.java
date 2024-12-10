package Tests;

import GenerationAndIO.*;
import Hospital.HospitalDepartment;
import Person.HospitalWorker;
import Person.Patient;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuClassTest {

    public static void main(String[] args) {

        ArrayList<Patient> patients = new ArrayList<>();
        ArrayList<HospitalWorker> workers = new ArrayList<>();

        Menu mainMenu = new Menu(new GuiInputPatient(patients), new GuiInputDoctor(workers), new GuiShowAllPatients(patients), new GuiShowAllDoctors(workers));

        while (true) {
            if (!mainMenu.showMenu()) break;
        }
    }
}