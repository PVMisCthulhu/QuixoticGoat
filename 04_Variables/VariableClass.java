class VariableClass
{
	// instance variable (non-static)
	int instanceVariable = 0;

	// class variable (static) one copy per entire class
	static int classVariable = 0;

	// constant class variable
	static final int constantVariable = 0;

	void someMethod(int someParameter) // Parameters
	{
		// ...and local
		int localVariable = 0;

		// throws an error if you uncomment
		// constantVariable = 5;
	}

	void printValues()
	{
		System.out.println("instance:" + instanceVariable + " class:" + classVariable + " constant:" + constantVariable);
	}

	void incrementInstance() { instanceVariable++; }
	void incrementClass() { classVariable++; }
}