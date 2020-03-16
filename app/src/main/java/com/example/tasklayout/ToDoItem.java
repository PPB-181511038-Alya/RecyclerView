package com.example.tasklayout;

import java.io.Serializable;

public class ToDoItem implements Serializable {
    String toDoTask;
    String toDoSchedule;

    public ToDoItem(String toDoTask, String toDoSchedule) {
        this.toDoTask = toDoTask;
        this.toDoSchedule = toDoSchedule;
    }

    public String getToDoTask() {
        return toDoTask;
    }

    public void setToDoTask(String toDoTask) {
        this.toDoTask = toDoTask;
    }

    public String getToDoSchedule() {
        return toDoSchedule;
    }

    public void setToDoSchedule(String toDoSchedule) {
        this.toDoSchedule = toDoSchedule;
    }
}
