package interviewTopics;

public class reverseInteger {

    public static void main(String[] args) {

        int num = 12345;
        int rev = 0;

        while (num != 0){
            rev = rev * 10 + num%10;
            num = num/10;

        }
        System.out.println("Reverse: "+ rev);

        long num1 = 123456;
        String s = Long.toString(num1);

        StringBuffer stringBuffer = new StringBuffer(s);
        stringBuffer.reverse();
        System.out.println(stringBuffer);

        //System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
    }
}
