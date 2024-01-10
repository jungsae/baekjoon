import java.util.*;

class Solution {
    public List<String> solution(String[] record) {
        Map<String, String> users = new HashMap<>();
        List<String> answer = new ArrayList<>();
        for (String info: record)
        {
            String spl[] = info.split(" ");
            if(spl[0].equals("Enter"))
                users.put(spl[1], spl[2]);
            else if(spl[0].equals("Change"))
                users.put(spl[1], spl[2]);
        }
        for (String info: record)
        {
            String spl[] = info.split(" ");
            if(spl[0].equals("Enter"))
                answer.add(users.get(spl[1]) + "님이 들어왔습니다.");
            else if(spl[0].equals("Leave"))
                answer.add(users.get(spl[1]) + "님이 나갔습니다.");
        }
        
        return answer;
    }
}