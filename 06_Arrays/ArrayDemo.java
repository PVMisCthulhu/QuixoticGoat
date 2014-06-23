class ArrayDemo 
{
	public static void main(String[] args)
	{
		int[] anArray = new int[10];

		for (int i = 0; i < 10; i++)
			anArray[i] = (i + 1) * 100;

		for (int i = 0; i < 10; i++)
			System.out.println("Element at index " + i + ": " + anArray[i]);

		// array initialization
		int[] anotherArray = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };
		// We're not going to print it. We'll take the compilers word for it that it works

		// multidimensional array, for the masochists
		String[][] mulDimArray = { { "Mr.", "Mrs.", "Ms."}, {"Smith", "Jones"} };
		System.out.println(mulDimArray[0][0] + mulDimArray[1][0]);
		System.out.println(mulDimArray[0][2] + mulDimArray[1][1]);
	}
}