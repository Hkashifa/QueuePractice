package Set;
//Unsolved
import java.util.HashSet;

public class LargestArraywith0sum{

    public static void main (String[] args) {
        int maxLen = 0;
        int sum = 0;
        HashSet<Integer> sumSet = new HashSet<>();

        int N = 8;
        int array[] = {15,-2,2,-8,1,7,10,23};
        int b = 0;
        int first_occurence = 0;
        for(int j=0;j<N;j++)
        {

            sum = sum + array[j];
            if(sum == 0)
            {
                maxLen = maxLen +1;
                if(b==0)
                {
                  b=1;
                    first_occurence=j;
                }

            }
            if(!sumSet.contains(sum))
            {
                sumSet.add(sum);
            }
            else
            {
                if((first_occurence-j)> maxLen)
                {
                    maxLen = (first_occurence -j) ;
                }
            }
        }

        System.out.println(maxLen);
    }

}
