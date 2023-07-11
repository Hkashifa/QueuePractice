package Map;

import java.util.HashMap;


public class distinctSubarraySumDifference {

    public static void main(String args[])
    {

        HashMap<Integer,Integer> map = new HashMap();
        int N = 5;
        int arr[] = {3, 4, 4, 5, 1};
        for(int i=0;i<N;i++)
        {
            if(map.containsKey(arr[i]))
            {
                int m = map.get(arr[i]);
                m = m+1;
                map.replace(arr[i],m);
            }
            else {
            map.put(arr[i],1);
            }

        }
        int totalPairs =  N*(N-1)/2;
        for (int value : map.values()) {
            // Process the value
            int freq = value;
            freq = freq*(freq-1)/2;
            totalPairs = totalPairs-freq;
        }

        System.out.println(totalPairs);
    }
}
