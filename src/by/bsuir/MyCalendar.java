package by.bsuir;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyCalendar {

    private ArrayList<MyDate> calendar;
    Calendar sysCalendar= GregorianCalendar.getInstance();

    public ArrayList<MyDate> getCalendar() {
        return calendar;
    }

    public  MyCalendar(){
        calendar= new ArrayList<>();
        MyDate startDate=new MyDate(sysCalendar.get(Calendar.DATE), sysCalendar.get(Calendar.MONTH)+1);
        calendar.add(startDate);
    }

    public void addNewDate(){
        int previousSize=calendar.size();
        sysCalendar.add(sysCalendar.DATE, 1);
        MyDate newDate=new MyDate(sysCalendar.get(Calendar.DATE), sysCalendar.get(Calendar.MONTH)+1);
        calendar.add(newDate);
    }



    @Override
    public String toString(){
        StringBuilder s = new StringBuilder(512);
        for (MyDate md:calendar
             ) {
            s.append(md.getDay()+"."+md.getMonth()+".2019\n");
            s.append(md.getTaskList().toString());
        }
        return s.toString();
    }
}
