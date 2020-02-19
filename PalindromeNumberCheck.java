package interviewTopics;

public class PalindromeNumberCheck {

    public static void palindromeCheck(int num){
      //151, 343, 101

        int r = 0;
        int sum = 0;
        int last ;

        last = num;

        while (num>0){
            r = num%10;// get the reminder
            sum = (sum*10) + r;
            num = num/10;
        }
        if(sum == last){
            System.out.println("This is palindrome number");
        }else
        {
            System.out.println("This is not palindrome number");

        }

    }

    public static void main(String[] args) {

        palindromeCheck(125 );
    }


}
