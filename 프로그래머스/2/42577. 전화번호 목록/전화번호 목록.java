import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        // 전화번호 배열을 정렬
        Arrays.sort(phone_book);
        
        // 정렬된 배열에서 현재 전화번호와 다음 전화번호 비교
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }
        
        return true;
    }
}
