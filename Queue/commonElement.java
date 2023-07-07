package Queue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class commonElement {

    public static void main(String[] args) {

        PriorityQueue<Integer> v1Queue = new PriorityQueue<>();
        PriorityQueue<Integer> v2Queue = new PriorityQueue<>();

        int n = 6;
        int m = 5;
        int[] V1 = {3, 4, 2, 2, 4,6};
        int[] V2 = {3, 2, 2, 6,7};

        ArrayList<Integer> commonValues = new ArrayList<>();

        for(int i=0;i<n;i++ )
        {
            v1Queue.add(V1[i]);
        }
        for(int j=0;j<m;j++)
        {
            v2Queue.add(V2[j]);
        }
        while(!v1Queue.isEmpty() && !v2Queue.isEmpty())
        {
            int v1_top = v1Queue.peek();
            int v2_top = v2Queue.peek();
            System.out.println(v1_top+" "+v2_top);
            if(v1_top == v2_top)
            {
                commonValues.add(v1Queue.peek());
                v2Queue.remove();
                v1Queue.remove();
            }
            else if(v1_top < v2_top)
            {
                v1Queue.remove();
            }
            else
            {
                v2Queue.remove();
            }
        }

        System.out.println(commonValues);
    }
}
