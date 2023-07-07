package Queue;

import java.util.PriorityQueue;

public class minCostOfRopes {
    public static void main(String[] args) {

        int[] array = {4, 2, 7, 6, 9};
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        for(int i=0;i < 5;i++)
        {
            numbers.add(array[i]);
        }


        int total =0;
        while(numbers.size() > 1) {

            int min1 = numbers.poll();
            int min2 = numbers.poll();
            int min_add = min1 + min2;
            numbers.add(min_add);
            total = total + min_add;
        }

        System.out.println(total);


    }

}
