package Hospital;

import java.util.ArrayList;

import Person.Patient;

public class Room {

    private int capacity;
    private ArrayList<Patient> patients;

    public Room(int capacity, ArrayList<Patient> patients) {
        this.capacity = capacity;
        this.patients = patients;
    }

    @Override
    public String toString() {
        return "Room{" +
                "capacity=" + capacity +
                ", patients=" + patients +
                '}';
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }
}