package Person;

import java.util.ArrayList;

public class FieldOfMedicine {

    private ArrayList<Illness> treatableIllnesses;

    public FieldOfMedicine(ArrayList<Illness> treatableIllnesses) {
        this.treatableIllnesses = treatableIllnesses;
    }

    @Override
    public String toString() {
        return "FieldOfMedicine{" +
                "treatableIllnesses=" + treatableIllnesses +
                '}';
    }

    public ArrayList<Illness> getTreatableIllnesses() {
        return treatableIllnesses;
    }

    public void setTreatableIllnesses(ArrayList<Illness> treatableIllnesses) {
        this.treatableIllnesses = treatableIllnesses;
    }
}
