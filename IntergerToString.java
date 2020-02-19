package interviewTopics;

public class IntergerToString {

    public static void main(String[] args) {


        int i = 123456;

        String s = Integer.toString(i);
        System.out.println("Printing string value: " + s);
        StringBuffer stringBuffer = new StringBuffer(s);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
    }
}
