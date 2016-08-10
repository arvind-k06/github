package employees;
import java.util.Scanner;
public class EmployeeTest 
{
    public static void main(String[] args)
    {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        Employees emp1=new Employees();
        Employees emp2=new Employees();
        System.out.print("\nEnter first name for employee1...");
        double z;String x;
        x=in.nextLine();
        emp1.setFirstname(x);
        System.out.print("\nEnter last name for employee1...");
        x=in.nextLine();
        emp1.setLastname(x);
        System.out.print("\nEnter salary of employee1...");
        z=in.nextDouble();
        if(z>0)
            emp1.setSalary(z);
        else
            System.out.println("\nSalary cannot be negative");
        System.out.print("\nEnter first name for employee2...");
        x=in.nextLine();
        x=in.nextLine();
        emp2.setFirstname(x);
        System.out.print("\nEnter last name for employee2...");
        x=in.nextLine();
        emp2.setLastname(x);
        System.out.print("\nEnter salary of employee2...");
        z=in.nextDouble();
        if(z>0)
            emp1.setSalary(z);
        else
            System.out.println("\nSalary cannot be negative");
        emp2.setSalary(z);
        System.out.print("\nThe first name of employee1..."+emp1.getFirstname());
        System.out.print("\nThe last name of employee1..."+emp1.getLastname());
        System.out.print("\nThe annual salary of employee1..."+emp1.calAnnualSal());
        System.out.print("\nThe first name of employee2..."+emp2.getFirstname());
        System.out.print("\nThe first name of employee2..."+emp2.getLastname());
        System.out.print("\nThe annual salary of employee2..."+emp2.calAnnualSal());
        emp1.tenRaise();
        emp2.tenRaise();
        System.out.print("\nThe annual salary of employee1 after giving 10% raise..."+emp1.calAnnualSal());
        System.out.print("\nThe annual salary of employee2 after giving 10% raise..."+emp2.calAnnualSal());
    }
}
