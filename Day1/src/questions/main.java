package questions;
import tools.*;
import java.util.*;

public class main{
//	Day 1 - Assignment:
	public static void main (String[] agrs) {
		//		-----------------------------------------------------
		Scanner input = new Scanner (System.in);

		//		1. WAP to accept a isbn,name, author,price, no of copies printed from user and print them using method?
//		print("isbn: ");
//		String isbn = input.next();
//		print("name: ");
//		String name = input.next();
//		print("author: ");
//		String author = input.next();
//		print("price: ");
//		double price = input.nextDouble();
//		println("Here is your new book: ");
//		println("isbn: "+ isbn);
//		println("author: "+ author);
//		println("price: $" + price);
		
//		2. Compute Quotient and Remainder for provided number
//		
//		printBorder();
//		
//		print("Insert the 1st number: ");
//		int first = input.nextInt();
//		print("Insert the 2nd number: ");
//		int second = input.nextInt();
//		println("If the first number is divided by the 2nd number, here is the result: ");
//		print("Quotient: " + (first/second) + " | Remainder: " + (first%second));
//		
//		3. Swap two numbers using temporary variable
	
//		printBorder();
//		
//		Object[] arr1 = { "Hello", 1 , 10.5, 1/3, "World"};
//		printArray(arr1);
//		Object temp = arr1[1];
//		arr1[1]= arr1[4];
//		arr1[4] = temp;
//		printArray(arr1);
		
//		4.  Swap two numbers without using temporary variable
		
//		printBorder();
//		ArrayList<Object> arr2 = new ArrayList<Object>();
//		arr2.add("Hello");
//		arr2.add(1);
//		arr2.add(0.98965);
//		arr2.add(9/6);
//		arr2.add("World");
//		printArrayList(arr2);
//		Collections.swap(arr2, 1, 4);
//		printArrayList(arr2);
		
//		5. Check whether an alphabet is vowel or consonant using if..else statement
		
//		printBorder();
//		print("type a character: ");
//		char x = input.next().toLowerCase().charAt(0);
//		if (x=='a' || x=='o' || x=='u' || x=='e' || x=='i' ) {
//			println(x + " is a vowel");
//		}
//		else {
//			println(x + " is not a vowwl");
//		}
		
		
//		6. Check whether an alphabet is vowel or consonant using switch statement
		
//		printBorder();
//		print("type a character: ");
//		char y = input.next().toLowerCase().charAt(0);
//		switch (y) {
//			case 'a' : {
//				println(y + " is a vowel");
//				break;
//			}
//			case 'u': {
//				println(y + " is a vowel");
//				break;
//			}
//			case 'o': {
//				println(y + " is a vowel");
//				break;
//			}
//			case 'i': {
//				println(y + " is a vowel");
//				break;
//			}
//			case 'e': {
//				println(y + " is a vowel");
//				break;
//			}
//			default: {
//				println(y + " is not a vowwl");
//			}
//			
//		}
//		7. Java Program to Check a Leap Year
//		printBorder();
//		print("Insert a year: ");
//		int year = input.nextInt();
//		
//		if (year%4==0)
//			println(year + " is a Leap Year");
//		else
//			println(year + " is not a leap year");
		
//		8. Check if a Number is Positive or Negative using if else
		
//		printBorder();
//		print("Insert a number: ");
//		int num = input.nextInt();
//		
//		if (num < 0)
//			println(num + " is a negative number"); 
//		else
//			println(num + " is a positive number");
		
//		9. Prime Numbers Between Two Integers
		printBorder();
		print("Insert the first number: ");
		int num1 = input.nextInt();
		print("Insert the second number: ");
		int num2 = input.nextInt();
		
		if (num1 < num2) {
			print("Here is the prime numbers between " + num1 +" and " + num2 + ": [");
			for (int i = num1+1 ; i<num2; i++) {
				if( isPrime(i) ) {
					print(i+", ");
				}
			}
			println("]");
		}
		else if ( num2<num1 ){
			print("Here is the prime numbers between " + num2 +" and " + num1 + ": [");
			for (int i = num2+1 ; i<num1; i++) {
				if( isPrime(i) ) {
					print(i+", ");
				}
			}
			println("]");
		}
		else {
			println(" there is no number between");
		}
		
//		10.  Program to calculate power using recursion
		printBorder();
		print("Insert a number: ");
		int num3 = input.nextInt();
		print("Insert power: ");
		int num4 = input.nextInt();
		println(num3+ " power " + num4 + " is: " + power(num3,num4,null));
		
//		11. Program to count vowels, consonants, digits, and spaces
		printBorder();
		println("Please type a message: ");
		input.nextLine();
		String text = input.nextLine();
		int vowels = 0;
		int consonants = 0;
		int digits = 0;
		int spaces =0;
		
		
		for(int i = 0; i<text.length() ; i++) {
			char x =text.charAt(i);
			if (x == 'a' || x=='o' || x=='e' || x=='u' || x=='i') {
				vowels++;
			}
			else if (x >= '0' && x <= '9') {
				digits++;
			}
			else if(x == ' ') {
				spaces++;
			}
			else {
				consonants++;
			}
		}
		
		println("vowels: " + vowels);
		println("consonants: " + consonants);
		println("digits: " + digits);
		println("spaces: " + spaces);
		
		
//		12. Write a constructor in the Car class given below that initializes the brand class field with the string “Ford”.
		printBorder();
		Car test = new Car("Ford");  
		
		input.close();
	}
	
	public static void printArray( Object[] arr ) {
		print("[ ");
		for( int i= 0; i< arr.length; i++) {
			print(arr[i] + ", ");
		}
		println(" ]");
	}
	
	public static void printArrayList ( ArrayList<Object> arr) {
		print("[ ");
		for( int i= 0; i< arr.size(); i++) {
			print(arr.get(i) + ", ");
		}
		println(" ]");
	}
	
	public static boolean isPrime (int num) {
		if (num == 1 || num == -1) {
			return true;
		}
		else if( num == 2 || num == 3 || num == 5 || num == 7 || num == 11 || num == -2 || num == -3 || num == -5 || num == -7 || num == -11) {
			return true;
		}
		else if( num%2 == 0 || num%3 == 0 || num%5 == 0 || num%7== 0 || num%11== 0) {
			return false;
		}
		else if( (num-1)%6 ==0 || (num+1)%6 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static long power(long input, long pw, Integer a) {
		if(a==null) {
			a=1;
		}
		if (a==pw) {
			return input;
		}
		else {
			input=input*input;
			return power(input,pw,a+1);
		}
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
