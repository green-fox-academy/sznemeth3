public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int TotalSecondsADay = 60 * 60 * 24;
        int RemainingSeconds = TotalSecondsADay - (currentHours * 3600) - (currentMinutes * 60) - (currentSeconds);
        System.out.println(RemainingSeconds + " seconds are left from the day.");
        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
    }
}
