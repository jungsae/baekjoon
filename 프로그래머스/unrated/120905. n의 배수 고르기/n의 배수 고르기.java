import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> nl = Arrays.stream(numlist).boxed().collect(Collectors.toList());
        int answer[] = nl.stream().filter(v -> v%n==0).mapToInt(Integer::intValue).toArray();
        return answer;
    }
}