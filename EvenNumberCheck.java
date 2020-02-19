package interviewTopics;

import java.util.ArrayList;

public class EvenNumberCheck {


    public void nPrimeNumber() {

        int max = 100;

        for (int i = 2; i <= max; i++) {
            boolean isPrime = true;

            for (int y = 2; y < i; y++)
                if (i % y == 0)
                {
                    isPrime = false;
                    break;

                }




            if (isPrime)
                System.out.print(i+" ");


        }
        System.out.println();


    }
        public void ArrayCheck(){

            ArrayList<Integer> primelist = new ArrayList<>();
            int max = 100;

            for(int i = 2;i<=max;i++){
                boolean prime = true;
                for(int j=2;j<i;j++)
                    if (i%j==0){
                        prime = false;
                        break;
                    }
                if (prime)
                     primelist.add(i);
            }
            System.out.println(" PrimeList: " + primelist);
        }


        public static void main (String[]args){

      /*  for (int i = 2; i<=100;i++){

            boolean isPrime = true;

            for (int j = 2; j<i;j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;

                }

            }
            if (isPrime){
                System.out.print(i + " ");
            }


        }*/

            EvenNumberCheck obj = new EvenNumberCheck();
            //obj.nPrimeNumber();
            obj.ArrayCheck();


        }

 }
