package demo;

public class Attendance {

    int totalWorkingDays;
    int presentDays;
    int absentDays;
    double attendancePercentage;
    int attendance;

    public void calculateAttendance() {

        absentDays = totalWorkingDays - presentDays;

        attendancePercentage =
                (presentDays * 100.0) / totalWorkingDays;
    }
}