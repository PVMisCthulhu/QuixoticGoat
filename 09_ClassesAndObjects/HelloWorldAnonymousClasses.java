public class HelloWorldAnonymousClasses
{
	interface HelloWorld
	{
		public void greet();
		public void greetSomeone(String someone);
	}

	public void sayHello()
	{
		// Yep, another class declared in a method!
		class EnglishGreeting implements HelloWorld
		{
			String name = "world";

			public void greet()
			{
				greetSomeone("world");
			}

			public void greetSomeone(String someone)
			{
				name = someone;
				System.out.println("Hello " + name);
			}
		}

		HelloWorld englishGreeting = new EnglishGreeting();

		// We can go deeper O.O
		HelloWorld frenchGreeting = new HelloWorld()
		{
			String name = "tout le monde";

			public void greet()
			{
				greetSomeone("tout le monde");				
			}

			public void greetSomeone(String someone)
			{
				name = someone;
				System.out.println("Salut " + name);
			}
		};

		// This train is off the rails
		HelloWorld spanishGreeting = new HelloWorld()
		{
			String name = "mundo";

			public void greet()
			{
				greetSomeone("mundo");
			}

			public void greetSomeone(String someone)
			{
				name = someone;
				System.out.println("Hola, " + name);
			}
		};

		englishGreeting.greet();
		frenchGreeting.greetSomeone("Fred");
		spanishGreeting.greet();
	}

	public static void main(String... args)
	{
		// The class is instantiating itself
		// Divide by 0 error
		// world explodes
		HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
		myApp.sayHello();
	}
}