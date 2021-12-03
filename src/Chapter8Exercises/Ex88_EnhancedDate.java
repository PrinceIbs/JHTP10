package Chapter8Exercises;

// Exercise 8.8: Enhanced  class Date
// 
public class Ex88_EnhancedDate {

    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth
            = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Ex88_EnhancedDate(int month, int day, int year) {
        // Validate year
        if (year < 1700 || year > 2021) {
            throw new IllegalArgumentException("year (" + year + ") out-of-range");
        }

        // check if month in range
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException(
                    "month (" + month + ") must be 1-12");
        }

        // check if day in range for month
        if (day < 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException(
                    "day (" + day + ") out-of-range for the specific month and year");
        }

        // check for leap if month is 2 and day is 29
        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException(
                    "day (" + day + ") out-of-range for the specific month and year");
        }

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf("Date object constructor for date %s%n", this);

    }

    // return a String of the form month/day/year
    @Override
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }

    public void nextDay() {
        if (day == daysPerMonth[month]) { // if day is last day of month
            day = 1;
            incrementMonth();
        } else {
            ++day;
        }
    }

    public void incrementMonth() {
        if (month == 12) { // if month is last month of the year
            month = 1;
            incrementYear();
        } else {
            ++month;
        }
    }

    public void incrementYear() {
        ++year;
    }
}

// Class tests EnhancedDate class
class EnhancedDateTest {

    public static void main(String[] args) {
        try {
            Ex88_EnhancedDate date1 = new Ex88_EnhancedDate(07, 21, 2021);

            for (int i = 0; i <= 365; i++) {
                date1.nextDay();
                System.out.printf("%s%n", date1);
            }

        } catch (IllegalArgumentException e) {
            System.out.printf("An Exception occured: %s%n", e.getMessage());
        }

    }
}
