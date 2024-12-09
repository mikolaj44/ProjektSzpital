package Hospital;

import java.util.ArrayList;

public class HospitalInfo {

    private int maxRoomCapacity;
    private int maxRoomAmountPerDepartment;
    private ArrayList<HospitalDepartment> departments;

    public HospitalInfo(int maxRoomCapacity, int maxRoomAmountPerDepartment, ArrayList<HospitalDepartment> departments) {
        this.maxRoomCapacity = maxRoomCapacity;
        this.maxRoomAmountPerDepartment = maxRoomAmountPerDepartment;
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "maxRoomCapacity=" + maxRoomCapacity +
                ", maxRoomAmountPerDepartment=" + maxRoomAmountPerDepartment +
                ", departments=" + departments +
                '}';
    }

    public int getMaxRoomCapacity() {
        return maxRoomCapacity;
    }

    public void setMaxRoomCapacity(int maxRoomCapacity) {
        this.maxRoomCapacity = maxRoomCapacity;
    }

    public int getMaxRoomAmountPerDepartment() {
        return maxRoomAmountPerDepartment;
    }

    public void setMaxRoomAmountPerDepartment(int maxRoomAmountPerDepartment) {
        this.maxRoomAmountPerDepartment = maxRoomAmountPerDepartment;
    }

    public ArrayList<HospitalDepartment> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<HospitalDepartment> departments) {
        this.departments = departments;
    }

    public static class System {

        private DepartmentManager manager;
        private HospitalInfo hospitalInfo;


    }
}
