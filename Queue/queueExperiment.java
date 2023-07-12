package Queue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class queueExperiment {

    public static void main(String args[])
    {
        PriorityQueue<Integer>priorityQueue = new PriorityQueue<>(Arrays.asList(2,3,0,8,5,7));
        System.out.println(priorityQueue);

        for(int i=0;i<6;i++)
        {
            priorityQueue.remove();
        }

        System.out.println(priorityQueue);
    }
}
