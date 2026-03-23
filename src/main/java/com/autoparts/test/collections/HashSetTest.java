package com.autoparts.test.collections;


import java.util.HashSet;
import java.util.TreeSet;

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
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> uniqueNames = new HashSet<>(); // ==> ye data ko unordered sequence me store karta hai
       //TreeSet<String>  uniqueNames = new TreeSet<>(); ==> ye data ko by default ascending order me store karta hai

       uniqueNames.add("anup1");
       uniqueNames.add("bhau");
       uniqueNames.add("acrewati");


       for(String name : uniqueNames) {
           System.out.println(name);
        }

    }

    // TO-DO: Har program me jaha pe simple for loop hai uski jagah pe for-each loop implement karna hai
}
