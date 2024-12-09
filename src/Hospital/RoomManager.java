package Hospital;

import java.util.ArrayList;

import Person.*;

public class RoomManager extends DepartmentManager{

    private HospitalDepartment department;

    public RoomManager(HospitalDepartment department) {
        super(department);
    }

    boolean assignRoom(Patient p){

        for(Room room : department.rooms){ // można to inaczej dodawać, z innej strony czy coś ale tak wstępnie

            if(room.getPatients().size() < room.getCapacity()){
                ArrayList<Patient> newPatientList = room.getPatients();
                newPatientList.add(p);
                room.setPatients(newPatientList);
                return true;
            }
        }
        return false;
    }

    boolean removeFromRoom(Patient p){

        for(Room room : department.rooms){

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