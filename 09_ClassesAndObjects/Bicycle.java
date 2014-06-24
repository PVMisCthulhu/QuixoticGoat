public class Bicycle
{
	private static int numberOfBikes = 0;
	private int bikeId;
	private int cadence;
	private int gear;
	private int speed;
	private int someValue;
	private BikeUtility bu = new BikeUtility();

	// Constructor, works pretty much like other languages
	public Bicycle(int startCadence, int startSpeed, int startGear)
	{
		gear = startGear;
		speed = startSpeed;
		cadence = startCadence;		
		bikeId = ++numberOfBikes;
	}

	// Multiple constructors are allowed
	// Note if there are no constructors, you automatically get an empty default constructor
	//   Well, technically it calls the parent's no-args constructor, which in the case of
	//   a class such as this one is "Object" which does have a no-args constrcutor...
	//   But if you're inheriting from a class without a no-args constructor, then you will 
	//   have problems if you don't provide your own constructor
	public Bicycle()
	{
		// using "this" just to demonstrate it works
		this.gear = 1;
		this.speed = 2;
		this.cadence = 3;				
		bikeId = ++numberOfBikes;
	}

	// You can use "this" to reference another constructor
	public Bicycle(int startCadence)
	{
		this(startCadence, 14, 21);
	}

	// Apparently this is a thing you can do...
	static
	{
		System.out.println("This doesn't even make sense");
	}

	// And again!
	static
	{
		System.out.println("Why would I ever want to do this?");
	}
	// I've managed without needing an arbitrary block to initialize things
	// all this time... I really can't fathom what this is for
	// Anyway, these are roughly equivalent to a private static method

	// This is an initializer block
	// Once again, this is a thing you can do
	// Apparently it gets copied into every constructor behind the scenes
	{
		someValue = 91;
	}

	public int getCadence() { return cadence; }
	public void setCadence(int newValue) { cadence = newValue; }
	public int getGear() { return gear; }
	public void setGear(int newValue) { gear = newValue; }
	public int getSpeed() { return speed; }
	public void applyBrake(int decrement) { speed -= decrement; }
	public void speedUp(int increment) { speed += increment; }	
	public int getId() { return bikeId; }

	// Overloading, works like you'd expect
	public int SquareNum(int num) { return num * num; }
	public long SquareNum(long num) { return num * num; }
	public float SquareNum(float num) { return num * num; }
	public double SquareNum(double num) { return num * num; }

	// Arbitrary number of arguments!
	// Java calls it "varargs" and apparently it's just hiding passing an array
	// of course it must be the last parameter in the signature
	public void PrintNumbers(int... nums)
	{
		if (nums.length > 0)
			for (int i = 0; i < nums.length; i++)
				System.out.println(nums[i]);
	}

	public void ShowValues()
	{		
		System.out.println("Cadence: " + cadence + ", Gear: " + gear + ", Speed: " + speed + ", someValue: " + someValue);
		bu.doUtility();
	}

	public static int GetNumberOfBicycles()
	{
		return numberOfBikes;
	}

	// Nested class!
	public class BikeUtility
	{
		public void doUtility()
		{
			System.out.println("BikeUtility!");
		}
	}
}