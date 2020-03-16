package com.example.tasklayout;

public class DoneItem {
    String doneTask;
    String doneSchedule;

    public DoneItem(String doneTask, String doneSchedule) {
        this.doneTask = doneTask;
        this.doneSchedule = doneSchedule;
    }

    public String getDoneTask() {
        return doneTask;
    }

    public void setDoneTask(String doneTask) {
        this.doneTask = doneTask;
    }

    public String getDoneSchedule() {
        return doneSchedule;
    }

    public void setDoneSchedule(String doneSchedule) {
        this.doneSchedule = doneSchedule;
    }
}
