package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class mergeListAlternately {

    public static void main(String args[])
    {
        LinkedList<Integer>list1 = new LinkedList<>(Arrays.asList(55,66,77,88,99));
        LinkedList<Integer>list2 = new LinkedList<>(Arrays.asList(11,22,33,44,55));
        LinkedList<Integer>merge_list= new LinkedList<>();

        int total_size = list1.size() + list2.size();
        for(int i = 0;i<total_size;i++)
        {
            if( (i == 0 || i==2 || i%2 == 0) && (!list1.isEmpty()))
            {
                merge_list.add(list1.getFirst());
                list1.removeFirst();

            }
            else if(list1.isEmpty())
            {
                merge_list.add(list2.getFirst());
                list2.removeFirst();
            }
            else if((i != 0 || i !=2 || i%2 != 0) && (!list2.isEmpty()))
            {
                merge_list.add(list2.getFirst());
                list2.removeFirst();
            }
        }
        System.out.println(merge_list);
    }
}
