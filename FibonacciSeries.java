package interviewTopics;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main() {
        int a = 0, b = 1, c, i, count = 10;
        // To print 0 and 1
        System.out.print(a + " " + b);
        // loop starts from 2. We have already printed 0 and 1 in the previous step
        for (i = 2; i < count; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }

    public void FibonanciSeriesN(int n){

        int a=0, b=1,c,i;
        System.out.print(a+ " " + b);
        for( i =3;i<n;i++){
            c=a+b;
            System.out.print(" " + c);
            a=b;
            b=c;

        }
        ;

    }

    public static void main(String[] args) {
        /*int first = 0, second = 1, c, i, count = 10;

        System.out.print(first + " " + second);

        for (i = 2; i < count; i++) {

            c = first + second;
            System.out.print(" " + c);

            first = second;
            second = c;

         */
            main();

            Scanner s = new Scanner(System.in);
            System.out.print("Please enter the number: ");
            int a = s.nextInt();
            FibonacciSeries obj = new FibonacciSeries();
            obj.FibonanciSeriesN(a);
           // System.out.println(FibonanciSeriesN(a));

        }
    }

