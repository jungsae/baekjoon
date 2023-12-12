import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new TreeMap<>();
        for (String s : participant)
            map.put(s, map.getOrDefault(s, 0) + 1);
        for (String s : completion)
            map.put(s, map.get(s) - 1);

        for (String key : map.keySet()) {
            if (map.get(key) == 1) 
                sb.append(key);
        }

        return sb.toString();
    }
}
