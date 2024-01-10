/*
class Example {
    public static void main(String args[]) {
        System.out.println("Hello Java");

        class Vars {
        public static void main(String args[ ]) {
        int x = 150;
        double y = 2.0;
        float f = 20f;
        byte b = 10;
        short c = 14;
        y = x;
        System.out.println(y);
        }
       }
}  */
class CalendarExample {
    public static void main(String args[]) {
        int month_days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println("Month\tDays");
        for (int i = 0; i < 12; i++) {
            System.out.println(months[i] + "\t" + month_days[i]);
        }

        System.out.println("\nMonths with 31 days:");
        for (int i = 0; i < 12; i++) {
            if (month_days[i] == 31) {
                System.out.println(months[i]);
            }
        }

        int count = 0;
        System.out.println("\nMonths with less than 31 days:");
        for (int i = 0; i < 12; i++) {
            if (month_days[i] < 31) {
                System.out.println(months[i]);
                count++;
            }
        }

        System.out.println("\nTotal days number of months with less than 31 days: " + count * 30);
    }
}
