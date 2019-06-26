public class Exercise {
    public static void main(String args[])
    {
        double no1= 20;
        double no2 =80;
        double total = (no1 + no2) * 25;

        System.out.println("Total = " + total);
        double thereminder = total %40;
        System.out.println("Reminder is =" + thereminder);
        if (thereminder <= 20)
            System.out.println("Total was over the Limit");
        }
    }
