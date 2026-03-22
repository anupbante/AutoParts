package com.autoparts.test.collections;

import java.util.HashMap;

/*
       1. ArrayList => sequential manner me data store karta hai

       2. HashMap => ye key-value pair me data save karta hai
           Ex.  name | age
                anup | 30
                raman| 32

       3. HashSet => sequential manner me data store karta hai and duplicates
       allow nahi karta.
           Ex. "anup", "abc", "rewati" => ye elements present hai hashset
           me, ab agar mai isme firse "anup" add karunga toh ye usko
           skip kar dega and hashset ka size 3 hi rahega
        */
public class HashMapTest {

    public static void main(String[] args) {
        HashMap<String, Integer> nameAge = new HashMap<>();

        nameAge.put("rewati", 31);
        nameAge.put("anup", 30);
        nameAge.put("abc", 50);
        nameAge.put("xyz", 10);

        for (int i = 0; i < nameAge.size(); i++) {
            int age = nameAge.get("rewati");

            if (age < 18) {
                System.out.println("rewati is an child");
            } else if (age > 18) {
                System.out.println("rewati is an adult");
            } else {
                System.out.println("rewati is an elder");
            }

        }

    }

    // TO-DO:
    // 1. isAdultChildOrElder()
    // 2. isMaleFemaleOrOther()
    // 3. isValidVoter()

    public static void isAdultChildOrElder() {

    }
}
