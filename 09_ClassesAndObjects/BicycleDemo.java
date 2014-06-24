class BicycleDemo
{
	public static void main(String[] args)
	{
		Bicycle b = new Bicycle();
		// Using a nested class from outside the class
		Bicycle.BikeUtility bu = b.new BikeUtility();
		bu.doUtility();
		b.PrintNumbers(7, 1, 6, 2, 5, 3, 4);
		b.ShowValues();
		ByValByRef(b);
		b.ShowValues();
	}

	public static void ByValByRef(Bicycle b)
	{
		// properties of an object will remain changed as if passing by ref
		b.setGear(99);
		b.speedUp(99);

		// ...but not the reference itself, which is by value
		b = new Bicycle(10, 11, 12);
		// So what happens to the Bicycle we created here? We'll say a monster ate it
	}
}