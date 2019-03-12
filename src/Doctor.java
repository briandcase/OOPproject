public class Doctor extends MedicalTeam
{
    private String diagnoses;
    private String specialty;
    private boolean isAvailable;


    public Doctor()
    {
        isAvailable = true;
        specialty = "GP";
    }

    public void setDiagnoses(String d)
    {
        diagnoses = d;
    }

    public String getDiagnoses()
    {
        return diagnoses;
    }

    public void setSpecialty(String s)
    {
        specialty = s;
    }

    public String getSpecialty()
    {
        return specialty;
    }

    public boolean setIsAvailable()
    {

    }
}