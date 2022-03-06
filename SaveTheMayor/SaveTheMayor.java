import java.util.*;

public class SaveTheMayor {
    public static int minMana(List<List<Integer>> lair) {
        int row = lair.size();
        int column = lair.get(0).size();

        int[][] tem = new int[row][];

        for (int i = 0; i < tem.length; i++) {
            tem[i] = new int[column];
        }

        if (lair.get(row - 1).get(column - 1) >= 0) {
            tem[row - 1][column - 1] = 1;
        } else {
            tem[row - 1][column - 1] = 1 - lair.get(row - 1).get(column - 1);
        }

        for (int i = row - 2; i >= 0; i--) {
            tem[i][column - 1] = c(lair.get(i).get(column - 1),
                    tem[i + 1][column - 1]);
        }

        for (int j = column - 2; j >= 0; j--) {
            tem[row - 1][j] = c(lair.get(row - 1).get(j), tem[row - 1][j + 1]);
        }

        for (int i = row - 2; i >= 0; i--) {
            for (int j = column - 2; j >= 0; j--) {
                tem[i][j] = Math.min(c(lair.get(i).get(j), tem[i + 1][j]),
                        c(lair.get(i).get(j), tem[i][j + 1]));
            }
        }
        return tem[0][0];
    }

    private static int c(int value, int preResult) {
        if (value == 0)
            return preResult;

        if (value > 0) {
            if (value >= preResult)
                return 1;
            return preResult - value;
        }

        return preResult - value;
    }

    public static void main(String[] args) {
    }
}
