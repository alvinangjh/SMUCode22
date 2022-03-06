public class StringCompression {
    public static String compress(String s) {
        StringBuilder result = new StringBuilder();
        String[] arrStr = s.split("");
        String currentLetter = arrStr[0];
        int count = 1;

        for (int i = 1; i < arrStr.length; i++) {
            if (!currentLetter.equals(arrStr[i]) && count <= 2) {
                if (count == 1) {
                    result.append(currentLetter);
                }

                if (count == 2) {
                    result.append(currentLetter);
                    result.append(currentLetter);
                }

                currentLetter = arrStr[i];
                count = 1;
                continue;
            }

            if (!currentLetter.equals(arrStr[i])) {
                result.append(currentLetter);
                result.append(count + "");
                currentLetter = arrStr[i];
                count = 1;
                continue;
            }

            count++;
        }

        result.append(currentLetter);
        result.append(count + "");

        return result.toString();

    }

    public static void main(String[] args) {
    }
}
