import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class clock {
    public void tellTime() {
        DateTimeFormatter TodaysTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime timeRightNow = LocalTime.now();
        System.out.println("Right now, the time is " + TodaysTime.format(timeRightNow));
    }
}