package interviewTopics;

public class PrimeNumberCheck {

    public static boolean isPrimeNumberOrNot(int n){

        if(n<=1){
            return false;
        }
        for (int i =2; i<n;i++) {
            if (n % i == 0) {
                return false;
            }
        }
            return true;

    }

    public static void getPrimeNumbers(int num){

        for(int i =2; i<=num; i++){
            if(isPrimeNumberOrNot(i))
                System.out.print(i + " ");

        }
    }

    public static void main(String[] args) {
        //isPrimeNumberOrNot(15);

        getPrimeNumbers(100);
        System.out.println(" ");

        System.out.println("This number is prime number: " + isPrimeNumberOrNot(47));
    }
}
