package Hospital;

import java.util.ArrayList;
import java.util.PriorityQueue;

import Person.*;

public abstract class HospitalDepartment {

    protected String name;

    protected PriorityQueue<Person> queue;
    protected ArrayList<Patient> patients;
    protected ArrayList<HospitalWorker> workers;
    protected ArrayList<Room> rooms;

    //protected RoomManager roomManager;
    //protected PatientManager patientManager;

    protected ArrayList<FieldOfMedicine> possibleFields;

    public HospitalDepartment(String name, PriorityQueue<Person> queue, ArrayList<Patient> patients, ArrayList<HospitalWorker> workers, ArrayList<Room> rooms, ArrayList<FieldOfMedicine> possibleFields) {
        this.name = name;
        this.queue = queue;
        this.patients = patients;
        this.workers = workers;
        this.rooms = rooms;
        this.possibleFields = possibleFields;

        // większośc z tego może być generowana
    }

    @Override
    public String toString() {
        return "HospitalDepartment{" +
                "name='" + name + '\'' +
                ", queue=" + queue +
                ", patients=" + patients +
                ", workers=" + workers +
                ", rooms=" + rooms +
                ", possibleFields=" + possibleFields +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PriorityQueue<Person> getQueue() {
        return queue;
    }

    public void setQueue(PriorityQueue<Person> queue) {
        this.queue = queue;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    public ArrayList<HospitalWorker> getWorkers() {
        return workers;
    }

    public void setWorkers(ArrayList<HospitalWorker> workers) {
        this.workers = workers;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<FieldOfMedicine> getPossibleFields() {
        return possibleFields;
    }

    public void setPossibleFields(ArrayList<FieldOfMedicine> possibleFields) {
        this.possibleFields = possibleFields;
    }
}