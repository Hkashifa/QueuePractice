package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListOf012 {

    public static void main (String args[]) {
        int N = 8;
        int value[] = {1, 2, 2, 1, 2, 0, 2, 2};

        LinkedList<Integer> storeOne = new LinkedList<>();
        LinkedList<Integer> storeZero = new LinkedList<>();
        LinkedList<Integer> storeTwo = new LinkedList<>();

        LinkedList<Integer> combined = new LinkedList<>();

        for (int i = 0; i < N; i++) {

            if(value[i] == 0)
            {
                storeZero.add(0);
            }
            if(value[i] == 1)
            {
                storeOne.add(1);
            }
            if(value[i] == 2)
            {
                storeTwo.add(2);
            }
        }

        combined.addAll(storeZero);
        combined.addAll(storeOne);
        combined.addAll(storeTwo);

        System.out.println(combined);

    }
}
