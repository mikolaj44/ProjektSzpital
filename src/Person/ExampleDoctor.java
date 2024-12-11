package Person;

import java.util.ArrayList;

public class ExampleDoctor extends Doctor{

    public ExampleDoctor(String name, String surname, double age, boolean isMale, String nationality, int startWorkHour, int endWorkHour, FieldOfMedicine fieldOfMedicine) {
        super(name, surname, age, isMale, nationality, startWorkHour, endWorkHour, fieldOfMedicine);
    }

    @Override
    public void update(Subject s){

    }

    @Override
    public void diagnose(Patient p) {

    }
}
