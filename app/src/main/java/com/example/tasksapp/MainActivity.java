package com.example.tasksapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Person> details = new ArrayList<Person>();

        //add persons. hard coded.
        Person person1 = new Person(1, "Aaron Finch", "13423", "23");
        Person person2 = new Person(2, "Virat", "134235", "25");
        Person person3 = new Person(3, "ABD", "43356", "18");
        Person person4 = new Person(4, "Morris", "357457", "30");
        Person person5 = new Person(5, "Zampa", "346324", "28");
        Person person6 = new Person(6, "Dale Styne", "34362", "24");

        details.add(person1);
        details.add(person2);
        details.add(person3);
        details.add(person4);
        details.add(person5);
        details.add(person6);

        Comparator<Person> ageCompare = new AgeComparator();
        Collections.sort(details, ageCompare);

        DetailsListView listViewAdapter = new DetailsListView(this, details);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listViewAdapter);

    }
}