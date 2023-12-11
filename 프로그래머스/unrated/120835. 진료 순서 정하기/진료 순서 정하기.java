import java.io.*;
import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i : emergency) {
            temp.add(i);
        }
        temp.sort(Collections.reverseOrder());
        System.out.println(temp);
        for (int i = 0; i < emergency.length; i++)
        {
            emergency[i] = temp.indexOf(emergency[i])+1;
        }
        
        return emergency;
    }
}