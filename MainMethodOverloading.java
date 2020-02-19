package interviewTopics;

public class MainMethodOverloading {

    public static void main(String[] args) {

        System.out.println("This is main method");
        main("testing");
        main(10);
        main(10,20);

    }

    public static void main(String x) {

        System.out.println("This is main method-1");

    }

    public static void main(int x) {

        System.out.println("This is main method-2");

    }
    public static void main(int x, int y) {

        System.out.println("This is main method-3");

    }


}
