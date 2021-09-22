public class DurationString {
    public static void getDurationString(int minute, int second) {
        if (0 > minute || 0 > second || second > 59)
            System.out.println("Invalid value");
        else {
            int hour = minute / 60;
            minute %= 60;
            System.out.println(hour + "h " + minute + "m " + second + "s");
        }
    }


    public static void getDurationString( int second) {
        if (0 > second )
            System.out.println("Invalid value");
        else {
            int minute = second / 60;
            second %= 60;
            System.out.println( minute + "m " + second + "s");
            getDurationString(minute, second);
        }
    }

}
