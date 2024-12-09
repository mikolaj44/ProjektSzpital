package Hospital;

import Person.*;

public class PatientManager extends DepartmentManager{

    private HospitalDepartment department;

    public PatientManager(HospitalDepartment department) {
        super(department);
    }

    public boolean addPatientFromQueue(){ // to do
        return false;
    }

    public boolean assignDoctor(Patient p){ // to do
        return false;
    }

    public boolean removeDoctor(Patient p){
        return false;
    }
}