package InterfaceExercise;

public class PoliceCar implements IsEmergency_Interface, IsLandVehicle_Interface
{
	public String name;
	public int maxPassengers;
	public double maxSpeed;
	public int numWheels;
	public int numAmmo;
	
	PoliceCar(String name, int maxPassengers, double maxSpeed, int numWheels, int numAmmo)
	{
		this.name = name;
		this.maxPassengers = maxPassengers;
		this.maxSpeed = maxSpeed;
		this.numWheels = numWheels;
		this.numAmmo = numAmmo;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setMaxPassengers(int maxPassengers)
	{
		this.maxPassengers = maxPassengers;
	}
	
	public int getMaxPassengers()
	{
		return maxPassengers;
	}
	
	public void setMaxSpeed(double maxSpeed)
	{
		this.maxSpeed = maxSpeed;
	}
	
	public double getMaxSpeed()
	{
		return maxSpeed;
	}
	
	public void setNumWheels(int numWheels)
	{
		this.numWheels = numWheels;
	}
	
	public int getNumWheels()
	{
		return numWheels;
	}
	
	public void setNumAmmo(int numAmmo)
	{
		this.numAmmo = numAmmo;
	}
	
	public int getNumAmmo()
	{
		return numAmmo;
	}
	
	public void drive()
	{
		System.out.println("Car is moving");
	}
	
	public void soundSiren()
	{
		System.out.println("Siren is turned on");
	}
	
	public void Shoot()
	{
		if(numAmmo>0)
		{
			numAmmo = numAmmo - 1;
			System.out.println("Shoot -----");
			System.out.println("Ammo left: " + numAmmo);
		}
		else
		{
			System.out.println("No Bullets Left");
		}
	}

	public String toString()
	{
		return "A police car, " +getName()+ ", has " +getNumWheels()+ ", has maximum speed of " +getMaxSpeed()+" km/h, " +getMaxPassengers()+ " maximum passengers, and " +getNumAmmo()+ " ammos";
	}
}
