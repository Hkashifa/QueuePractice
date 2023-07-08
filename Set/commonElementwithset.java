package Set;

import java.util.HashSet;

public class commonElementwithset {

    public static void main (String[] args){

        int n = 5;
        int v1[] = {3, 4, 2, 2, 4};
        int m = 4;
        int v2[] = {3, 2, 2, 7};

        HashSet<Integer> v1_set = new HashSet<>();
        HashSet<Integer> v2_set = new HashSet<>();

        for(int i=0;i<n;i++)
        {
            v1_set.add(v1[i]);
        }

        for(int j=0;j<m;j++)
        {
            v2_set.add(v2[j]);
        }
        v1_set.retainAll(v2_set);
        System.out.println(v1_set);

    }
}
