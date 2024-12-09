package Hospital;

public class SimulationSystem extends HospitalSystem {

    private int updateSpeedMs;
    private int hoursPassed;
    private int daysPassed;

    public SimulationSystem(DepartmentManager manager, HospitalInfo hospitalInfo, int updateSpeedMs, int hoursPassed, int daysPassed) {
        super(manager, hospitalInfo);
        this.updateSpeedMs = updateSpeedMs;
        this.hoursPassed = hoursPassed;
        this.daysPassed = daysPassed;
    }

    // TO DO :

    void update(){

    }

    void executeIllnesses(){

    }
}
