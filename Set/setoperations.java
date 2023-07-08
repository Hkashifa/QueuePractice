package Set;//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;

class setoperations
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
       // System.out.println("testcase"+t);
        while(t>0)
        {
            Set<Integer> s = new HashSet<Integer>() ;
            int q = sc.nextInt();
            //System.out.println("queries"+q);
            while(q>0)
            {
                GfG g = new GfG();
                char c = sc.next().charAt(0);
                if(c == 'a')
                {
                    int x = sc.nextInt();
                  //  System.out.println("when c==a"+x);
                    g.insert(s,x);
                }
                if(c =='b')
                {
                  //  System.out.println("when c==b");
                    g.print_contents(s);
                }
                if(c == 'c')
                {
                    int x = sc.nextInt();
                  //  System.out.println("when c==c"+x);
                    g.erase(s,x);
                }
                if(c == 'd')
                {
                    int x = sc.nextInt();
                   // System.out.println("when c==d"+x);
                    System.out.print(g.find(s,x)+" ");
                }
                if(c == 'e')
                   // System.out.println("when c==e");
                    System.out.print(g.size(s)+" ");
                q--;
                //System.out.println();
            }
            t--;
            System.out.println();
        }
    }

    /* You are required to complete below methods */
    static class GfG
    {
        /*inserts an element x to the set s */
        void insert(Set<Integer> s, int x)
        {
            // Your code here
            s.add(x);

        }

        /*prints the contents of the set s in ascending order */
        void print_contents(Set<Integer> s)
        {

            System.out.println(s);
            // Your code here
        }

        /*erases an element x from the set s */
        void erase(Set<Integer> s, int x)
        {
            // Your code here
            s.remove(x);
        }

        /*returns the size of the set s */
        int size(Set<Integer> s)
        {
            // Your code here
            return  s.size();
        }

        /*returns 1 if the element x is
        present in set s else returns -1 */
        int find(Set<Integer> s, int x)
        {
            if(s.contains(x) == true)
            {
                return 1;
            }
            else
            {
                return -1;
            }

            // Your code here
        }
    }
}
// } Driver Code Ends


