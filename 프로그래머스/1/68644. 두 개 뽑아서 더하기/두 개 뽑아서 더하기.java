import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


class Solution {
    public int[] solution(int[] numbers) 
    {
        List<Integer> numList = IntStream.of(numbers).boxed().collect(Collectors.toList());
        System.out.println(numList);

        List<Integer> result =  new ArrayList<>();
        for (int i=0; i <numList.size(); i++)
        {
            for (int j=i+1; j < numList.size(); j++)
            {
                int temp = numList.get(i) + numList.get(j);
                if (!result.contains(temp))
                    result.add(temp);
            }
        }
        Collections.sort(result);
                int answer[] = result.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}