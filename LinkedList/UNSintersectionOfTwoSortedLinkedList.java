package LinkedList;
import java.util.HashSet;
import java.util.*;

public class UNSintersectionOfTwoSortedLinkedList {

    public static void main(String args[]) {

        LinkedList<Integer> array_1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 6));
        LinkedList<Integer> array_2 = new LinkedList<>(Arrays.asList(2,4,6,8));

        ArrayList<Integer> arrayList = new ArrayList<>();
        Set<String> set = new HashSet<>();

        if((array_1.size() > array_2.size()) || (array_1.size() == array_2.size()))
        {
            for(int i=0;i< array_1.size();i++)
            {
                set.add(String.valueOf(array_1.get(i)));
                System.out.println("Everything added to set1 "+String.valueOf(array_1.get(i)));
            }

            System.out.println("In Set" + set);
            for(int j=0;j< array_2.size();j++)
            {
                int temp = array_2.get(j);
                System.out.println(temp);
                if(set.contains(temp))//Doesn't work like it's suppose to
                {
                    arrayList.add(array_2.get(j));
                    System.out.println("Everything checked for in set2" +String.valueOf(array_2.get(j)));
                }
            }

        }
        if(array_1.size() < array_2.size())
        {
            for(int k=0;k< array_2.size();k++)
            {
                set.add(String.valueOf(array_2.get(k)));
                System.out.println("Everything added to set2"+String.valueOf(array_2.get(k)));
            }
            for(int m=0;m< array_1.size();m++)
            {
                if(set.contains(array_1.get(m)))
                {
                    arrayList.add(array_1.get(m));
                    System.out.println("Everything checked for in set1"+ String.valueOf(array_2.get(m)));
                }
            }

        }
        System.out.println(arrayList);

    }
}
