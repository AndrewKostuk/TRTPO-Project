package by.bsuir;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskList {
    private ArrayList<Task> taskList;

    public ArrayList<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(ArrayList<Task> taskList) {
        this.taskList = taskList;
    }

   public TaskList() {
       taskList = new ArrayList<>();
   }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(256);
        for (Task t : taskList) {
            s.append(t.toString());
        }
        return s.toString();
    }



    public void addNewTask(Task t){
        taskList.add(t);
    }

    public void edit(int index){
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        int choose;
        while(!exit){
            System.out.println("1 - change title");
            System.out.println("2 - change time");
            System.out.println("3 - change priority");
            System.out.println("4 - exit");
            choose=scanner.nextInt();
            scanner.nextLine();
            switch(choose){
                case 1:
                    String newTitle;
                    System.out.print("Enter new title: ");
                    newTitle= scanner.nextLine();
                    taskList.get(index).setTitle(newTitle);
                    break;
                case 2:
                    int newHour, newMinute;
                    System.out.print("Enter new hour: ");
                    newHour=scanner.nextInt();
                    System.out.print("Enter new minute: ");
                    newMinute=scanner.nextInt();
                    taskList.get(index).setTime(newHour, newMinute);
                    break;
                case 3:
                    int newPriority;
                    System.out.print("Enter new priority: ");
                    newPriority=scanner.nextInt();
                    taskList.get(index).setPriority(newPriority);
                    break;
                case 4:
                    exit=true;
                    break;
                default:
                    System.out.println("Incorrect choose");
            }
        }
    }

    public void removeTask(int index){
        taskList.remove(index);
    }
}
