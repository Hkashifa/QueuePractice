package Map;

import java.util.HashMap;

public class Hashmap {
    public static void main(String args[]) {
        int n = 4;
        String keys[] = {"csdb", "dsh", "askj", "adfs"};
        int arr[]={4, 5, 8, 9};
        String s = "sak";

        HashMap<String, Integer> numbers = new HashMap<>();

        for (int i = 0; i < n; i++) {

            numbers.put(keys[i],arr[i]);
        }

        if(numbers.get(s) == null)
        {
            System.out.println(-1);
        }
        else {
            System.out.println(numbers.get(s));
        }
    }
}
