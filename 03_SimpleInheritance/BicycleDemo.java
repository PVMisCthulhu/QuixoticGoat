class BicycleDemo
{
	public static void main(String[] args)
	{
		Bicycle bike1 = new Bicycle();
		Bicycle bike2 = new Bicycle();
		GrombleCycle g = new GrombleCycle();

		bike1.changeCadence(50);
		bike1.speedUp(10);
		bike1.changeGear(2);
		bike1.printStates();

		bike2.changeCadence(50);
		bike2.speedUp(10);
		bike2.changeGear(2);
		bike2.changeCadence(40);
		bike2.speedUp(10);
		bike2.changeGear(3);
		bike2.printStates();

		g.changeCadence(20);
		g.speedUp(50);
		g.changeGear(11);
		g.printStates();
		g.gromble();
	}
}