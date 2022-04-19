import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Scanner; 

class TestDate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please fill a day (1-31) :");
        int day = sc.nextInt();
        System.out.println("Please fill a month (1-12) :");
        int month = sc.nextInt();
        System.out.println("Please fill a year :");
        int year = sc.nextInt();
        sc.close();

        // TODO : your code after this line
        
        
        
        // Anpassung Monat beginnt mit 0 für Januar
        month = month-1;

        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");

        Calendar c = new GregorianCalendar(year, month, day);
        Date d = c.getTime();
        System.out.println("The date is : " + sdf.format(d));

        // DAY_OF_WEEK 1 Sonntag 2 Montag ...
        System.out.println("The day of week is : " + c.get(Calendar.DAY_OF_WEEK));

        SimpleDateFormat sdfApfel = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Apfeldatum : " + sdfApfel.format(d));
    }
}