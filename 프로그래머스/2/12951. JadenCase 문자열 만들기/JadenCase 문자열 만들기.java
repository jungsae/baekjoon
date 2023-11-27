class Solution {
    public String solution(String s) {
        String answer = "";
        boolean check = true;
        
        if (s.length() == 1) 
        {
                answer += s.toUpperCase();
                return answer;
        }
        
        for(int i = 0; i < s.length(); i++)
        {   
        char currentChar = s.charAt(i);
        
        if(Character.isLetter(currentChar) || Character.isDigit(currentChar))
        {
            answer += check ? Character.toUpperCase(currentChar) : Character.toLowerCase(currentChar);
            check = false;
        }
        else if(currentChar == ' ')
        {
            check = true;
            answer += ' ';
        }
        else
        {
            answer += currentChar;
        }
        }
        return answer;
    }
}
