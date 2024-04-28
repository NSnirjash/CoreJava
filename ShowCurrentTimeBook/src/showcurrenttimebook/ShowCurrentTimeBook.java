package showcurrenttimebook;

public class ShowCurrentTimeBook {

    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        System.out.println("current Time in Millisecond: " + currentTime);
        long totalSecond = currentTime / 1000;
        System.out.println("current Time in totalsecond: " + totalSecond);
        long currentSecond = currentTime % 60;
        System.out.println("current Time in currentSecond: " + currentSecond);
        long totalMinutes = totalSecond / 60;
        System.out.println("current Time in totalMinutes: " + totalMinutes);

        long currentMinute = totalMinutes % 60;
        System.out.println("current Time in currentMinute: " + currentMinute);

        long totalHours = totalMinutes / 60 + 6 - 12;
        System.out.println("current Time in totalHours: " + totalHours);

        long currentHour = totalHours % 24;
        System.out.println("current Time in currentHour: " + currentSecond);
        System.out.println("Current time is " + currentHour + ":"
                + currentMinute + ":" + currentSecond + " GMT 6+");
    }

}
