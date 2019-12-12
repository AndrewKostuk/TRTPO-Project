package by.bsuir.GUI;

import by.bsuir.*;
import by.bsuir.Menu;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.sql.SQLException;

public class DateGUI {
    private MyDate day;
    private Menu menu;
    private DataBaseORM dataBase;

    private Label dateLabel;
    private Slider progressSlider;
    private Button addButton;
    private ToggleButton tasksButton;
    private VBox tasksList;


    private GridPane pane;
    private String[] months = {"", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    public DateGUI(MyDate date) throws SQLException, ClassNotFoundException {
        this.day = date;
        //menu = new Menu(day);
        dataBase = new DataBaseORM();
        dataBase.clearAll();
        setDateLabel();
        setProgressSlider();
        setAddButton();
        setTasksButton();
        setTasksList();
        setPane();
    }

    public Label getDateLabel() {
        return dateLabel;
    }

    public void setDateLabel() {
        dateLabel = new Label("    " + Integer.toString(day.getDay()) + "\n" + months[day.getMonth()]);
    }

    public Slider getProgressSlider() {
        return progressSlider;
    }

    public void setProgressSlider() {
        progressSlider = new Slider(0.0, 100.0, 0);
        progressSlider.setValue(setSliderValue(day.getTaskList()));
        progressSlider.setShowTickMarks(true);
        progressSlider.setShowTickLabels(true);
        progressSlider.setBlockIncrement(2.0);
        progressSlider.setMajorTickUnit(20.0);
        progressSlider.setMinorTickCount(0);
        progressSlider.setSnapToTicks(true);
    }

    public double setSliderValue(TaskList tl) {
        int generalAmount = tl.getTaskList().size();
        int doneAmount = 0;
        for (Task t : tl.getTaskList()) {
            if (t.getStatus()) doneAmount++;
        }
        return (double) doneAmount / generalAmount;
    }

    public void setTasksList() {
        tasksList = new VBox(4);
        for (Task t : day.getTaskList().getTaskList()
        ) {
            TaskGUI tgui = new TaskGUI(t);
            tasksList.getChildren().add(tgui.getPane());
        }
    }

    public Button getAddButton() {
        return addButton;
    }

    public void setAddButton() {
        addButton = new Button("add");
        GridPane.setHalignment(addButton, HPos.CENTER);
        addButton.setOnAction(event -> {
            Stage addTaskStage = new Stage();

            Label titleLBL = new Label("Title");
            Label hourLBL = new Label("Hour");
            Label minuteLBL = new Label("Minute");
            Label priorityLBL = new Label("Priority");

            TextField tF = new TextField();
            TextField hF = new TextField();
            TextField mF = new TextField();
            TextField pF = new TextField();

            Button okBTN = new Button("OK");
            okBTN.setOnAction(event1 -> {
                String title = new String(tF.getText());
                int h = Integer.parseInt(hF.getText());
                int m = Integer.parseInt(mF.getText());
                int p = Integer.parseInt(pF.getText());
                Task newTask = null;
                try {
                    newTask = new Task(dataBase.getCount() + 1, title, day.getDay(), day.getMonth(), h, m, p);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                day.getTaskList().addNewTask(newTask);
                setTitleTasksButton();
                TaskGUI newTGUI = new TaskGUI(newTask);
                tasksList.getChildren().add(newTGUI.getPane());
                dataBase.insertTask(newTask);
                addTaskStage.close();
            });

            GridPane addTaskPane = new GridPane();

            addTaskPane.add(tF, 0, 0);
            addTaskPane.add(hF, 1, 0);
            addTaskPane.add(mF, 2, 0);
            addTaskPane.add(pF, 3, 0);
            addTaskPane.add(titleLBL, 0, 1);
            addTaskPane.add(hourLBL, 1, 1);
            addTaskPane.add(minuteLBL, 2, 1);
            addTaskPane.add(priorityLBL, 3, 1);
            addTaskPane.add(okBTN, 3, 2);

            Scene scene = new Scene(addTaskPane);
            addTaskStage.setScene(scene);
            addTaskStage.setTitle("NewTask");
            addTaskStage.setWidth(300);
            addTaskStage.setHeight(250);
            addTaskStage.show();
        });
    }

    public ToggleButton getTasksButton() {
        return tasksButton;
    }

    public void setTitleTasksButton() {
        int i = day.getTaskList().getTaskList().size();
        for (Task t : day.getTaskList().getTaskList()
        ) {
            if (t.getStatus()) i--;
        }
        String result = new String(i + " undone tasks");
        tasksButton.setText(result);
    }

    public void setTasksButton() {
        tasksButton = new ToggleButton();
        setTitleTasksButton();
        tasksButton.setOnAction(event -> {
            if (tasksButton.isSelected()) {
                pane.add(tasksList, 1, 2);
            } else {
                pane.getChildren().remove(tasksList);
            }
        });
    }

    public GridPane getPane() {
        return pane;
    }

    public void setPane() {
        HBox.setHgrow(tasksButton, Priority.ALWAYS);
        tasksButton.setMaxWidth(Double.MAX_VALUE);

        pane = new GridPane();
        pane.getColumnConstraints().add(new ColumnConstraints(40));

        ColumnConstraints column2 = new ColumnConstraints(150, 150, Double.MAX_VALUE);
        column2.setHgrow(Priority.ALWAYS);
        pane.getColumnConstraints().add(column2);

        pane.getColumnConstraints().add(new ColumnConstraints(60));

        pane.add(dateLabel, 0, 0);
        pane.add(progressSlider, 1, 0);
        SetSliderValue slider = new SetSliderValue(progressSlider, day.getTaskList());
        slider.start();
        pane.add(tasksButton, 1, 1);
        pane.add(addButton, 2, 1);
    }
}