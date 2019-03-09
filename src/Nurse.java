import java.util.Date;

public class Nurse {
	
	// private class members
	private int nurseID;
	private int patientID;
	private int doctorID;
	private int weight;
	private int roomID;
	private String symptom;
	private String bloodPressure;
	private Date visit;
	private double bodyTemperature;
	private boolean available;
	
	// default constructor
	public Nurse()
	{
		available = true;
	}

	public int getNurseID()
	{
		return nurseID;
	}

	public void setNurseID(int nurse)
	{
		this.nurseID = nurse;
	}

	public int getPatientID()
	{
		return patientID;
	}

	public void setPatientID(int patient)
	{
		this.patientID = patient;
	}
	
	public int getDoctorID()
	{
		return doctorID;
	}
	// setter and getters
	public double getBodyTemperature()
	{
		return bodyTemperature;
	}
	
	public boolean getAvailable()
	{
		return available;
	}
	
	public void setAvailable(boolean available)
	{
		this.available = available;
	}
	
	public void setBodyTemperature(double bodyTemperature)
	{
		this.bodyTemperature = bodyTemperature;
	}
	
	public Date getVisit()
	{
		return visit;
	}
	
	public void setVisit(Date visit)
	{
		this.visit = visit;
	}
	
	public String getBloodPressure()
	{
		return bloodPressure;
	}
	
	public void setBloodPressure(String bloodPressure)
	{
		this.bloodPressure = bloodPressure;
	}
	
	public String getSymptom()
	{
		return symptom;
	}
	
	public void setSymptom(String symptom)
	{
		this.symptom = symptom;
	}
	
	// setter and getters
	public int getWeight()
	{
		return weight;
	}
	
	public void setWeight(int weight)
	{
		this.weight = weight;
	}
	
	public int getRoomID() 
	{
		return roomID;
	}
	
	public void setRoomID(int roomID)
	{
		this.roomID = roomID;
	}
}
