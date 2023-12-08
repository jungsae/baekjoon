class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        StringBuffer sb = new StringBuffer(A);
        
        if(A.equals(B))
            return 0;
        
        // for (int i=0; i<A.length(); i++)
        // {
        //     sb.insert(0,A.charAt(A.length()-(i+1)));
        //     sb.delete(A.length(),A.length()+1);
        //     if (sb.toString().equals(B)) 
        //         return i+1;
        // }
        else{
            String temp = B + B;
            answer = temp.indexOf(A);
            return answer;
        }
    }
}