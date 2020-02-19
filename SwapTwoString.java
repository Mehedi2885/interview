package interviewTopics;

public class SwapTwoString {

    public static void main(String[] args) {


        String a = "hello";
        String b = "world";
        System.out.println("Before saping");
        System.out.println(a);
        System.out.println(b);

        a= a+b;
        b=a.substring(0,(a.length())-b.length());
        a=a.substring(b.length());

        System.out.println("After swaping");
        System.out.println(a);
        System.out.println(b);

    }
}
