class Solution {
    boolean solution(String s) {
        if (s.charAt(0) == ')')
                return false;
        if (s.charAt(s.length()-1) == '(')
                return false;
        int temp=0;
         for (int i=0; i<s.length(); i++)
         {
            if (s.charAt(i) == '(') 
                temp++;
            else if (s.charAt(i) == ')')
                temp--;
             if (temp < 0) 
                return false;
        }
        
    return (temp!=0) ? false: true;
    }
}