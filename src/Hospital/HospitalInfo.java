package Hospital;

import java.util.ArrayList;

public class HospitalInfo {

    private int maxRoomAmountPerDepartment;
    private ArrayList<HospitalDepartment> departments;

    public HospitalInfo(int maxRoomAmountPerDepartment, ArrayList<HospitalDepartment> departments) {
        this.maxRoomAmountPerDepartment = maxRoomAmountPerDepartment;
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                ", maxRoomAmountPerDepartment=" + maxRoomAmountPerDepartment +
                ", departments=" + departments +
                '}';
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
}
