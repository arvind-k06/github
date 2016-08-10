package duplicate;
import java.util.*;
import java.util.Arrays;
public class Duplicate 
{
    Scanner input=new Scanner(System.in);
   int arr[]=new int[5];
   int i=0,x=0;
   public void setArray()
   {
        System.out.println("\nEnter array elements(array size=5)...");
        for(int l=0;l<arr.length;l++)
        {
            if(i==0)
            {
                    System.out.print("\nEnter the number:");
                    x=input.nextInt();
                    arr[i]=x;
                    System.out.print("\nGiven number:"+arr[i]);
                    i++;
            }
            else
            {
                    System.out.print("\nEnter the number:");
                    x=input.nextInt();
                    arr[i]=x;
                    for(int j=0;j<=i;j++)
                    {
                        for(int k=0;k<=i;k++)
                        {
                            if((arr[j]==arr[k])&&(j!=k))
                            {
                                System.out.print("\nDuplicate element exist\nEnter another element...");
                                x=input.nextInt();
                                arr[i]=x;
                            }
                        }
                    }
                    System.out.print("\nGiven no:"+arr[i]);
                    i++;
            }
        }
    }
   public void dispArray()
   {
       System.out.print("\nThe given array:");
       for(i=0;i<arr.length;i++)
       {
           System.out.print(arr[i]+"\t");
       }
   }
}
