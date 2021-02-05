package DayOfWeek;

public enum DayOfWeek {
    MONDAY(40, true),
    TUESDAY(32, true),
    WEDNESDAY(24, true),
    THURSDAY(16, true),
    FRIDAY(8, true),
    SATURDAY(0, false),
    SUNDAY(0, false);
    private  int workingHours;
    private boolean workingDay;

    public int getWorkingHours() {
        return workingHours;
    }


    DayOfWeek(int workingHours, boolean workingDay) {
        this.workingDay = workingDay;
        this.workingHours = workingHours;
    }
    public boolean isWorkingDay(){
        return workingDay;
    }
}
