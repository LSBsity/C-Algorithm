import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        Set<String> set = new LinkedHashSet<>(Arrays.stream(my_string.split("")).collect(Collectors.toList()));
        
        StringBuilder sb = new StringBuilder();
        
        for (String c : set) sb.append(c);
        
        return sb.toString();
    }
}