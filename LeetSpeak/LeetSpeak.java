import java.util.*;
import java.util.stream.Collectors;

public class LeetSpeak {
    public static String translate(String s) {
        // Write your code here
        Map<String, String> conversionMap = new HashMap<>();
        String[] arrStr = s.split("");
        StringBuilder result = new StringBuilder();

        conversionMap.put("A", "4");
        conversionMap.put("B", "8");
        conversionMap.put("C", "[");
        conversionMap.put("E", "3");
        conversionMap.put("I", "|");
        conversionMap.put("J", "]");
        conversionMap.put("O", "0");
        conversionMap.put("S", "$");
        conversionMap.put("T", "7");
        conversionMap.put("Z", "2");
        conversionMap.put("a", "@");
        conversionMap.put("b", "6");
        conversionMap.put("g", "9");
        conversionMap.put("l", "1");
        conversionMap.put("s", "5");
        conversionMap.put("t", "+");

        Map<String, String> reverseMap = conversionMap.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));

        for (int i = 0; i < arrStr.length; i++) {
            if (conversionMap.containsKey(arrStr[i])) {
                result.append(conversionMap.get(arrStr[i]));
                continue;
            }

            if (reverseMap.containsKey(arrStr[i])) {
                result.append(reverseMap.get(arrStr[i]));
                continue;
            }

            result.append(arrStr[i]);
        }

        return result.toString();

    }
}
