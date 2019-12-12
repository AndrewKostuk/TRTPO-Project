package by.bsuir;

public class Time {
    private int hour;
    private int minute;

    public Time(int hour, int minute){
        setHour(hour);
        setMinute(minute);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        try {
            if (!checkHour(hour)) throw new IllegalArgumentException();
            this.hour = hour;
        } catch (IllegalArgumentException ex) {
            System.out.println("Illegal hour");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        try {
            if (!checkMinute(minute)) throw new IllegalArgumentException();
            this.minute = minute;
        } catch (IllegalArgumentException ex) {
            System.out.println("Illegal minute");
        }
    }

    public boolean checkHour(int hour) {
        if (hour >= 0 && hour < 24) return true;
        else return false;
    }

    public boolean checkMinute(int minute) {
        if (minute >= 0 && minute < 60) return true;
        else return false;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(10);
        s.append(this.getHour() + ":" + String.format("%02d", this.getMinute()) + "\n");
        return s.toString();
    }
}