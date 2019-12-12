package by.bsuir;

public class Task {
    private  int id;
    private Time time;
    private  int day;
    private  int month;
    private boolean isDone;
    private String title;
    private int priority;

    public Task(int id, String n, int d, int month, int h, int m, int p) {
        setId(id);
        time = new Time(h, m);
        setDay(d);
        setMonth(month);
        isDone = false;
        setTitle(n);
        setPriority(p);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Time getTime(){
        return time;
    }

    public void setTime(int h, int m){
        time.setHour(h);
        time.setMinute(m);
    }

    public  int getDay() {
        return day;
    }

    public void setDay(int d) {
        this.day = d;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int m) {
        this.month = m;
    }

    public void changeStatus() {
        isDone = !getStatus();
    }

    public boolean getStatus() {
        return isDone;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        try {
            if (!checkPriority(priority)) throw new IllegalArgumentException();
            this.priority = priority;
        } catch (IllegalArgumentException ex) {
            System.out.println("Illegal priority");
        }
    }

    public boolean checkPriority(int priority) {
        if (priority >= 1 && priority <= 3) return true;
        else return false;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(40);
        s.append("id: "+id+"\n");
        s.append(title +"\n");
        s.append("time: "+time.toString());
        s.append("status: "+isDone+"\n");
        s.append("priority: "+priority+"\n\n");
        return s.toString();
    }
}
