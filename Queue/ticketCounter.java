package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ticketCounter {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter n- ");
        int n= sc.nextInt();
        System.out.print("Enter k- ");
        int k= sc.nextInt();

        Deque<Integer> numbers = new ArrayDeque<>();

        for(int i=1;i<n+1;i++)
        {
            numbers.addLast(i);
        }
        System.out.println(numbers);

        while(numbers.size() > k)
        {
            for(int j=0; j < k ;j++)
            {
                numbers.removeFirst();
            }
            if(numbers.size() > k) {
                for (int j = 0; j < k; j++) {

                    numbers.removeLast();
                }
            }
        }

        System.out.println(numbers.peekLast());
    }
}
