package com.coding.school.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomSorting {

    public static void main(String[] args) {
        Person pr1 = new Person("ABC", 25);
        Person pr2 = new Person("SAKET", 31);
        Person pr3 = new Person("PRIYA", 29);

        List<Person> prList = new ArrayList<>(Arrays.asList(pr1,pr2,pr3));

        Collections.sort(prList,new AgeBasedComparator());

        //Collections.sort(prList, Comparator.comparing(Person::getName));
        prList.stream().forEach(person->System.out.println(person.getName() + " "+ person.getAge()));
    }

}
