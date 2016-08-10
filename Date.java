package date;
public class Date 
{
    int month,date,year;
    public Date()
    {
        month=date=year=0;
    }
    public void setDate(int x)
    {
        date=x;
    }
    public void setMonth(int x)
    {
        month=x;
    }
    public void setYear(int x)
    {
        year=x;
    }
    public int getDate()
    {
        return date;
    }
    public int getMonth()
    {
        return month;
    }
    public int getYear()
    {
        return year;
    }
    public void displayDate()
    {
        System.out.print("\nDATE:"+getDate()+"/"+getMonth()+"/"+getYear());
    }
}
