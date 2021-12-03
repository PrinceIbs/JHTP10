package Chapter8Exercises;

//import java.util.concurrent.TimeUnit;

public class Ex87_EnhancedTime2 {

    private int hour;
    private int minute;
    private int second;

    public Ex87_EnhancedTime2() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public Ex87_EnhancedTime2(int hour) {
        this.hour = hour;
        this.minute = 0;
        this.second = 0;
    }

    public Ex87_EnhancedTime2(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public Ex87_EnhancedTime2(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Ex87_EnhancedTime2(Ex87_EnhancedTime2 time) {
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }

        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }

        this.second = second;
    }

    // Get methods
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void tick() {
        if (this.second >= 59) {
            this.second = 0;
            if (this.minute >= 59) {
                this.minute = 0;
                this.hour = this.hour >= 23 ? 0 : ++this.hour;
            } else {
                ++this.minute;
            }
        } else {
            ++this.second;
        }

    }

    public void incrementMinute() {
        if (this.minute >= 59) {
            this.minute = 0;
            this.incrementHour();
        } else {
            ++this.minute;
        }
    }

    public void incrementHour() {
        this.hour = this.hour <= 23 ? this.hour = 0 : ++this.hour;
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    @Override
    public String toString() {
        return String.format("%d:%02d:%02d %s", (hour == 0 || hour == 12)
                ? 12 : hour % 12, minute, second, (hour < 12 ? "AM" : "PM"));

    }

}



// Test class for EnhancedTime2
class EnhancedTime2Test {

    public static void main(String[] args) {
        Ex87_EnhancedTime2 time1 = new Ex87_EnhancedTime2(23, 58, 58);
        Ex87_EnhancedTime2 time2 = new Ex87_EnhancedTime2(23, 58, 59);
        Ex87_EnhancedTime2 time3 = new Ex87_EnhancedTime2(23, 58, 59);

        Ex87_EnhancedTime2 clock = new Ex87_EnhancedTime2();

        time1.tick();
        time2.incrementMinute();
        time3.incrementHour();
        
        System.out.printf("After 1 sec tick. New time1: %s%n", time1.toString());
        System.out.printf("After 1 minute tick. New time1: %s%n", time2.toString());
        System.out.printf("After 1 hour tick. New time1: %s%n%n", time3.toString());
        
        
        // Simulate ticking clock with delay effect
//        try {
//            for (int i = 1; i <= 120; i++) {
//                clock.tick(); // clock ticks for 1 second
//                System.out.println(clock.toString());
//                TimeUnit.MILLISECONDS.sleep(1000);
//            }
//        } catch (Exception e) {
//            System.out.printf("Exception: %s", e);
//        }

    }
}
