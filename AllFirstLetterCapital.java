package interviewTopics;

import java.util.Scanner;

public class AllFirstLetterCapital {

    public static String LetterCapitalize(String str){

        StringBuffer sb = new StringBuffer(str.length());
        String [] array = str.split("\\ ");

        for(int i =0; i<array.length; i++){
            sb.append(Character.toUpperCase(array[i].charAt(0))).append(array[i].substring(1)).append(" ");
        }
        return sb.toString().trim();
        //System.out.println(sb);
    }

    public static void main(String[] args) {
        System.out.println("Enter string here: ");
        Scanner s = new Scanner(System.in);
        System.out.print(LetterCapitalize(s.nextLine()));
        //LetterCapitalize("i love to code");

    }


}
