import java.util.*;

public class MissingNo {
    public static List<Integer> missingNo(List<Integer> arr) {
        if (arr == null || arr.size() == 0) {
            return new ArrayList<Integer>();
        }

        Collections.sort(arr);
        List<Integer> resultArr = new ArrayList<Integer>();
        int ctr = 0;
        int startingNum = arr.get(0);

        for (int i = startingNum; i < arr.get(arr.size() - 1); i++) {

            if (arr.get(ctr) != i) {
                resultArr.add(i);
                continue;
            }

            ctr++;
        }

        return resultArr;
    }

    public static void main(String[] args) {
    }
}