package Set;

import java.util.ArrayList;
import java.util.HashSet;

public class distinctDifference {

    public static void main(String args[])
    {

        int n=4;
        int arr[] = {4,4,3,3};
        ArrayList<Integer>  unique_arr = new ArrayList<>();
        int bE,aE,difference;
        for(int i=0;i<n;i++)
        {


            if(i==0)
            {
                bE = 0;
                HashSet<Integer>afterElement = new HashSet<>();
                for(int k=1;k<n;k++)
                {
                    afterElement.add(arr[k]);
                }
                aE = afterElement.size();

            }
            else if(i==(n-1))
            {
                aE=0;
                HashSet<Integer>beforeElement = new HashSet<>();
                for (int j = 0; j < i; j++) {
                    beforeElement.add(arr[j]);
                }
                bE = beforeElement.size();

            }
            else {

                HashSet<Integer>afterElement = new HashSet<>();
                HashSet<Integer>beforeElement = new HashSet<>();
                for (int j = 0; j < i; j++) {
                    beforeElement.add(arr[j]);
                }
                bE = beforeElement.size();
                for(int k=i+1;k<n;k++)
                {
                    afterElement.add(arr[k]);
                }
                aE = afterElement.size();


            }
            difference = bE-aE;
          //  System.out.println("arr[i] "+arr[i]+" i "+i+" bE "+bE+" aE "+aE+" difference "+difference);
            unique_arr.add(difference);
        }
        System.out.println(unique_arr);
    }
}
