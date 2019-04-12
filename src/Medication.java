public class Medication
{
    private String name;
    private double price;

    public Medication()
    {
        init();
    }

    private void init()
    {

    }

    public Medication(String n, double p)
    {
        this.name = n;
        this.price = p;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setName(String n)
    {
        this.name = n;
    }

    public void setPrice(double p)
    {
        this.price = p;
    }
}