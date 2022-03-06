import java.util.*;

public class ComputerWars {
    public static int fight(List<Integer> arr) {
        // Write your code here

        while (arr.size() > 1) {
            Collections.sort(arr, Collections.reverseOrder());
            int diff = arr.get(0) - arr.get(1);
            arr.remove(0);
            arr.remove(0);
            arr.add(0, diff);
        }

        return arr.get(0);
    }

    public static void main(String[] args) {
    }
}
