package com.autoparts.test.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

        HashMap<String, String> people = new HashMap<>();

        people.put("Rahul", "Male");
        people.put("abc", "Female");
        people.put("xyz", "Other");
        // isMaleFemaleOrOther(people);

        HashMap<String, Integer> nameAge = new HashMap<>();

        nameAge.put("rewati", 31);
        nameAge.put("anup", 30);
        nameAge.put("abc", 60);
        nameAge.put("xyz", 10);
        // isAdultChildOrElder(nameAge);

        HashMap<String, Integer> voterValidation = new HashMap<>();

        voterValidation.put("Rewati", 31);
        voterValidation.put("Anup", 10);
        isValidVoter(voterValidation);


    }



    public static void isAdultChildOrElder(HashMap<String, Integer> nameAge) {
        /*
        1)humne joo phele for (int i = 0; i < nameAge.size(); i++) use kiya tha wo index-based loop hai.
        Lekin HashMap index-based nahi hota.
        HashMap ek key–value pair data structure hai. Har element ek unique key se access hota hai, index se nahi.
        example: jaise idhar anup, rewati key hai aur uski value 31 aur 30 hai.
        for (HashMap.Entry<String, Integer> entry : nameAge.entrySet())

        2)Index based me har element ek position (index) se access hota hai.
        Index based Array aur ArrayList hote hain.
        example:(int i = 0; i < nameAge.size(); i++)
        */

        Set<Map.Entry<String, Integer>> entries = nameAge.entrySet();


        for (HashMap.Entry<String, Integer> entry : entries) {
            String name = entry.getKey();
            int age = entry.getValue();

            if (age < 18) {
                System.out.println(name + "is a child");
            } else if (age > 18 && age < 50) {
                System.out.println(name + "is a adult");
            } else {
                System.out.println(name + "is a elder");
            }

        }
    }

    public static void isMaleFemaleOrOther(HashMap<String, String> gender) {

        Set<HashMap.Entry<String, String>> entries = gender.entrySet();

        for (HashMap.Entry<String, String> entry : gender.entrySet()) {
            String person = entry.getKey();
            String Gender = entry.getValue();
            if (Gender.equalsIgnoreCase("Male")) {
                System.out.println(person + " is a Male");
            } else if (Gender.equalsIgnoreCase("Female")) {
                System.out.println(person + " is a Female");
            } else {
                System.out.println(person + " is Other");
            }
        }
    }


    public static void isValidVoter(HashMap<String, Integer> voterValidation) {
        Set<Map.Entry<String, Integer>> entries = voterValidation.entrySet();
        for (HashMap.Entry<String, Integer> entry : voterValidation.entrySet()) {
            String voter = entry.getKey();
            int age = entry.getValue();

            if (age >= 18) {
                System.out.println(voter + " is a valid voter" + age);
            } else {
                System.out.println(voter + " is NOT a valid voter" + age);
            }
        }
    }
}


// TO-DO:
// 1. isAdultChildOrElder()
// 2. isMaleFemaleOrOther()
// 3. isValidVoter()