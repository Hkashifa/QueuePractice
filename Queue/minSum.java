package Queue;

import java.util.PriorityQueue;

public class minSum {

    public static void main(String args[])
    {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        int arr[]= {6, 8, 4, 5, 2, 3};
        int n=6;
        for(int i=0;i<6;i++)
        {
            pQueue.add(arr[i]);
        }
        System.out.println(pQueue);

        int sum_1 = 0;
        int sum_2 = 0;

        int nHalf = (n / 2)-1;
        System.out.println("n_half "+nHalf);
        for(int j = 0; j < nHalf;j++)
        {
            int queuePoll = pQueue.peek();
            sum_1 = sum_1+(queuePoll*(10*(nHalf-j)));
            System.out.println("sum1 "+queuePoll*(10*(nHalf-j)));
            System.out.println("sum1 "+sum_1+" Queue Poll: "+queuePoll);
            pQueue.remove();


            int queuePoll2 = pQueue.peek();
            sum_2 = sum_2+(queuePoll2*10*(nHalf-j));
            System.out.println("sum2 "+queuePoll2*10*(nHalf-j));
            System.out.println("sum2 "+sum_2+" Queue Poll: "+queuePoll2);
            pQueue.remove();

        }
        int min_sum = sum_1 + sum_2;
        System.out.println(min_sum);

    }
}
