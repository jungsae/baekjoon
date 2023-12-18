class Solution {
    static int acc = 0;

    static void combination(int balls, int share, int n, int start) {
        if (share == 0) { 
            acc++;
            return;
        }

        for (int i = start; i <= balls; i++) {
            combination(balls, share - 1, n, i + 1); 
        }
    }

    public int solution(int balls, int share) {
        combination(balls, share, share, 1); 
        return acc;
    }
}
