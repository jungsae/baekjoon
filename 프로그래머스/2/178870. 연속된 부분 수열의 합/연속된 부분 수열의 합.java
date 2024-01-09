import java.util.*;
class Sequence{
    int start;
    int end;
    public Sequence(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
class Solution {
    public int[] solution(int[] sequence, int k) {
        List<Sequence> answers = new ArrayList<>();
        int[] answer = new int[2];
        int sum=0;
        int lt=0;
        for (int rt = 0; rt < sequence.length; rt++) {
            sum += sequence[rt];
            if(sum==k) {
                answers.add(new Sequence(lt, rt)); //7과 1 7의 경우
            }
            while(sum>k){
                sum -= sequence[lt];
                lt++;
                if(sum==k) {
                    answers.add(new Sequence(lt, rt)); // 1 2 3 4의 경우
                }
            }
        }
        int minLength = Integer.MAX_VALUE;
        int minIndex=0;
        // 정답 후보들을 모두 돌면서 가장 짧은 길이 찾기
        List<Sequence> minLenSequences = new ArrayList<>();
        int answers_len = answers.size();
        for (int i = 0; i < answers_len; i++) {
            int sequence_len = answers.get(i).end - answers.get(i).start;
            if(sequence_len < minLength) {
                minLength = sequence_len;
                minIndex = i;
            }
        }
        answer[0] = answers.get(minIndex).start;
        answer[1] = answers.get(minIndex).end;
        return answer;
    }
}