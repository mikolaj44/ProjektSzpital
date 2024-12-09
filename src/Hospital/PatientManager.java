package Hospital;

import Person.*;

public class PatientManager extends DepartmentManager{

    private HospitalDepartment department;

    public PatientManager(HospitalDepartment department) {
        super(department);
    }

    public boolean addPatientFromQueue(){

        if(department.queue.isEmpty())
            return false;

        department.patients.add((Patient)department.queue.poll()); // dodajemy do pacjentów i usuwamy z kolejki

        return true;
    }

    public boolean assignDoctor(Patient p){ // to do

        if(department.workers == null || department.workers.isEmpty())
            return false;

        int minNumberOfPatients = Integer.MAX_VALUE;
        Doctor minDoctor = null;

        for(HospitalWorker worker : department.workers){

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