package com.autoparts.test.collections.assignments;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

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

        ArrayList<Integer> duplicates = filterDuplicates(numberList);
        System.out.println("duplicates numbers are" + duplicates);
    }

    public static ArrayList<Integer> filterDuplicates(ArrayList<Integer> numberList) {
        ArrayList<Integer> duplicates = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();
        for (int number : numberList) {
            if (seen.contains(number)) {
                if (!duplicates.contains(number)) {
                    duplicates.add(number);
                }
            }
            else{
                    seen.add(number);
                }
            }
        return duplicates;
    }
}


        // Input: {1, 3, 1, 6, 7, 10, 7, 55, 79, 79}



