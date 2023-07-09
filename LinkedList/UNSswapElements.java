package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class UNSswapElements {

    public static void main(String[] args)
    {
        LinkedList<Integer> unswappedList = new LinkedList<>(Arrays.asList(1,2,2,4,5,6,7,8));
       int temp =0;
       int x = 0;
       int y=0;
       int k = 0;
       int m =0;
        for(int i=0;i<unswappedList.size();i++)
        {
            System.out.println("we be interatin");
            if(i>0) {
                k=i-1;
                System.out.println("k"+k);

                x = unswappedList.get(i);
                System.out.println("x" + x);
                y = unswappedList.get(k);
                System.out.println("y" + y);

                unswappedList.set(k,x);
                System.out.println("unswappedList.get(k)" +unswappedList.get(k));//stays 1 even if the value of i keeps changing

                unswappedList.set(i,y);
                System.out.println("unswappedList.get(i)"+unswappedList.get(i));

            }
        }

        System.out.println(unswappedList);

    }
}
