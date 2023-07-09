package Set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class uniqueSubstring {
    public static void main(String[] args)
    {
        HashSet<String> subStringCount= new HashSet<>();

        String str= "jaja";
        String temp;

        for(int i=0;i<str.length();i++)
        {

            for(int j = i + 1; j <= str.length(); j++)
            {

                temp = str.substring(i,j);
               subStringCount.add(temp);

            }
        }

        System.out.println(subStringCount);

    }
}
