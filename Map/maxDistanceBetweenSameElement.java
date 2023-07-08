package Map;

import java.util.HashMap;
import java.util.HashSet;

public class maxDistanceBetweenSameElement {

    public static void main (String[] args) {

        int n=12;
        int arr[] = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
        int max = -1000;
        int new_max = 0;
        HashMap<Integer, Integer> numbers = new HashMap<>();
        for(int j =0;j<n; j++)
        {
            if(numbers.containsKey(arr[j]))
            {
                new_max = j - numbers.get(arr[j]);
                if(new_max > max)
                {
                    max = new_max;
                }
            }
            else
            {
                numbers.put(arr[j],j);
            }
        }
        
        System.out.println(new_max);
    }

}
