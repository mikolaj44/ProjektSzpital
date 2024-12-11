//package Tests;
//
//import GenerationAndIO.*;
//import Hospital.HospitalDepartment;
//import Person.HospitalWorker;
//import Person.Patient;
//
//import java.util.ArrayList;
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class Main {
//
//    private static ArrayList<GuiElement> _consoleMenuOptions;
//
//    public static void main(String[] args) {
//
//        ArrayList<Patient> patients = new ArrayList<>();
//        ArrayList<HospitalWorker> workers = new ArrayList<>();
//
//        // TO DO: add doctors (cannot now because doctor is abstract)
//
//        // How to pass data to classes that output co console?
//        // - I think: they deal with that through their own methods (handling user input etc.)
//
//        // In what class are all patients and workers?
//        // - Answer: in each of the HospitalDepartments
//
//        //workers.add()
//
//        _consoleMenuOptions = new ArrayList<>();
//
//        _consoleMenuOptions.add(new GuiInputPatient(patients));
//        _consoleMenuOptions.add(new GuiInputDoctor(workers));
//        _consoleMenuOptions.add(new GuiShowAllPatients(patients));
//        _consoleMenuOptions.add(new GuiShowAllDoctors(workers));
//
//        // performAction all options
//        while (true) {
//            if (!showMenu()) break;
//        }
//    }
//
//    // returns false if chosen option "end" else return true
//    private static boolean showMenu() {
//        int i;
//        // performAction all options to choose
//        for(i = 0; i < _consoleMenuOptions.size(); i++)
//        {
//            // variable i will be shown from 1 to n+1
//            System.out.println((i+1) + ". " + _consoleMenuOptions.get(i).getDescription());
//        }
//        // add options to end program
//        System.out.println((i + 1)  + ". Zakończ.");
//        Scanner scanner = new Scanner(System.in);
//        try
//        {
//            // variable i will be shown from 1 to n+1
//            int chosenVal =  scanner.nextInt() - 1;
//            if (chosenVal == i)
//                return false;
//            _consoleMenuOptions.get(chosenVal).performAction();
//        }
//        catch(InputMismatchException e)
//        {
//            System.out.println("Podaj numer opcji.");
//        }
//        catch(IndexOutOfBoundsException e)
//        {
//            System.out.println("Nie ma takiej opcji.");
//        }
//        return true;
//    }
//}