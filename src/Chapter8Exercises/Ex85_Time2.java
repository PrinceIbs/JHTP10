package Chapter8Exercises;

// Exercise 8.5: EnhancedTime2 class
public class Ex85_Time2 {

    private int seconds;
    private int second;
    private int minute;
    private int hour;
    private static final int MINUTE_TO_SECONDS = 60;
    private static final int HOUR_TO_SECONDS = 3600;

    public Ex85_Time2() {
        this(0);
    }

    public Ex85_Time2(int hour) {
        this.hour = hour;

        this.seconds = hour * HOUR_TO_SECONDS;
    }

    public Ex85_Time2(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;

        this.seconds = (hour * HOUR_TO_SECONDS) + (minute * MINUTE_TO_SECONDS);

    }

    public Ex85_Time2(int hour, int minute, int second) {
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

        this.seconds
                = (hour * HOUR_TO_SECONDS) + (minute * MINUTE_TO_SECONDS) + second;

    }

    public Ex85_Time2(Ex85_Time2 time) {
        this.hour = time.hour;
        this.minute = time.minute;
        this.second = time.second;

        this.seconds = time.seconds;
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

        this.seconds
                = (hour * HOUR_TO_SECONDS) + (minute * MINUTE_TO_SECONDS) + second;

    }

    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        this.hour = hour;

        this.seconds = hour * HOUR_TO_SECONDS;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }

        this.minute = minute;

        this.seconds = minute * MINUTE_TO_SECONDS;
    }

    public void setSecond(int second) {
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }

        this.second = second;

        this.seconds = second;
    }

    // Get methods
    public int getHour() {
        return (int) seconds / HOUR_TO_SECONDS;
    }

    public int getMinute() {
        return (int) (seconds % HOUR_TO_SECONDS) / MINUTE_TO_SECONDS;
    }

    public int getSecond() {
        return second;
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    @Override
    public String toString() {

        return String.format("%d:%02d:%02d %s", (hour == 0 || minute == 12)
                ? 12 : hour % 12, minute, second, (hour < 12 ? "AM" : "PM"));
    }

}



// Class to test EnhancedTime2
class Time2Test {

    public static void main(String[] args) {
        Ex85_Time2 t1 = new Ex85_Time2();
        Ex85_Time2 t2 = new Ex85_Time2(15);
        Ex85_Time2 t3 = new Ex85_Time2(15, 33);
        Ex85_Time2 t4 = new Ex85_Time2(15, 33, 59);
        Ex85_Time2 t5 = new Ex85_Time2(t4);

        System.out.println("Constructed with: ");
        displayTime("t1: all default arguments", t1);
        displayTime("t2:hour specified; default minute and second", t2);
        displayTime("t3:hour and minute specified; default second", t3);
        displayTime("t4:hour minute and second specified", t4);
        displayTime("t5:Time2 object t4 specified", t4);

        // attempt to initialize t6 with invalid values
        try {
            Ex85_Time2 t6 = new Ex85_Time2(99, 99, 99);
        } catch (IllegalArgumentException e) {
            System.out.printf("%nException while initializing t6: %s%n", e.getMessage());
        }

    }

    private static void displayTime(String header, Ex85_Time2 t) {
        System.out.printf("%s%n %s%n %s%n",
                header, t.toUniversalString(), t.toString());
    }

}
