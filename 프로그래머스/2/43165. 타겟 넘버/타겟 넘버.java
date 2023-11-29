class Solution {
    private int answer;

    public int solution(int[] numbers, int target) {
        answer = 0;
        dfs(numbers, target, 0, 0);
        return answer;
    }

    private void dfs(int[] numbers, int target, int idx, int sum) {
        if (idx == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }

        dfs(numbers, target, idx + 1, sum + numbers[idx]);
        dfs(numbers, target, idx + 1, sum - numbers[idx]);
    }
}
