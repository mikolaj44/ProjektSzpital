package Hospital;

import java.util.ArrayList;
import java.util.PriorityQueue;

import Person.*;

public class HospitalDepartment {

    protected String name;

    protected PriorityQueue<Person> queue; // NA RAZIE NIEUŻYWANA
    protected ArrayList<Patient> patients;
    protected ArrayList<HospitalWorker> workers;
    protected ArrayList<Room> rooms;

    // jednak będą jako osobne a nie wewnętrzne chyba \/\/\/

    //protected RoomManager roomManager;
    //protected PatientManager patientManager;

    protected ArrayList<FieldOfMedicine> possibleFields;

    public HospitalDepartment(String name){
        this.name = name;
        this.queue = new PriorityQueue<>();
        this.patients = new ArrayList<>();
        this.workers = new ArrayList<>();
        this.rooms = new ArrayList<>();
        this.possibleFields = new ArrayList<>();
    }

    public HospitalDepartment(String name, PriorityQueue<Person> queue, ArrayList<Patient> patients, ArrayList<HospitalWorker> workers, ArrayList<Room> rooms, ArrayList<FieldOfMedicine> possibleFields) {
        this.name = name;
        this.queue = queue;
        this.patients = patients;
        this.workers = workers;
        this.rooms = rooms;
        this.possibleFields = possibleFields;

        // większośc z tego może być generowana
    }

    public class RoomManager {

        public boolean assignRoom(Patient p){

            for(Room room : rooms){ // można to inaczej dodawać, z innej strony czy coś ale tak wstępnie

                if(room.getPatients().size() < room.getCapacity()){

                    ArrayList<Patient> newPatientList = room.getPatients();
                    newPatientList.add(p);
                    room.setPatients(newPatientList);
                    return true;
                }
            }
            return false;
        }

        public boolean removeFromRoom(Patient p){

            for(Room room : rooms){

                if(room.getPatients().contains(p)){

                    ArrayList<Patient> newPatientList = room.getPatients();
                    newPatientList.remove(p);
                    room.setPatients(newPatientList);
                    return true;
                }
            }
            return false;
        }
    }


    public class PersonManager {

        public boolean addHospitalWorker(HospitalWorker worker){
            workers.add(worker);
            return true;
        }

        public boolean removeHospitalWorker(HospitalWorker worker){

            if(workers.isEmpty())
                return false;

            for(HospitalWorker w : workers){

                if(w.equals(worker)){
                    workers.remove(worker);
                    return true;
                }
            }
            return false;
        }

        public boolean addPatient(Patient patient){
            patients.add(patient);
            return true;
        }

        public boolean removePatient(Patient patient){

            if(patients.isEmpty())
                return false;

            for(Patient p : patients){

                if(p.equals(patient)){
                    patients.remove(patient);
                    return true;
                }
            }
            return false;
        }

        public boolean addPatientFromQueue(){

            if(queue.isEmpty())
                return false;

            patients.add((Patient)queue.poll()); // dodajemy do pacjentów i usuwamy z kolejki

            return true;
        }

        public boolean assignDoctor(Patient p){ // to do

            if(workers == null || workers.isEmpty())
                return false;

            int minNumberOfPatients = Integer.MAX_VALUE;
            Doctor minDoctor = null;

            for(HospitalWorker worker : workers){

                if(worker instanceof Doctor){

                    int numberOfPatients = ((Doctor)worker).getPatients().size();
                    if(numberOfPatients  < minNumberOfPatients ) {
                        minDoctor = (Doctor) worker;
                        minNumberOfPatients = numberOfPatients;
                    }
                }
            }

            if(minDoctor == null)
                return false;

            minDoctor.registerWith(p);

            return true;
        }

        public boolean removeDoctor(Patient p, Doctor d){

            if(p.getDoctors() == null || p.getDoctors().isEmpty())
                return false;

            d.unRegisterWith((Subject)p);

            return true;
        }
    }

    public class SimulationSystem {

        //będzie mogła być jakaś składowa SimulationInfo szpitala, w której będą te dane co wykomentowałem:

        //private int updateSpeedMs;
        //private Date date;

        // TO DO :

        void update() {

        }

        void executeIllnesses() {

        }
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