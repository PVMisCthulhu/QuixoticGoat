public class LocalClassExample
{
	static String regularExpression = "[^0-9]";

	public static void validatePhoneNumber(String phoneNumber1, String phoneNumber2)
	{
		final int numberLength = 10;		

		// You can declare classes in methods...
		// The world has gone mad
		class PhoneNumber
		{
			String formattedPhoneNumber = null;

			PhoneNumber(String phoneNumber)
			{
				// If this line was not commented out and numberLength was not final,
				// the compiler would still generate an error. Although you can read
				// members from the outer class (called "capturing" for some reason)
				// they are considered "effectively final" (i.e. you didn't say it
				// is final but in this context it is.)

				//numberLength = 7;

				String currentNumber = phoneNumber.replaceAll(regularExpression, "");

				if (currentNumber.length() == numberLength)
					formattedPhoneNumber = currentNumber;
				else
					formattedPhoneNumber = null;
			}

			public String getNumber()
			{
				return formattedPhoneNumber;
			}

			public void printOriginalNumbers()
			{
				System.out.println("Original numbers are " + phoneNumber1 + " and " + phoneNumber2);
			}
		}

		PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
		PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

		myNumber1.printOriginalNumbers();

		if (myNumber1.getNumber() == null)
			System.out.println("First number is invalid");
		else
			System.out.println("First number is " + myNumber1.getNumber());

		if (myNumber2.getNumber() == null)
			System.out.println("Second number is invalid");
		else
			System.out.println("Second number is " + myNumber2.getNumber()) ;
	}

	public static void main(String... args)
	{
		validatePhoneNumber("123-456-7890", "456-7890");
	}
}