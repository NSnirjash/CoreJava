
package showcurrenttime;


public class ShowCurrentTime {

    
    public static void main(String[] args) {
        
        long currentTime = System.currentTimeMillis();
        System.out.println("current Time in Millisecond: "+currentTime);
        long second = currentTime/1000;
        System.out.println("current Time in second: "+second);
        long minute = second/60;
        System.out.println("current Time in minute: "+minute);
        long hour = minute/60;
        System.out.println("current Time in hour: "+hour);
        long day = hour/24;
        System.out.println("current Time in day: "+day);
        long month = day/30;
        System.out.println("current Time in month: "+month);
        long year = month/12;
        System.out.println("current Time in year: "+year);
        
    }
    
}
