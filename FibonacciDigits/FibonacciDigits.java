public class FibonacciDigits {
    public static int fibonacci_digits(int n) {
        // Write your code here
        if (n == 1) {
            return 1;
        }

        int ctr = 1;

        while (true) {

            double d = (ctr * Math.log10(1.6180339887498948)) - ((Math.log10(5)) / 2);
            double fibRslt = Math.ceil(d);
            if (fibRslt == n) {
                break;
            }

            ctr++;
        }

        return ctr;
    }
}
