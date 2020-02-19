package interviewTopics;

public class FizzInteger {

    public static void countInteger(int n){

        int i;
        int r;
        for( i =1;i<=n;i++){

            if(i%3==0)
            {
                System.out.println("Fizz " + i);

            }
            else if(i%5==0)
            {
                System.out.println("Buzz " + i);

            }
            else
            {
                System.out.println(i);
            }

        }




    }

    public static void main(String[]args){

      countInteger(100);

        /*String buzz =  "buzz", fizz = "fizz"; //initialise the string variables
        for (int i = 1; i <= 100; i++)
        {
            if (i % 15 == 0) //check if number in position i is divisable by 15, if so don't check other 2 conditions - we don't want a double print
            {
                System.out.println(buzz + fizz + " " + i);
            }
            else if (i % 3  == 0 )
            {
                System.out.println(buzz + " " + i);
            }
            else if (i % 5== 0)
            {
                System.out.println(fizz + " "+ i);
            }
            else{
                System.out.println(i);
            }
        }*/

    }
}
