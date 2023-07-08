package Set;

import java.util.HashSet;

public class removeduplicates {

    public static void main (String[] args) {
        int N = 6;
        int A[] = {2, 2, 3, 3, 7, 5};
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < N; i++) {

            set.add(A[i]);
        }

        System.out.println(set);
    }
}
