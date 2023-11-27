class Solution {
    public String solution(String s) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String[] nums = s.split(" ");   
        
        for(String num:nums)
        {
            int a = Integer.parseInt(num);
            if(a>max)
                max = a;
            if(a<min)
                min = a;
        }
        
        answer+=Integer.toString(min)+' '+Integer.toString(max);
        
        return answer;
    }
}