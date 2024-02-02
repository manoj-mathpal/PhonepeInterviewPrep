package phonePe;

import java.util.HashSet;

public class LongestSubStringWithoutRepeatingCharacter {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet();
        int len=0;
        int i=0;
        for(int j=0;j<s.length();j++){
            if(!set.contains(s.charAt(j))) {
                len++;
                set.add(s.charAt(j));
                j++;
                len=Math.max(len,set.size());
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return len;
    }
}
