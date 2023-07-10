package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class UNSswapElements {

    public static void main(String[] args)
    {
        LinkedList<Integer> unswappedList = new LinkedList<>(Arrays.asList(1,2,2,4,5,6,7,8));

        int temp;
        int temp2;
        int k;
        for(int i=1;i<unswappedList.size();i++)
        {
            System.out.println("_________________");

            System.out.println("Save value of current node in temp");
            temp = unswappedList.get(i);
            System.out.println("temp:" +temp +" i:"+i);

            System.out.println("Get value of prev node and save it to current");
            k= i-1;
            temp2=unswappedList.get(k);
            System.out.println("temp2:" +temp2 + " k:" + k);
            unswappedList.set(i,temp2);

            System.out.println("Set value of prev node to current");
            System.out.println("temp2:" +temp2 + " i:" + i);
            unswappedList.set(k,temp);
            System.out.println("temp2:" +temp2 + " k:" + k);
        }

        System.out.println(unswappedList);

        }


    }

