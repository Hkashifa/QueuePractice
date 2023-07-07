package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class maximumDiamonds {
    public static void main(String[] args) {

        int[] array = {7,1,2};
        PriorityQueue<Integer> maxPriorityQueue =
                new PriorityQueue<>(Comparator.reverseOrder());

        for(int i=0;i<3;i++)
        {
            maxPriorityQueue.add(array[i]);

        }
        int k=2;
        int add;
        int total =0;
        for(int i=0;i<k;i++)
        {

            add = maxPriorityQueue.poll();
            total = total + add;

            int half_add = add /2;
            maxPriorityQueue.add(half_add);
        }

        System.out.println(total);

    }
}
