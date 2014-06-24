public class ShadowTest
{
	// Our regular class member...
	public int x = 0;

	// Random note: Serialization of inner classes is discouraged
	// Long story short: it may not work consistently across JRE implementations
	class FirstLevel 
	{
		// Now a new x is shadowing ShadowTest.this.x
		public int x = 1;

		// Now yet another x is shadowing this.x
		void methodInFirstLevel(int x)
		{
			System.out.println("x = " + x);
			System.out.println("this.x = " + this.x);
			System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
		}
	}

	public static void main(String... args)
	{
		ShadowTest st = new ShadowTest();
		ShadowTest.FirstLevel fl = st.new FirstLevel();
		fl.methodInFirstLevel(23);
	}
}