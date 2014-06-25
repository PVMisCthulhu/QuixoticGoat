QuixoticGoat
============
First, you'll want to install the latest version of the [JDK][JDK], which will allow you to compile Java applications. The NetBeans IDE can be installed along with the JDK, but there are other IDE options.

Compiling a single .java file into a .class file on the command line. You will have to add the JDK bin directory to your PATH if it's not already there.

```$ javac HelloWorld.java```

> Fun fact: If your .java file is named hello_world.java, but contains a class called HelloWorld, the output file will be HelloWorld.class, not hello_world.class

Running the compiled .class file is simple

```$ java HelloWorld```

Compiling multiple classes into one program is not much different. Assume you have a class called Bicycle.java and a class which contains your main method called BicycleDemo.java. It is not necessary to compile one and then the other. If you call javac on BicycleDemo.java it will compile Bicycle.java automatically.

```bash
$ ls
Bicycle.java   BicycleDemo.java

$ javac BicycleDemo.java

$ ls
Bicycle.class   Bicycle.java   BicycleDemo.class    BicycleDemo.java

$ java BicycleDemo
```

If you want to develop android apps, go get the [Android SDK with Eclipse][Android SDK with Eclipse]! If you want to be able to access an MSSQL database, you will need the [Microsoft JDBC Driver 4.0][Microsoft JDBC Driver 4.0].

[JDK]: http://www.oracle.com/technetwork/java/javase/downloads/index.html
[Android SDK with Eclipse]: https://developer.android.com/training/basics/firstapp/index.html?hl=p
[Microsoft JDBC Driver 4.0]: http://msdn.microsoft.com/en-us/sqlserver/aa937724.aspx