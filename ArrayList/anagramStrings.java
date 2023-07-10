package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class anagramStrings {

    public static void main(String args[]) {
        ArrayList<Character> first = new ArrayList<>(Arrays.asList('g', 'e', 'e', 'k', 's'));
        ArrayList<Character> second = new ArrayList<>(Arrays.asList('s', 'k', 'e', 'e', 'g'));

        if(first.size() != second.size())
        {
            System.out.println("Not anagrams");
        }
        else{
            int k = first.size();
            //System.out.println(k);
            int cnt = 0;
            for(int i = 0;i<first.size();i++)
            {
                if(first.get(i) == second.get(k-1-i))
                {
                    cnt++;
                }
            }
            if(cnt == first.size())
            {
                System.out.println("is Anagram");
            }
            else
            {
                System.out.println("is not Anagram");
            }
        }
    }

}
