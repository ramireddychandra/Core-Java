package com.javatest.introduction;

// This is manditory, if we not import then JVM will call automatically
import java.lang.*;


public class Helloworld {
	
//	main() -> it should not return any thing
//	public() -- if you want to anything from the class to be accessable outside the class, then it must be public
//	When [java classname] in CMD --> JVM will call the main method so it should be public
//	We cannot use call unless we create an Object, when we want use anything from the class without creating Object then that should e declared as static [Just by using the class name]
	
	public static void main(String[] args)
	{
		System.out.println("Helloworld");
//		println is a method

	}

}

// Execution flow
// javac Helloworld.java --> Hellowworld.class file will generated [Error free file]
// calll JVM by java Helloworld