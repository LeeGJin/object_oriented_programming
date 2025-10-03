package Week5;

enum Day { SUNDAY, MONDAY, TUESDAY,
    WENDESDAY, THURSDAY, FRIDAY, SATURDAY }

enum Month {
    JAN(1, "January"), FEB(2, "February"),
    MAR(3, "March"), APR(4, "April"),
    MAY(5, "May"), JUN(6, "June"),
    JUL(7, "July"), AUG(8, "August"),
    SEP(9, "September"), OCT(10, "October"),
    NOV(11, "November"), DEC(12, "December");

    int month;
    String name;
    Month(int month, String name) {
        this.month = month;
        this.name = name;
    }
    int getMonth() {return month;}
    String getName() {return name;}
}

public class Enum {
    public static void main(String[] args) {
        String monday = Day.MONDAY.toString();

        System.out.println(monday);

        Day day = Day.valueOf("MONDAY");
        System.out.println(monday);

        Day today = Day.SUNDAY;
        if (today == Day.MONDAY) {
            System.out.println("Today is Monday");
        }
    }
}
