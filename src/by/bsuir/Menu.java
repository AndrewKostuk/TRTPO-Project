package by.bsuir;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Menu {
   /* private int id = 36;
    private DataBaseORM dataBase;
    private Statement s;
    private MyDate date;

    public Menu(MyDate d) {
        this.date = d;
        dataBase = null;
        s = null;
        try {
            dataBase = new DataBaseORM();
            s = dataBase.getStatement();
            dataBase.clearAll(s);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void addNewTask(){
        int h, m, p;
        Scanner scanner = new Scanner(System.in);
        String t;
        System.out.print("Enter the tittle of the task: ");
        t = scanner.nextLine();
        System.out.print("Enter the hour of the task: ");
        h = scanner.nextInt();
        System.out.print("Enter the minute of the task: ");
        m = scanner.nextInt();
        System.out.print("Enter the priority of the task: ");
        p = scanner.nextInt();
        Task myTask = new Task(id++, t, date.getDay(), date.getMonth(), h, m, p);
        date.getTaskList().addNewTask(myTask);
        dataBase.insertTask(s, myTask);
    }

    public void editTask(){
        TaskList tList = date.getTaskList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("tasks size is: " + tList.getTaskList().size());
        System.out.print("enter index of the task you want to edit: ");
        int editIndex = scanner.nextInt();
        scanner.nextLine();
        tList.edit(editIndex);
        dataBase.editTask(s, tList.getTaskList().get(editIndex));
    }

    public void removeTask(){
        Scanner scanner = new Scanner(System.in);
        TaskList tList=date.getTaskList();
        System.out.println("tasks size is: " + tList.getTaskList().size());
        System.out.print("enter index of the task you want to delete: ");
        int deleteIndex = scanner.nextInt();
        scanner.nextLine();
        int deleteID = tList.getTaskList().get(deleteIndex).getId();
        tList.removeTask(deleteIndex);
       // dataBase.deleteTask(s, deleteID);
    }

    public void menu() throws SQLException {
        boolean exit = false;
        while (!exit) {
            System.out.println("1 - add new task");
            System.out.println("2 - edit task");
            System.out.println("3 - delete task");
            System.out.println("4 - exit");
            System.out.println("5 - print");
            int choose;
            Scanner scanner = new Scanner(System.in);
            choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    addNewTask();
                    break;
                case 2:
                    editTask();
                    break;
                case 3:
                    removeTask();
                    break;
                case 4:
                    exit = true;
                    break;
                case 5:
                    System.out.println(date.getTaskList());
                    break;
                default:
                    System.out.println("incorrect input");
            }
        }
        dataBase.closeStatement(s);
    }*/
}
