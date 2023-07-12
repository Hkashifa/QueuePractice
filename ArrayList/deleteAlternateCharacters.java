package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class deleteAlternateCharacters {
    public static void main(String args[])
    {
        ArrayList<Character>str = new ArrayList<>(
                Arrays.asList('G','e','e','k','s','f','o','r','g','e','e','k','s'));
        System.out.println(str);
        for(int i=0;i<str.size();i++)
        {
            if((i!=0)||(i==2)||(i%2 !=0))
            {
                str.remove(i);
            }
        }
        System.out.println(str);
    }
}
