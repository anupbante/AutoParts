package com.autoparts.test.collections.assignments;


import java.util.*;
import java.util.logging.Filter;

/*
The goal is to create the object of FilterDuplicates class and call the method which is filtering
the duplicate numbers, get the returned value here in main() method and then print them.
 */
public class FilterDuplicatesMain {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.add(1);numberList.add(3);numberList.add(1);numberList.add(6);
        numberList.add(7);numberList.add(10);numberList.add(7);numberList.add(55);
        numberList.add(79);numberList.add(79);

        List<Integer> vector = new Vector<>();

        // approach 2 for initializing the list
//        List<Integer> numberList2 = List.of(1, 3, 1, 6, 7, 10, 7, 55, 79, 79);
//        List<String> namelist = List.of("anup", "rewati", "test");

        FilterDuplicates filterDuplicates = new FilterDuplicates();

        ArrayList<Integer> duplicates = filterDuplicates.filterDuplicates(numberList);
        System.out.println("duplicates numbers are" + duplicates);
    }



    //TO-DO:
    // filterDuplicates ka logic FilterDuplicates class me hi move karna hai
    // yaha pe sirf object create karke is method ko call karna hai
}


        // Input: {1, 3, 1, 6, 7, 10, 7, 55, 79, 79}



