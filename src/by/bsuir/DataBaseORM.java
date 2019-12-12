package by.bsuir;

import java.sql.*;

public class DataBaseORM {
    private final static String SQL_INSERT =
            "INSERT INTO tasks(title, day, month, hour, minute, isDone, priority) VALUES('";
    private final static String SQL_UPDATE =
            "UPDATE tasks SET title = '";
    private final static String SQL_DELETE =
            "DELETE FROM tasks WHERE id = ";
    private final static String SQL_COUNT = "SELECT COUNT(*) FROM tasks";


    private boolean flag = false;
    private Connection connect;
    private Statement statement;

    public DataBaseORM() throws SQLException, ClassNotFoundException {
        try {
            Class.forName("org.sqlite.JDBC");
            connect = DriverManager.getConnection("jdbc:sqlite:D:\\SQLite\\tasks.db");
            statement = connect.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
    }

    public Statement getStatement() {
        return statement;
    }

    public int getCount() throws SQLException {
        try {
            return getStatement().executeUpdate(SQL_COUNT);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public boolean insertTask(Task t) {
        try {
            String insertQuery = SQL_INSERT + t.getTitle() + "', " + t.getDay() + ", " + t.getMonth() + ", " +
                    t.getTime().getHour() + ", " + t.getTime().getMinute() + ", " + t.getStatus() + ", " + t.getPriority() + ");";
            System.out.println(insertQuery);
            statement.executeUpdate(insertQuery);
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public boolean editTask(Task t) {
        try {
            String editQuery = SQL_UPDATE + t.getTitle() + "', day = " + t.getDay() + ", " + "month = " +
                    t.getMonth() + ", hour = " + t.getTime().getHour() + ", minute = " + t.getTime().getMinute() +
                    ", isDone = " + t.getStatus() + ", priority = " + t.getPriority() + " WHERE id = " + t.getId();
            statement.executeUpdate(editQuery);
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public boolean deleteTask(int id) {
        try {
            String deleteQuery = SQL_DELETE + id;
            statement.executeUpdate(deleteQuery);
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public boolean clearAll() {
        try {
            String editQuery = "DELETE FROM tasks";
            statement.executeUpdate(editQuery);
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public void closeStatement() {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
