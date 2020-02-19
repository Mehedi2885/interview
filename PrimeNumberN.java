package interviewTopics;

import java.util.Scanner;

public class PrimeNumberN {


    public static boolean primeNumberCheck(int n) {

        // 2 to n

        for (int i=2;i<n;i++){

            if(n%i==0){
                return false;
            }


        }
        return true;

    }

    public static void main(String[] args) {


        System.out.print("Enter a number please: ");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n>=2 && primeNumberCheck(n) ){
            System.out.println("Prime");
        }
         else {
            System.out.println("Not prime");
        }
    }


}



