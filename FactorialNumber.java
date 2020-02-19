package interviewTopics;

public class FactorialNumber {

    // Without recursive --- for loop

    public static int factorial(int num) {

        //4! = 4*3*2*1 = 24
        int fact = 1;
        if (num == 0)
            return 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
    // With Recursive function: a function is calling itself.

    public static int fact(int num){

        if (num == 0)
            return 1;
        else
            return (num*fact(num-1));

    }
    public static void main(String[] args) {
        System.out.println( factorial(4));
        System.out.println(factorial(0));

    }
}
