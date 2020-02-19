package interviewTopics;

import java.util.Random;

public class RandomNumberGeneration {


    public static void main(String[] args) {


        int i;

        Random t = new Random();

        for(int x=1;x<=10;x++)
        {
            System.out.println(t.nextInt(500));
        }
    }
}
