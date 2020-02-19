package interviewTopics;

public class ArmstrongNumberChecking {


    public static void isAramstrongNumber(int num){

        int cube= 0;
        int r;
        int t= num;

        while (num>0){
            r = num%10;
            num = num/10;
            cube = cube + (r*r*r);
        }

        if (t==cube){
            System.out.println("This is armstrong number");

        }
        else{
            System.out.println("This is not an armstrong number");

        }


    }

    public static void armNumberChecking(int n){
         int count = 0;
         int r;
         int t = n;

         while (n>0){
             r =n%10;
             n =n/10;
             count = count + (r*r*r);
         }
        if(count==t){
            System.out.println("This is armstrong number");
        }else {
            System.out.println("This is not armstrong number");
        }
    }

    public static void main(String[] args) {

       /* isAramstrongNumber(153);
        isAramstrongNumber(0);
        isAramstrongNumber(171);
        isAramstrongNumber(170);
        isAramstrongNumber(1);
        isAramstrongNumber(150);
        isAramstrongNumber(370);*/
       armNumberChecking(153);
    }

}
