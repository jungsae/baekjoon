import java.util.ArrayList;
class Solution {
    public int[] solution(long n) {
        int[] answer ={};
        ArrayList<Long> temp = new ArrayList<>();

        while (n != 0)
        {
            temp.add(n%10);
            n/=10;
        }

        answer = temp.stream().mapToInt(Long::intValue).toArray();

        return answer;
    }
}