package com.example.tasksapp;

import java.text.Collator;
import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        Collator collator = Collator.getInstance();
        return collator.compare(o1.getAge(), o2.getAge());
    }

}
