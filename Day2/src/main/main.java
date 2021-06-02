package main;
import java.util.*;

public class main {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
//Day 2 - Assignment
//------------------------------------------------------
	printBorder();
	println("1.  Generate Multiplication Table using for loop");
	print("Insert a number: ");
	int num = input.nextInt();
	for (int i=1; i<11; i++) {
		println(num + " x " + i + " = " + (num*i) );
	}
	
	printBorder();
	println("2.  Display Fibonacci Series Using for Loop");
	print("Insert a stop point: ");
	int num2 = input.nextInt();
	int fibonaci1 = 0;
	int fibonaci2 = 0;
	print("["+ fibonaci1 + "");
	for (int i = 0; i< num2; i++) {
		if(i == 0) {
			fibonaci2++;
			print(", "+fibonaci2);
		}
		else {			
			int temp= fibonaci1+ fibonaci2;
			print(", "+ temp );
			fibonaci1 = fibonaci2;
			fibonaci2 = temp;
		}
	}
	println("]");
	
//3. Display lowercase alphabet using for loop HINT -  for(c = 'a'; c <= 'z'; ++c)
//4. Reverse a Number using a while loop in Java HINT - Find the reminser of no by dividing 10  using % operator.
//5. Calculate the power of a number using a for loop.
//6. Program to Calculate Average Using Arrays
//7. Add Two Matrix Using Multi-dimensional Arrays
//8. Program to count vowels, consonants, digits, and spaces
//9.  Program to print half pyramid using *
//10. Count number of words
//11. Find the occurance of a specific character in sentence
//12. Remove all the space from string 
//13.Use the interface as a parameter and write a calculator to complete addition, subtraction, multiplication and division operations. 
// (1) Define an interface Compute with a method int computer(int n, int m). 
// (2) Design four classes to implement this interface respectively to complete addition, subtraction, multiplication and division operations. 
// (3) Design a class UseCompute, which contains methods: public void useCom(Compute com, int one, int two),
//	 This method can use the passed object to call the computer method to complete the operation and output the result of the operation. 
// (4) Design a main class Test, call the method useCom in UseCompute to complete addition, subtraction, multiplication and division operations. 
//14. Write Java programs as follows: 
// (1) Define interface A, which contains the constant PI with a value of 3.14 and the abstract method double area(). 
// (2) Define interface B, which contains the abstract method void setColor(String c). 
// (3) Define interface C, which inherits interfaces A and B, and contains the abstract method void volume(). 
// (4) Define the cylinder class Cylinder to implement interface C. This class contains three member variables: radius, radius, 
// The height and color of the cylinder. 
//15. Write a program to find the first and the last occurence of the letter 'o' and character ',' in "Hello, World".
//16.Input a string of alphabets. Find out the number of occurrence of all alphabets in that string. Find out the alphabet with maximum occurrence.
//17. Write a program to check if a given string is a Palindrome.
	input.close();
	}
	
	
	
//////
	
	public static void println(String a ) {
		System.out.println(a);
	}
	public static void print(String i ) {
		System.out.print(i);
	}
	public static void printBorder() {
		System.out.println("***************************************************************************");
	}
}
