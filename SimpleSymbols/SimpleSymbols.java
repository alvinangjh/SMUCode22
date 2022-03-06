public class SimpleSymbols {
    public static boolean simpleSymbols(String str) {
        for (int i = 0; i < str.length(); i++) {
            if ((i == 0 || i == str.length() - 1) && Character.isLetter(str.charAt(i))) {
                return false;
            }

            if (i != 0 && (i + 1) < str.length() && Character.isLetter(str.charAt(i)) && str.charAt(i - 1) != '+'
                    && (str.charAt(i + 1) != '+')) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
    }
}
