package by.bsuir.GUI;

import by.bsuir.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.sql.SQLException;

public class MainWindow extends Application {
    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws SQLException, ClassNotFoundException {

        MyCalendar calendar = new MyCalendar();

        /*Task t1 = new Task(1, "1", 12, 12, 11, 25, 1);
        Task t2 = new Task(2, "2", 12, 12, 12, 25, 1);
        Task t3 = new Task(3, "3", 12, 12, 13, 25, 2);
        Task t4 = new Task(4, "4", 12, 12, 14, 25, 3);

        TaskList tList1 = new TaskList();
        tList1.addNewTask(t1);
        tList1.addNewTask(t2);
        tList1.addNewTask(t3);
        tList1.addNewTask(t4);


        calendar.getCalendar().get(0).setTaskList(tList1);*/

        DateGUI dgui1 = new DateGUI(calendar.getCalendar().get(0));

        calendar.addNewDate();

        /*Task t5 = new Task(5, "5", 13, 12, 11, 25, 1);
        Task t6 = new Task(6, "6", 13, 12, 12, 25, 1);
        Task t7 = new Task(7, "7", 13, 12, 13, 25, 2);
        Task t8 = new Task(8, "8", 13, 12, 14, 25, 3);

        TaskList tList2 = new TaskList();
        tList2.addNewTask(t5);
        tList2.addNewTask(t6);
        tList2.addNewTask(t7);
        tList2.addNewTask(t8);

        calendar.getCalendar().get(1).setTaskList(tList2);*/

        DateGUI dgui2 = new DateGUI(calendar.getCalendar().get(1));

        VBox allCalendar = new VBox(4);
        allCalendar.getChildren().addAll(dgui1.getPane(), dgui2.getPane());

        /*Label dateLabel = new Label("    "+Integer.toString(calendar.getCalendar().get(0).getDay()) + "\n" +
                months[calendar.getCalendar().get(0).getMonth()]);

        Slider progressSlider = new Slider(0.0, 100.0, 0);
        progressSlider.setValue(setSlider(calendar.getCalendar().get(0).getTaskList()));
        progressSlider.setShowTickMarks(true);
        progressSlider.setShowTickLabels(true);
        progressSlider.setBlockIncrement(2.0);
        progressSlider.setMajorTickUnit(20.0);
        progressSlider.setMinorTickCount(0);
        progressSlider.setSnapToTicks(true);

        Button plusButton = new Button("add");
        GridPane.setHalignment(plusButton, HPos.CENTER);
        plusButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });

        Button tasksButton = new Button (setTitle(calendar.getCalendar().get(0).getTaskList()));
        tasksButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

            }
        });
        HBox.setHgrow(tasksButton, Priority.ALWAYS);
        tasksButton.setMaxWidth(Double.MAX_VALUE);

        GridPane root = new GridPane();
        root.getColumnConstraints().add(new ColumnConstraints(40));

        ColumnConstraints column2 = new ColumnConstraints(150,150,Double.MAX_VALUE);
        column2.setHgrow(Priority.ALWAYS);
        root.getColumnConstraints().add(column2);

        root.getColumnConstraints().add(new ColumnConstraints(60));

        root.add(dateLabel, 0, 0);
        root.add(progressSlider, 1, 0);
        root.add(tasksButton, 1, 1);
        root.add(plusButton, 2, 1);*/

        //calendar.addNewDate();

        //   TaskGUI tgui = new TaskGUI(new Task(0, "Hello world", 12, 12, 12, 32, 2));
        Scene scene = new Scene(allCalendar);
        stage.setScene(scene);
        stage.setTitle("StartWindow");
        stage.setWidth(300);
        stage.setHeight(250);
        stage.show();
    }
}


