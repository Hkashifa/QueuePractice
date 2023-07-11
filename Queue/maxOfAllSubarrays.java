package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class maxOfAllSubarrays {

    public static void main(String args[])
    {

        int n=10;
        int k=4;
        int arr[]={8, 5, 10, 7, 9, 4, 15, 12, 90, 13};


        for(int i=0;i<(n-k+1);i++)
        {
            PriorityQueue<Integer>max_queue = new PriorityQueue<>(Comparator.reverseOrder());
            for(int j=i;j<k+i;j++)
            {
                max_queue.add(arr[j]);
            }

            System.out.println(max_queue.peek());
        }


    }
}
