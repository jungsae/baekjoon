class Solution {
    public String solution(String rny_string) {
        String answer = "";
        for(char al:rny_string.toCharArray())
        {
            if(al == 'm')
                answer += "rn";
            else
                answer += al;
        }
        return answer;
    }
}