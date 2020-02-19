package interviewTopics;

public class MaxNumber {




        public void selection() {


            int[] num = {1, -2, 4, 55, 6};

            int max = num[0];
            int min = num[0];
            double sum = 0;
            System.out.println(max);

            for (int i = 0; i < num.length; i++) {

                sum = sum + num[i];

                if (max<num[i]){
                    max=num[i];
                }

                if (min>num[i]){
                    min=num[i];
                }
            }
              double y = sum/num.length;
            System.out.println("sum is: " + sum);
            System.out.println("avg value is: " + y);

            System.out.println("min value is: " + min);
            System.out.println("max value is: " + max);

            for (int x : num) {

                System.out.println(x);
            }

        }

    public static void main(String[] args) {

            MaxNumber obj = new MaxNumber();
            obj.selection();
    }

}
