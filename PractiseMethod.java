package interviewTopics;


import java.util.Scanner;

public class PractiseMethod {

    public static int FirstFactorial(int num) {

        // code goes here
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */
       /*if (num==o)
       return 1;*/

        int fact = 1;
        if (num == 0)
            return 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;

    }


    public static void main(String[] args) {

        System.out.print("Please enter your number:-");
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        System.out.println(FirstFactorial(a));


        //System.out.print(FirstFactorial(s.nextLine()));

    }
}
