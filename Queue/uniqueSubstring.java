package Queue;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class uniqueSubstring {

    public static void main(String[] args) {

        Queue<String> substrings = new ArrayDeque<>();
        Set<String> uniqueSubstring = new HashSet<>();

        String s = "abd";

        for (int i=0;i<s.length();i++) {
            substrings.offer(String.valueOf(s.charAt(i)));
            StringBuilder tempStr = new StringBuilder();

            while(!substrings.isEmpty())
            {
                tempStr.append(substrings.poll());
                uniqueSubstring.add(tempStr.toString());
                substrings.offer(tempStr.toString());

            }

        }

        System.out.println(substrings.size());

    }
}
