package Hospital;

public abstract class HospitalSystem {

    protected DepartmentManager departmentManager;
    protected HospitalInfo hospitalInfo;

    public HospitalSystem(DepartmentManager manager, HospitalInfo hospitalInfo) {
        this.departmentManager = manager;
        this.hospitalInfo = hospitalInfo;
    }

}
