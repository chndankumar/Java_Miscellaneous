package Java_Miscellaneous;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    // Example of a method that prints a custom message for each day
    public void printMessage() {
        switch (this) {
            case MONDAY:
                System.out.println("Start of the workweek.");
                break;
            case TUESDAY:
                System.out.println("Second day of the workweek.");
                break;
            case WEDNESDAY:
                System.out.println("Midweek blues.");
                break;
            case THURSDAY:
                System.out.println("Almost there.");
                break;
            case FRIDAY:
                System.out.println("End of the workweek. Time to relax!");
                break;
            case SATURDAY:
                System.out.println("Weekend fun!");
                break;
            case SUNDAY:
                System.out.println("Rest and recharge for the week ahead.");
                break;
        }
    }
}

public class EnumExample {
    public static void main(String[] args) {
        Day monday = Day.MONDAY;
        int ordianl = monday.ordinal();
        System.out.println(ordianl);
        System.out.println(monday.name());
        System.out.println(monday.name().toString());
        System.out.println(monday.toString());
        Day enumDay = Day.valueOf("MONDAY");
        System.out.println(enumDay);
    }
}
