public class Patient
{
    private String symptom;
    private String insurance;
    private int weight;
    private int severity;

    public Patient()
    {

    }

    public String getSymptom()
    {
        return symptom;
    }

    public void setSymptom(String s)
    {
        symptom = s;
    }

    public String getInsurance()
    {
        return insurance;
    }

    public void setInsurance(String s)
    {
        insurance = s;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int w)
    {
        weight = w;
    }

    public int getSeverity()
    {
        return severity;
    }

    public void setSeverity(int w)
    {
        severity = w;
    }
}