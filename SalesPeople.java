package salespeople;
import java.util.*;
public class SalesPeople 
{
    Scanner in=new Scanner(System.in);
    int gross[]=new int[15];
    int count[]=new int[15];
    double income[]=new double[15];
    int n,i,j;
    public void setGross()
    {
        System.out.print("\nEnter no of salespersons...");
        n=in.nextInt();
        System.out.print("\nEnter the grosspay gott by the salespersons...\n");
        for(i=0;i<n;i++)
        {
            System.out.print("\nEnter the grosspay got by salesperson"+(i+1)+"...");
            gross[i]=in.nextInt();
            income[i]=200+(0.09*gross[i]);
        }
    }
    public void sortFill()
    {
        Arrays.fill(count,0);
    }
    public void findCount()
    {
        for(i=0;i<n;i++)
        {
            if(income[i]>=200&&income[i]<=299)
                count[0]++;
            else
                if(income[i]>=300&&income[i]<=399)
                        count[1]++;
                else
                    if(income[i]>=400&&income[i]<=499)
                            count[2]++;
                    else
                        if(income[i]>=500&&income[i]<=599)
                            count[3]++;
                        else
                            if(income[i]>=600&&income[i]<=699)
                                count[4]++;
                            else
                                if(income[i]>=700&&income[i]<=799)
                                    count[5]++;
                                else
                                    if(income[i]>=800&&income[i]<=899)
                                        count[6]++;
                                    else
                                        if(income[i]>=900&&income[i]<=999)
                                            count[7]++;
                                        else
                                            count[8]++;
        }
    }
    public void displayCount()
    {
        System.out.print("\n$200-299\t$300-399\t$400-499\t$500-599\t$600-699\t$700-799\t$800-899\t$900-999\t$1000 and over\n");
        for(i=0;i<9;i++)
        {
            System.out.print(count[i]+"\t\t");
        }
    }
}
 