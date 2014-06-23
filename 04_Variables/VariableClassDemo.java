class VariableClassDemo
{
	public static void main(String[] args)
	{
		VariableClass vc1 = new VariableClass();
		VariableClass vc2 = new VariableClass();

		vc1.printValues();
		vc2.printValues();

		System.out.println("incrementing...");

		vc1.incrementInstance();
		vc1.incrementClass();
		vc2.incrementInstance();
		vc2.incrementClass();

		vc1.printValues();
		vc2.printValues();
	}
}