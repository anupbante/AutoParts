package com.autoparts.test.collections;

import java.util.ArrayList;

public class CollectionTest {

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

    public static void main(String[] args) {
       ArrayList<String> namesArrayList = new ArrayList<>();

       namesArrayList.add("anup");
       namesArrayList.add("abc");
       namesArrayList.add("rewati");

        System.out.println(namesArrayList );

    }



}
