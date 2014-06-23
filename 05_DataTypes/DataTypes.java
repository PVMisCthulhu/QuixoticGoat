class DataTypes 
{
	public static void main(String[] args)
	{
		// Java fails at having a sizeof() method available, so
		// we'll just have to put the sizes in comments

		byte myByte = 0;         // 1 byte  (-128 to 127)
		short myShort = 0;       // 2 bytes (-32,768 to 32,767)
		int myInt = 0;           // 4 bytes (-2,147,483,648 to 2,147,483,647)
		long myLong = 0L;        // 8 bytes (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
		float myFloat = 0.0F;    // 4 bytes (single-precision)
		double myDouble = 0.0D;  // 8 bytes (double-precision)
		boolean myBool = false;  // 1-4 bytes depending on VM and usage
		char myChar = '\u0000';  // 2 bytes ('\u0000' to '\uffff')

		// each of the above variables is being initialized to their default value...
		// but don't use default values. That's bad. Also, local variables never get
		// defaulted and you'll get a compile-time error if you do it

		// Also, here's a fun thing you can do even though what psychopath would?
		int decimalInt = 26;
		int hexInt = 0x1a;
		int binaryInt = 0b11010;

		// Want to use scientific notation? No one is stopping you (although you should be stopped,
		// you monster.)
		double sciDouble = 1.234e2;

		// If your editor supports it, you can put Unicode characters directly into char and String.
		// Otherwise you have to do something like this...
		String siSenor = "S\u00ED Se\u00F1or";

		// Who decided to allow this? It's for readability, apparently...
		// Underscores for everybody!
		long creditCardNumber = 1234_5678_9012_3456L;
		float pi = 3.14_15F;
		// Because who ever was using a number and thought "Gee, this would be so much clearer
		// with underscores in it"

		System.out.println("This program does nothing. Look at the code");
	}
}