class ControlFlow
{
	public static void main(String[] args)
	{
		// All of this stuff is pretty much identical to C++ and C# but for 
		// the sake of completeness...

		// Anything uncommented is boring and you can ignore it.
		// Commented things may also be boring. But maybe not!

		int a = 1;

		if (a == 0)
		{
			a = 2;
		}
		else
			a = 3;

		int month = 8;
		String monthString;

		switch (month)
		{
			// Note: If you remove the "break" from all but case 12, results are the same

			case 1: monthString = "January"; break;
			case 2: monthString = "February"; break;
			case 3: monthString = "March"; break;
			case 4: monthString = "April"; break;
			case 5: monthString = "May"; break;
			case 6: monthString = "June"; break;
			case 7: monthString = "July"; break;
			case 8: monthString = "August"; break;
			case 9: monthString = "September"; break;
			case 10: monthString = "October"; break;
			case 11: monthString = "November"; break;
			case 12: monthString = "December"; break;
			default: monthString = "Funtober"; break;
		}		

		System.out.println(a);
		System.out.println(monthString);

		int count = 1;

		while (count < 11)
		{
			System.out.println("Count is: " + count);
			count++;
		}

		do
		{
			count--;
			System.out.println("Count is: " + count);
		} while (count > 0);

		for (int prawn = 1; prawn < 11; prawn++)
		{
			System.out.println("For count is: " + prawn);
		}

		// And just like C++ you can be a trickster with for
		for (;;) { break; }

		// Okay, here's something that is actually kind of interesting
		// I knew I didn't skip this section for a reason!
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};

		for (int item : numbers)
		{
			System.out.println("Count is: " + item);
		}
		// They call it an "enchanced for statement," but come on Java, you're not
		// fooling anyone. That's a foreach. Trying to pull a fast one here

		// This next thing is... weird, to say the least
		int[][] arrayOfInts = 
		{
			{32,87,3,589},
			{12,1076,2000,8},
			{622,127,77,955}
		};

		int searchfor = 12;
		int i = 0;
		int j = 0;
		boolean foundIt = false;

		// It looks like a "goto" label but apparently it's labeling the "for" block
		// (it could still work like a goto also, for all I know)
		search:
			for (i = 0; i < arrayOfInts.length; i++)
			{
				for (j = 0; j < arrayOfInts[i].length; j++)
				{
					if (arrayOfInts[i][j] == searchfor) 
					{
						foundIt = true;
						break search; // and this breaks from the outer loop, not inner
					}
				}
			}

		if (foundIt)
			System.out.println("Found " + searchfor + " at " + i + ", " + j);
		else
			System.out.println(searchfor + " not in the array");

		// FYI: "continue" works like it does in loops everywhere else, I'm not going to type it out
	}
}