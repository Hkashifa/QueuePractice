package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class commonElements {

    public static void main(String args[]) {
        int n = 5;
        ArrayList<Integer> v1 = new ArrayList<>(Arrays.asList(3, 4, 2, 2, 4));
        int m = 4;
        ArrayList<Integer> v2 = new ArrayList<>(Arrays.asList(3, 2, 2, 7));
        ArrayList<Integer> v3 = new ArrayList<>();

        if((v2.size() > v1.size()) || (v2.size() == v1.size()))
        {
            System.out.println("we be iteratin");
            for (int i = 0; i < v2.size();i++)
            {
                for(int j=0;j< v1.size();j++)
                {
                    if(v1.get(j) == v2.get(i))
                    {
                        v3.add(v2.get(i));
                    }
                }
            }

        }
        else if(v2.size() < v1.size())
        {
            System.out.println("we be iteratin here");
            for (int i = 0; i < v1.size();i++)
            {
                for(int j=0;j< v2.size();j++)
                {
                    System.out.println("we be comparing "+"v1: "+v1.get(i)+" v2 "+v2.get(j));
                    if(v1.get(i) == v2.get(j))
                    {
                        v3.add(v2.get(j));
                        System.out.println("we gots a pair");
                    }
                }
            }

        }
        System.out.println(v3);



    }
}
