package interviewTopics;

public class SwapTwoInteger {

    public static void main(String[] args) {


        int x = 5;
        int y = 10;

        // Using 3rd variable

      /*  int t;

        t = x;
        x = y;
        y = t;*/

      // Without 3rd variable using + operator

/*
        x = x+y; //15
        y = x-y;  //5
        x = x-y;*/

// Without 3rd variable using * operator

        x = x*y; // 50
        y = x/y; // 5
        x = x/y;


        System.out.println(x);
        System.out.println(y);

    }
}