public class Insurance
{
    private String provider;
    private int copay;
    private int limit;
    private boolean medicineCovered;
    private int medicineCostPerUnit;

    public Insurance()
    {
        init();
    }

    private void init()
    {
        
    }

    public String getProvider()
    {
        return provider;
    }

    public void setProvider(String p)
    {
        this.provider = p;
    }

    public int getCopay()
    {
        return copay;
    }

    public void setCopay(int c)
    {
        this.copay = c;
    }

    public int getLimit()
    {
        return limit;
    }

    public void setLimit(int l)
    {
        this.copay = l;
    }

    public boolean getMedicineCovered()
    {
        return medicineCovered;
    }

    public void setMedicineCovered(boolean m)
    {
        this.medicineCovered = m;
    }

    public int getMedicineCostPerUnit()
    {
        return medicineCostPerUnit;
    }

    public void setMedicineCostPerUnit(int m)
    {
        this.medicineCostPerUnit = m;
    }
}