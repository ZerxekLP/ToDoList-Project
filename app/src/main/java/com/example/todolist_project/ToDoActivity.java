package com.example.todolist_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.LinkedList;

public class ToDoActivity extends AppCompatActivity {
    ListView lv;
    LinkedList<ToDoInput> ll;
    ArrayAdapter ap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do);
        ll = new LinkedList();
        ap = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ll);
        lv.setAdapter(ap);
    }

    public void addToDo(View view) {
        ll.add(new ToDoInput());

    }
}