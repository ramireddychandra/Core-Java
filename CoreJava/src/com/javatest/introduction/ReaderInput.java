package com.javatest.introduction;

import java.util.*;
// This package is present from Version-5
//

public class ReaderInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.in associated with keyboard

		int a, b, c;
		System.out.println("Enter your name : ");
//		next line will read the sentence
		String name = sc.nextLine();

//			next line will read the sentence
		System.out.println("Enter your Fullname : ");
		String fullName = sc.next();

		System.out.println("Enter 2 numbers : ");

		a = sc.nextInt();
		b = sc.nextInt();
		c = a + b;

		System.out.println(name + " : " + "Sum of A+B : " + c);
		System.out.println(fullName);

	}

}

//https://learn.microsoft.com/en-us/dotnet/api/java.util.scanner?view=net-android-34.0

//Clone()	
//Creates and returns a copy of this object.
//
//(Inherited from Object)
//Close()	
//Closes this scanner.
//
//Delimiter()	
//Returns the Pattern this Scanner is currently using to match delimiters.
//
//Dispose()	(Inherited from Object)
//Dispose(Boolean)	(Inherited from Object)
//Equals(Object)	
//Indicates whether some other object is "equal to" this one.
//
//(Inherited from Object)
//FindInLine(Pattern)	
//Attempts to find the next occurrence of the specified pattern ignoring delimiters.
//
//FindInLine(String)	
//Attempts to find the next occurrence of a pattern constructed from the specified string, ignoring delimiters.
//
//FindWithinHorizon(Pattern, Int32)	
//Attempts to find the next occurrence of the specified pattern.
//
//FindWithinHorizon(String, Int32)	
//Attempts to find the next occurrence of a pattern constructed from the specified string, ignoring delimiters.
//
//GetHashCode()	
//Returns a hash code value for the object.
//
//(Inherited from Object)
//InvokeHasNext(Pattern)	
//Returns true if the next complete token matches the specified pattern.
//
//InvokeHasNext(String)	
//Returns true if the next token matches the pattern constructed from the specified string.
//
//InvokeHasNextBigInteger(Int32)	
//Returns true if the next token in this scanner's input can be interpreted as a BigInteger in the specified radix using the #nextBigInteger method.
//
//InvokeHasNextByte(Int32)	
//Returns true if the next token in this scanner's input can be interpreted as a byte value in the specified radix using the #nextByte method.
//
//InvokeHasNextInt(Int32)	
//Returns true if the next token in this scanner's input can be interpreted as an int value in the specified radix using the #nextInt method.
//
//InvokeHasNextLong(Int32)	
//Returns true if the next token in this scanner's input can be interpreted as a long value in the specified radix using the #nextLong method.
//
//InvokeHasNextShort(Int32)	
//Returns true if the next token in this scanner's input can be interpreted as a short value in the specified radix using the #nextShort method.
//
//IoException()	
//Returns the IOException last thrown by this Scanner's underlying Readable.
//
//JavaFinalize()	
//Called by the garbage collector on an object when garbage collection determines that there are no more references to the object.
//
//(Inherited from Object)
//Locale()	
//Returns this scanner's locale.
//
//Match()	
//Returns the match result of the last scanning operation performed by this scanner.
//
//Next()	
//Finds and returns the next complete token from this scanner.
//
//Next(Pattern)	
//Returns the next token if it matches the specified pattern.
//
//Next(String)	
//Returns the next token if it matches the pattern constructed from the specified string.
//
//NextBigDecimal()	
//Scans the next token of the input as a java.math.BigDecimal BigDecimal.
//
//NextBigInteger()	
//Scans the next token of the input as a java.math.BigInteger BigInteger.
//
//NextBigInteger(Int32)	
//Scans the next token of the input as a java.math.BigInteger BigInteger.
//
//NextBoolean()	
//Scans the next token of the input into a boolean value and returns that value.
//
//NextByte()	
//Scans the next token of the input as a byte.
//
//NextByte(Int32)	
//Scans the next token of the input as a byte.
//
//NextDouble()	
//Scans the next token of the input as a double.
//
//NextFloat()	
//Scans the next token of the input as a float.
//
//NextInt()	
//Scans the next token of the input as an int.
//
//NextInt(Int32)	
//Scans the next token of the input as an int.
//
//NextLine()	
//Advances this scanner past the current line and returns the input that was skipped.
//
//NextLong()	
//Scans the next token of the input as a long.
//
//NextLong(Int32)	
//Scans the next token of the input as a long.
//
//NextShort()	
//Scans the next token of the input as a short.
//
//NextShort(Int32)	
//Scans the next token of the input as a short.
//
//Notify()	
//Wakes up a single thread that is waiting on this object's monitor.
//
//(Inherited from Object)
//NotifyAll()	
//Wakes up all threads that are waiting on this object's monitor.
//
//(Inherited from Object)
//Radix()	
//Returns this scanner's default radix.
//
//Remove()	
//The remove operation is not supported by this implementation of Iterator.
//
//Reset()	
//Resets this scanner.
//
//SetHandle(IntPtr, JniHandleOwnership)	
//Sets the Handle property.
//
//(Inherited from Object)
//Skip(Pattern)	
//Skips input that matches the specified pattern, ignoring delimiters.
//
//Skip(String)	
//Skips input that matches a pattern constructed from the specified string.
//
//ToArray<T>()	(Inherited from Object)
//ToString()	
//Returns a string representation of the object.
//
//(Inherited from Object)
//UnregisterFromRuntime()	(Inherited from Object)
//UseDelimiter(Pattern)	
//Sets this scanner's delimiting pattern to the specified pattern.
//
//UseDelimiter(String)	
//Sets this scanner's delimiting pattern to a pattern constructed from the specified String.
//
//UseLocale(Locale)	
//Sets this scanner's locale to the specified locale.
//
//UseRadix(Int32)	
//Sets this scanner's default radix to the specified radix.
//
//Wait()	
//Causes the current thread to wait until it is awakened, typically by being <em>notified</em> or <em>interrupted</em>.
//
//(Inherited from Object)
//Wait(Int64)	
//Causes the current thread to wait until it is awakened, typically by being <em>notified</em> or <em>interrupted</em>, or until a certain amount of real time has elapsed.
//
//(Inherited from Object)
//Wait(Int64, Int32)	
//Causes the current thread to wait until it is awakened, typically by being <em>notified</em> or <em>interrupted</em>, or until a certain amount of real time has elapsed.
//
//(Inherited from Object)