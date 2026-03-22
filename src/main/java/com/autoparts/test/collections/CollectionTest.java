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

    }


    public static void arrayList() {
        ArrayList<String> namesArrayList = new ArrayList<>();

        namesArrayList.add("anup");
        namesArrayList.add("abc");
        namesArrayList.add("rewati");

        for (int i = 0; i < namesArrayList.size(); i++) {
            String name = namesArrayList.get(i);
            System.out.println("list of names in arraylist: " + name);
        }
    }


    /*
     * This method checks the positive number
     * present in the given number list.
     */

    public static void isPositive() {

        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(11);
        numberList.add(53);
        numberList.add(45);
        for (int i = 0; i < numberList.size(); i++) {
            int num = numberList.get(i);
            if (num > 0) ;
            System.out.println("check number ::" + num);
        }
    }

    public static void isEven() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        numbers.add(53);
        numbers.add(45);
        for (int i = 0; i < numbers.size(); i++) {
            int num1 = numbers.get(i);
            if (num1 % 2 == 0) ;
            System.out.println(num1 + "isEven");

        }
    }

    public static void isNamePresent() {
        ArrayList<String> names = new ArrayList<>();

        names.add("anup");
        names.add("abc");
        names.add("rewati");

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            if (name.equalsIgnoreCase("abc")) {
                System.out.println(name + "is present");
            }
        }
    }

}





    /* TO-DO:
        1. isEven()
        2. isPositive()
        3. isNamePresent()
    */

/*
*This method checks the even number
     * present in the given number list.
 */
