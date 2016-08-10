package date;
import java.util.Scanner;
public class DateTest 
{
    public static void main(String[] args) 
    {
        
        Scanner i=new Scanner(System.in);
        Date d=new Date();
        int z;
        System.out.print("\nEnter date...");
        z=i.nextInt();
        d.setDate(z);
        System.out.print("\nEnter month...");
        z=i.nextInt();
        d.setMonth(z);
        System.out.print("\nEnter year...");
        z=i.nextInt();
        d.setYear(z);
        d.displayDate();
    }
    
}
