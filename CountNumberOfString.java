package interviewTopics;

import java.util.HashMap;

public class CountNumberOfString {

    public static void main(String[] args) {

        String s = "This this is is done by mehedi hassan";

        String []array = s.split(" ");

        HashMap<String, Integer> map = new HashMap<>();
        for(int i =0; i<array.length; i++)
            if (map.containsKey(array[i])){
                int count = map.get(array[i]);
                map.put(array[i],count+1);
            }
        else {
            map.put(array[i],1);
            }

        System.out.println(map);
    }
}
