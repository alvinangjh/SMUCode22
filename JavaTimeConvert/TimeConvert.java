public class TimeConvert {
    public static String timeConvert(int num) {
        // Write your code here
        if (num == 0)
            return "0 hours 0 minutes";
        int hours = num / 60;
        int minutes = num % 60;
        String hourPostfix = "hours";
        String minutePostfix = "minutes";

        if (hours == 1) {
            hourPostfix = "hour";
        }

        if (minutes == 1) {
            minutePostfix = "minute";
        }

        return hours + " " + hourPostfix + " " + minutes + " " + minutePostfix;
    }
}