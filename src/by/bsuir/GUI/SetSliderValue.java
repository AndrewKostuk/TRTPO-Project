package by.bsuir.GUI;

import by.bsuir.Task;
import by.bsuir.TaskList;
import javafx.scene.control.Slider;

public class SetSliderValue extends Thread {
    private Slider progressSlider;
    private TaskList tl;

    public SetSliderValue(Slider s, TaskList tl) {
        this.progressSlider = s;
        this.tl = tl;
    }

    @Override
    public void run() {
        while (true) {
            int generalAmount = tl.getTaskList().size();
            int doneAmount = 0;
            for (Task t : tl.getTaskList()) {
                if (t.getStatus()) doneAmount++;
            }
            progressSlider.setValue(100 * (double) doneAmount / generalAmount);
        }
    }
}