package by.bsuir;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    //Connection co;

    /*public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Menu men = new Menu();
        MyCalendar cal = new MyCalendar();
        int choose;
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        *//*Task t1=new Task("a", 01, 12, 12, 32, 1);
        DataBaseORM db1=new DataBaseORM();
        PreparedStatement statement= db1.getPreparedStatement();
        db1.insertTask(statement, t1);*//*
        while (!exit) {
            System.out.println("1 - add new day");
            // System.out.println("2 - calendar size");
            System.out.println("3 - choose the day");
            System.out.println("4 - exit");
            System.out.println("5 - print");
            choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    cal.addNewDate();
                    break;
                *//*case 2:
                    System.out.println("calendar size: "+cal.getCalendar().size());
                    break;*//*
                case 3:
                    System.out.println("calendar size: " + cal.getCalendar().size());
                    System.out.print("Enter index of day you want to work: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    MyDate chosenDay = cal.getCalendar().get(index);
                    men.menu(chosenDay.getTaskList(), chosenDay.getDay(), chosenDay.getMonth());
                    break;
                case 4:
                    exit = true;
                    break;
                case 5:
                    System.out.println(cal);
                    break;
                default:
                    System.out.println("Incorrect choose");
            }
        }

       *//* Main program = new Main();
        program.open();
        program.insert();
        program.close();*//*
    }*/
//    void open() {
//        try {
//            Class.forName("org.sqlite.JDBC");
//            co = DriverManager.getConnection("jdbc:sqlite:D:\\SQLite\\users.db");
//            System.out.println("Connected");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    void insert() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter next name: ");
//        String name = scanner.nextLine();
//        System.out.println("Enter next phone: ");
//        String number = scanner.nextLine();
//
//        String query = "INSERT INTO users (name, phone) " +
//                "VALUES ('" + name + "', '" + number + "')";
//        try {
//            Statement statement = co.createStatement();
//            statement.executeUpdate(query);
//            System.out.println("All good");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    void close() {
//        try {
//            co.close();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
}