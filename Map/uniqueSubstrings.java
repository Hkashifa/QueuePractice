package Map;

import java.util.HashMap;
import java.util.Map;

public class uniqueSubstrings {

    public static void main(String[] args)
    {
        HashMap<String, Integer> subStringCount= new HashMap<>();

        String str= "jaja";
        String temp;

        for(int i=0;i<str.length();i++)
        {
            //System.out.println("we be interatin");
            for(int j = i + 1; j <= str.length(); j++)
            {
              //  System.out.println("we be interatin again");
                temp = str.substring(i,j);
                //System.out.println("temp "+temp+"i "+i+"j "+j);
                if(subStringCount.containsKey(temp))
                {
                    int m = subStringCount.get(temp);
                    m = m +1;
                    subStringCount.replace(temp,m);
                }
                else
                {
                    subStringCount.put(temp,1);
                }
            }
        }

        for (Map.Entry<String, Integer> entry : subStringCount.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (value == 1) {
                System.out.println(key);
            }
        }

    }
}
