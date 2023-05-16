package com.example.todolist_project;

public class ToDoInput {
    boolean done;
    String input;
    String date;

    public ToDoInput(boolean done, String input, String date) {
        this.done = done;
        this.input = input;
        this.date = date;
    }

    public ToDoInput() {
    }

    @Override
    public String toString() {
        return "ToDoInput{" +
                "done=" + done +
                ", input='" + input + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
