package LinkedList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class unionOfTwoLinkedList {

    public static void main(String args[]) {


        LinkedList<Integer> array_1 = new LinkedList<>(Arrays.asList(9,6,4,2,3,8));
        LinkedList<Integer> array_2 = new LinkedList<>(Arrays.asList(1,2,8,6,2));
        LinkedList<Integer> array_3 = new LinkedList<>(Arrays.asList(1,2,8,6,2));

       Set<Integer> newSet = new HashSet<>();//Doesn't take in unique values like it is suppose to

        for(int i=0;i< array_1.size();i++)
        {
            newSet.add(array_1.get(i));
        }
        for(int i=0;i< array_2.size();i++)
        {
            newSet.add(array_2.get(i));
        }




        System.out.println(newSet);

    }
}
