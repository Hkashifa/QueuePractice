package LinkedList;
import java.util.HashSet;
import java.util.*;
import java.util.ArrayList;

public class intersectionOfTwoSortedLinkedList {

    public static void main(String args[]) {

        LinkedList<Integer> array_1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 6));
        LinkedList<Integer> array_2 = new LinkedList<>(Arrays.asList(2,4,6,8));

        ArrayList<Integer> arrayList = new ArrayList<>();
        Set<String> set = new HashSet<>();

        for(int i=0; i < array_1.size(); i++)
        {
            for(int j =0; j<array_2.size();j++)
            {
                if(array_1.get(i) == array_2.get(j))
                {
                    arrayList.add(array_1.get(i));
                }
            }
        }

        System.out.println(arrayList);

    }
}
