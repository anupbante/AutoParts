package com.autoparts.test.collections.assignments;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
This class finds the duplicate numbers in a given numbers list, stores them separately
and returns back to the caller.

Input: {1, 3, 1, 6, 7, 10, 7, 55, 79, 79}
Output: {1, 7, 79}

This is NOT just about printing the duplicate numbers, but to identify them and store them and return them, and then
print them.
 */
public class FilterDuplicates {

    public ArrayList<Integer> filterDuplicates(List<Integer> numberList) {
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
