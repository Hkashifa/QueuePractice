package ArrayList;//{ Driver Code Starts
import java.io.*;
import java.util.*;

// } Driver Code Ends
class Solution
{
    ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q, ArrayList<Integer> Query)
    {
        // code here
        if(Q == 1)
        {
            A.add(Query.get(0), Query.get(1));
            System.out.println("Printing A:"+A);
        }
        else{
            if(A.contains(Query.get(0)))
            {
               for(int i=0;i<A.size();i++)
               {
                   if(A.get(i)== Query.get(0))
                   {

                       System.out.println(i);
                   }
               }
            }
            else
            {
                System.out.println(-1);
            }
        }
        return A;
    }
}

//{ Driver Code Starts.
class arrayListOperations1{
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int q=sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                a.add(sc.nextInt());
            }
            ArrayList<Integer> query = new ArrayList<Integer>();
            if(q==1){
                query.add(sc.nextInt());
                query.add(sc.nextInt());
            }
            else{
                query.add(sc.nextInt());
            }
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.solve(n,a,q,query);
            for(int i=0;i<ans.size();i++)
            {
                System.out.print(ans.get(i));
                if(q==1)
                    System.out.print(" ");
            }
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends