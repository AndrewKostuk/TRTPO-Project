package by.bsuir.GUI;

import by.bsuir.Task;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;

public class TaskGUI {
    private Task task;
    private CheckBox isDone;
    private Label infoLabel;
    private Button editButton;
    private Button deleteButton;
    private HBox pane;

    public TaskGUI(Task t) {
        this.task = t;
        setIsDone();
        setInfoLabel();
        setEditButton();
        setDeleteButton();
        setPane();
    }

    public CheckBox getIsDone() {
        return isDone;
    }

    public void setIsDone() {
        isDone = new CheckBox();
        isDone.setOnAction(event -> {
            task.changeStatus();

        });
    }

    public Label getInfoLabel() {
        return infoLabel;
    }

    public void setInfoLabel() {
        infoLabel = new Label(task.getTitle() + "  " + task.getTime().toString());
    }

    public Button getEditButton() {
        return editButton;
    }

    public void setEditButton() {
       editButton= new Button("Edit");
       /*editButton.setOnAction(event -> {
           task.
       });*/
    }

    public Button getDeleteButton() {
        return deleteButton;
    }

    public void setDeleteButton() {
        deleteButton= new Button("Delete");
    }

    public HBox getPane() {
        return pane;
    }

    public void setPane() {
        pane = new HBox(10);
       pane.getChildren().addAll(isDone, infoLabel, editButton, deleteButton);
    }
}
