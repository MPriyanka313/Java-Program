import java.util.*;
public class GroupAnagrams {
    public static int groupAnagrams(String[] strings) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String str : strings) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            groups.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }
        int count = 0;
        for (List<String> group : groups.values()) {
            if (group.size() > 1) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String[] strings = {"rat", "art", "cat", "act", "dog", "god", "tar", "pat"};
        int count = groupAnagrams(strings);
        System.out.println(count);
    }
}

