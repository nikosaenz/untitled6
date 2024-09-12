public class Time {
    public static void main(String[] args) {
        int hour = 17;
        int minute = 15;
        int second = 30;

        int secondsSinceMidnight = (hour * 3600) + (minute * 60) + second;
        System.out.println("Seconds since midnight: " + secondsSinceMidnight);

        int totalSecondsInDay = 24 * 3600;

        int secondsRemaining = totalSecondsInDay - secondsSinceMidnight;
        System.out.println("Seconds remaining in the day: " + secondsRemaining);
    }
}
