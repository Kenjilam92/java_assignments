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
	
	printBorder();
	println("3. Display lowercase alphabet using for loop HINT -  for(c = 'a'; c <= 'z'; ++c)");
	for( char x = 'a'; x<='z'; x++) {
		print(x+ ", ");
	}
	println("");
	
	printBorder();
	println("4. Reverse a Number using a while loop in Java HINT - Find the reminser of no by dividing 10  using % operator.");
	print("Insert a number: ");
	int num4 = input.nextInt();
	println("The remain of " + +num4+ " by dividing by 10 is: "+ (num4%10));
	
	printBorder();
	println("5. Calculate the power of a number using a for loop.");
	print("Please insert a numeber: ");
	int num5= input.nextInt();
	print("Please insert the power level: ");
	int power = input.nextInt();
	println("Result: "+ powerFor(num5,power) );
	
	printBorder();
	println("6. Program to Calculate Average Using Arrays");
	print("Insert array length: ");
	int arrLength = input.nextInt();
	print("Insert array values: ");
	Integer[] arr = new Integer[arrLength];
	for (int i= 0; i<arrLength; i++) {
		arr[i]= input.nextInt();
	}
	print("Here is your array: ");
	printArray(arr);
	println("Here is your average: "+ printArrayAverage(arr) );
	
	
//7. Add Two Matrix Using Multi-dimensional Arrays
	
//8. Program to count vowels, consonants, digits, and spaces
	printBorder();
	println("9.  Program to print half pyramid using *");
	print("How tall do your want your pyramid be?");
	int tall = input.nextInt();
	drawHalfPyramid(tall);
	
	printBorder();
	println("10. Count number of words");
	StringTokenizer para = getParagraphToken(input);
	println("Number of words: " + para.countTokens());
	
	printBorder();
	println("11. Find the occurance of a specific character in sentence");
	String sentence = getParagraph(input).toLowerCase();
	print("which charater you do you want to find?: ");
	char x = input.next().toLowerCase().charAt(0);
	int countChar = 0;
	for (char i : sentence.toCharArray()) {
		if (i==x) {
			countChar++;
		}
	}
	println("There are "+ countChar + " character "+ x);
	
	printBorder();
	println("12. Remove all the space from string");
	String str = getParagraph(input);
	println("After remove spaces: "+ str.replace(" ", "") );
	
	printBorder();
	println("13.Use the interface as a parameter and write a calculator to complete addition, subtraction, multiplication and division operations.");
	println(
			"(1) Define an interface Compute with a method int computer(int n, int m). \n" +
			"(2) Design four classes to implement this interface respectively to complete addition, subtraction, multiplication and division operations. \n" +
			"(3) Design a class UseCompute, which contains methods: public void useCom(Compute com, int one, int two), this method can use the passed object to call the computer method to complete the operation and output the result of the operation. \n" + 
			"(4) Design a main class Test, call the method useCom in UseCompute to complete addition, subtraction, multiplication and division operations. \n"
	);
	printBorder();
	println("14. Write Java programs as follows: ");
	println(
			"(1) Define interface A, which contains the constant PI with a value of 3.14 and the abstract method double area(). \n" +
			"(2) Define interface B, which contains the abstract method void setColor(String c). \n" +
			"(3) Define interface C, which inherits interfaces A and B, and contains the abstract method void volume(). \n" +
			"(4) Define the cylinder class Cylinder to implement interface C. This class contains three member variables: radius, radius, the height and color of the cylinder. "
	);
	printBorder();
	println("15. Write a program to find the first and the last occurence of the letter 'o' and character ',' in \"Hello, World\". ");
	printBorder();
	println("16.Input a string of alphabets. Find out the number of occurrence of all alphabets in that string. Find out the alphabet with maximum occurrence.");
	
	
	printBorder();
	println("17. Write a program to check if a given string is a Palindrome.");
	println(isPalindrome(getString(input))? "This is palindrome" : "This is not palindrome");
	
	input.close();
	}
	
	public static long powerFor (int input, int pw) {
		long temp = input;
		for(int i=1; i < pw; i++ ) {
			temp*=input; 
		}
		return temp;
	}
	
	public static void printArray (Object[] in) {
		print("[");
		for( int i =0; i<in.length-1; i++) {
			print(in[i]+", ");
		}
		println(in[in.length-1] + "]");
	}
	
	public static long printArrayAverage(Integer[] arr) {
		long sum = 0;
		for(int a :arr) {
			sum+=a;
		}
		return sum/arr.length;
	}
	
	public static void drawHalfPyramid(int tall) {
		for(int i = 1; i<tall+1; i++ ) {
			for( int j = 0; j<i ; j++) {
				print( ("*") );
			}
			println("");
		}
	}
	
	public static boolean isPalindrome(String str) {
		char[] arr = str.toCharArray();
		for(int i = 0; i <arr.length/2; i++) {
			if(arr[i] != arr[arr.length-1-i]) {
				return false;
			}
		}
		return true;
	}
	
	
	
//////
	public static String getString( Scanner input) {
		print("Please type a text: "); 
		return input.next();
	}
	
	public static StringTokenizer getParagraphToken( Scanner input) {
		print("Please type a paragraph: "); 
		input.nextLine();
		return new StringTokenizer(input.nextLine());
	}
	
	public static String getParagraph( Scanner input) {
		print("Please type a paragraph: "); 
		input.nextLine();
		return input.nextLine();
	}
	
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
