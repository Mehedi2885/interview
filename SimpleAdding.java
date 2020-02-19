package interviewTopics;

import java.util.Scanner;

public class SimpleAdding {

    public static int SimpleAdding(int num) {
        int sum =0;
        for(int i =1;i<=num; i++)
        {
            sum +=i;
        }
        return sum;

    }

    public static void main (String[] args) {
        // keep this function call here
        System.out.println("Please enter your number: " );
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        System.out.print(SimpleAdding(m));
    }

}
