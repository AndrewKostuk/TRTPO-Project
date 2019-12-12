package by.bsuir;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {

    private  int day;
    private int month;
    private TaskList taskList;

    public MyDate(int d, int m) {
        setMonth(m);
        setDay(d);
        taskList = new TaskList();
    }

    public boolean checkMonth(int m) {
        if (m >= 1 && m <= 12) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkDay(int d) {
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.set(2019, getMonth(), 1);
        int maxDay = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
        if (d >= 1 && d <= maxDay) {
            return true;
        } else {
            return false;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(checkDay(day)) {
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(checkMonth(month)) {
            this.month = month;
        }
    }

    public TaskList getTaskList() {
        return taskList;
    }

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }
}
