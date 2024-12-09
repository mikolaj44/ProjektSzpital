package Hospital;

public abstract class DepartmentManager {

    protected HospitalDepartment department;

    public DepartmentManager(HospitalDepartment department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "DepartmentManager{" +
                "department=" + department +
                '}';
    }

    public HospitalDepartment getDepartment() {
        return department;
    }

    public void setDepartment(HospitalDepartment department) {
        this.department = department;
    }
}
