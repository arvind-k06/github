package salespeople;
public class SalesTest
{
    public static void main(String[] args) 
    {
        SalesPeople s=new SalesPeople();
        s.setGross();
        s.sortFill();
        s.findCount();
        s.displayCount();
    }
    
}
