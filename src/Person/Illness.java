package Person;

public abstract class Illness {

    private String name;
    private String description;
    private int averageRecoveryTimeDays;
    private int dayWhenDiagnosed;
    private double lethality;
    private double effectMultiplier;
    private boolean surgeryIsNeeded;

    public Illness(String name, String description, int averageRecoveryTimeDays, int dayWhenDiagnosed, double lethality, double effectMultiplier, boolean surgeryIsNeeded) {
        this.name = name;
        this.description = description;
        this.averageRecoveryTimeDays = averageRecoveryTimeDays;
        this.dayWhenDiagnosed = dayWhenDiagnosed;
        this.lethality = lethality;
        this.effectMultiplier = effectMultiplier;
        this.surgeryIsNeeded = surgeryIsNeeded;
    }

    public abstract void performAction(Patient p);

    public boolean hasBeenHealed(int currentDateDays){

        if(currentDateDays < averageRecoveryTimeDays)
            return false;

        if(Math.random() % 10 < 5) // przykładowo
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "Illness{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", averageRecoveryTimeDays=" + averageRecoveryTimeDays +
                ", dayWhenDiagnosed=" + dayWhenDiagnosed +
                ", lethality=" + lethality +
                ", effectMultiplier=" + effectMultiplier +
                ", surgeryIsNeeded=" + surgeryIsNeeded +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAverageRecoveryTimeDays() {
        return averageRecoveryTimeDays;
    }

    public void setAverageRecoveryTimeDays(int averageRecoveryTimeDays) {
        this.averageRecoveryTimeDays = averageRecoveryTimeDays;
    }

    public int getDayWhenDiagnosed() {
        return dayWhenDiagnosed;
    }

    public void setDayWhenDiagnosed(int dayWhenDiagnosed) {
        this.dayWhenDiagnosed = dayWhenDiagnosed;
    }

    public double getLethality() {
        return lethality;
    }

    public void setLethality(double lethality) {
        this.lethality = lethality;
    }

    public double getEffectMultiplier() {
        return effectMultiplier;
    }

    public void setEffectMultiplier(double effectMultiplier) {
        this.effectMultiplier = effectMultiplier;
    }

    public boolean isSurgeryIsNeeded() {
        return surgeryIsNeeded;
    }

    public void setSurgeryIsNeeded(boolean surgeryIsNeeded) {
        this.surgeryIsNeeded = surgeryIsNeeded;
    }
}
