package InterfaceExercise;

public class Driver 
{
	public static void main(String[]args)
	{
		PoliceCar fortuner_QH = new PoliceCar("Fortuner QH", 9, 190, 4, 10);
//		System.out.print(fortuner_QH.drive());
		System.out.println(fortuner_QH.toString());
		fortuner_QH.drive();
		fortuner_QH.soundSiren();
		for(int i = 0; i<3; i++)
		{
			fortuner_QH.Shoot();
		}
	}
	
}
