package employees;
import java.util.*;
public class Employees 
{
        String firstname,lastname;
        double sal;
        public Employees()
        {
            firstname=null;
            lastname=null;
            sal=0;
        }
        public void setFirstname(String a)
        {
            firstname=a;
        }   
        public void setLastname(String b)
        {
            lastname=b;
        }
        public void setSalary(double c)
        {
            this.sal=c;
        }
        public String getFirstname()
        {
            return firstname;
        }
        public String getLastname()
        {
            return lastname;
        }
        public double calAnnualSal()
        {
            double d=this.sal*12;
            return d;
        }
        public void tenRaise()
        {
            this.sal+=this.sal*0.1;
        }
}
