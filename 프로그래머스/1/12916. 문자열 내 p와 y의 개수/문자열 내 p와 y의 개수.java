class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int n_y = 0;
        int n_p = 0;

        s = s.toLowerCase();

        for (int i=0; i <s.length(); i++)
        {
            if (s.charAt(i) == 'y')
                n_y++;
            else if (s.charAt(i) == 'p')
                n_p++;
        }

        if (n_y != n_p)
            answer = false;

        return answer;
    }
}