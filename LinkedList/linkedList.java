package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class linkedList {

    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
    int temp = sc.nextInt();

       for(int i=0;i<temp;i++)
    {

        //System.in is a standard input stream
        int N = sc.nextInt();
        //System.in is a standard input stream
        int P = sc.nextInt();

        LinkedList<Integer> numbers = new LinkedList<>();


        for(int j=0;j<N;j++)
        {
   //System.in is a standard input stream
            int value = sc.nextInt();
            numbers.add(value);
        }

        numbers.remove(P);
        System.out.println(numbers);


    }}
}
