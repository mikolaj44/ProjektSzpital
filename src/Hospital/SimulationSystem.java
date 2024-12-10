package Hospital;

public class SimulationSystem extends HospitalSystem {

    private int updateSpeedMs;
    private Date date;

    public SimulationSystem(DepartmentManager manager, HospitalInfo hospitalInfo, Date date) {
        super(manager, hospitalInfo);
        this.updateSpeedMs = updateSpeedMs;
        this.date = date;
    }

    // TO DO :

    void update(){

    }

    void executeIllnesses(){

    }
}
