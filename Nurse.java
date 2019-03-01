package default;

public class Nurse {
	
	// private class members
	private int nurseID;
	private int patientID;
	private int doctorID;
	private int weight;
	private int roomID;
	private String symptom;
	private String bloodPressure;
	private date visit;
	private double bodyTemperature;
	private boolean available;
	
	// default constructor
	public Nurse()
	{
		available = true;
		date = today;
	}
	
	// setter and getters
	public void getBodyTemperature()
	{
		return bodyTemperature;
	}
	
	public void getAvailable()
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
	
	public void getVisit()
	{
		return visit;
	}
	
	public void setVisit(int visit)
	{
		this.visit = visit;
	}
	
	public void getBloodPressure()
	{
		return bloodPressure;
	}
	
	public void setBloodPressure(int bloodPressure)
	{
		this.bloodPressure = bloodPressure;
	}
	
	public void getSymptom()
	{
		return symptom;
	}
	
	public void setSymptom(int symptom)
	{
		this.symptom = symptom;
	}
	
	// setter and getters
	public void getWeight()
	{
		return weight;
	}
	
	public void setWeight(int weight)
	{
		this.weight = weight;
	}
	
	public void getRoomID() 
	{
		return roomID;
	}
	
	public void setRoomID(int roomID)
	{
		this.roomID = roomID;
	}
}
