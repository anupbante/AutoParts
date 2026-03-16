package com.autoparts.test.boolean_test;

public class Loops {


    public static void main(String[] args) {
        int[] inputArray = {23, 64, 2359, 63425};
        int[] numbers = {25, 88, 55, 15};
        String[] names = {"virat", "sachin", "dhoni"};

        boolean isEven = isEven(inputArray);
        System.out.println("isEven :: " + isEven);

        boolean hasPositive = isPositive(numbers);
        System.out.println("Has positive number ::" + hasPositive);

        boolean isPresent = false;


    }


    /// is positive logic

    public static boolean isEven(int[] inputArray) {
        //inputArray values received :: 23, 64, 2359, 63425
        int length = inputArray.length; // length is 4

        for (int index = 0; index < length; index = index + 1) {
            System.out.println("loop entered ::; " + index);
        }
        // idhar joo index <= length tha usko aapn index < length kiya toh wo hamesha check krega ki index ki value length se choti rhe.

        int number = inputArray[2];


        // agar remainder zero aata hai toh wo number even hai
        if (number % 2 == 0) {
            System.out.println("if condition entered ");
            return true;
        }

        return false;
    }

    // Check number is positive
    public static boolean isPositive(int[] numbers) {
        int length = numbers.length;

        for (int num = 0; num < length; num = num + 1) {
            System.out.println("check number ::" + num);
            int num1 = numbers[2];


            if (num > 0) {
                System.out.println("positive number found ::" + num);
                return true;
            }
        }
        return false;
    }

    public static boolean isPresent(String[] names) {
       int length = names.length;

        for (int i = 0; i < names.length; i=i+1) {
            if (names[i]=="sachin")

                System.out.println("Is Sachin present?::" + names);
                return true;
            }
        return false;
    }
}


  /*

    1st iteration :
    --------------------------------------------
    index = 0;
    0 < 4; ==> true (condition true hai toh hi loop execute hoga)
      inside loop =>
         int number = inputArray[0]; ==> number ki value 23 hai
         if (23 % 2 == 0) { ==> remainder 3 aata hai, iska matlab number even nahi hai.
           return true; // Loop ke andar execution nahi jaayega kyuki number even nahi hai
         }
      loop ends
    index = 0 + 1 => ab next iteration ke liye index ki value 1 se increment ho gayi

    2nd iteration:
    -------------------------------------------
    index = 1;
    1 <= 4; ==> true (condition true hai toh hi loop execute hoga)
      inside loop =>
          int number = inputArray[1]; ==> number ki value 64 hai
          if (64 % 2 == 0) ==> remainder 0 aata hai, iska matlab number EVEN hai
               return true; // Loop ke andar execution jaayega kyuki number EVEN hai
      Loop ends

      index = 1 + 1 => 2

    3rd iteration:
    index = 2;

    2 < 4;

    inputArray[2] => 2359;
    index = 2 + 1 ;


    4th iteration:
    index = 3;

    3 < 4;

    inputArray[3] => 63425;
    index = 3 + 1;

    (idhar end hoo jayega loop)

    5th iteration:

    index = 4;

    4 <4; (ye condition false ho rahi toh loop aage jaayega nahi)

    inputArray[4]


    */
