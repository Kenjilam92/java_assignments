

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.Reader;
import java.util.*;


public class Main {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean isContinue = true;
		do {
			printBorder();
			println("which question do you want to test? (1-10)");
			int question = getInt(input);
			printBorder();
			switch (question) {
				case 1:{
					println("1. Write a Java program of swap two elements in an array list which holds the strings.");
					ArrayList<String> arr = createStringArrayList(input); 
					print("Your array: ");
					printArrayListString(arr);
					println("Which elements do you want to swap?");
					print("First Index: ");
					int start = input.nextInt();
					print("Second Index: ");
					int end = input.nextInt();
					Collections.swap(arr,start,end);
					print("Your array");
					printArrayListString(arr);
					break;
				}
				case 2:{
					println("2.  Write a program to clone an array list to another array list using clone() of arraylist.");
					ArrayList<String> arr = createStringArrayList(input); 
					print("Your array: ");
					printArrayListString(arr);
					ArrayList<Object> copy = (ArrayList<Object>) arr.clone(); 
					println("A new object arry list is created");
					print("Your copy Array");
					printArrayList(copy);
					
					break;
				}
				case 3:{
					println("3. Iterate a linked list in reverse order.");
					LinkedList<String> ll = createLinkedListString(input);
					println("print reverse linked list");
					printReverseLinkedListString(ll);
					break;
				}
				case 4:{
					println("4. Write a Java program to insert the specified element at the end of a linked list using offerLast().");
					LinkedList<String> ll = createLinkedListString(input);
					print("your linked list: ");
					printLinkedListString(ll);
					println("add a new element a the end of the list ");
					ll.offerLast(getString(input));
					print("your linked list: ");
					printLinkedListString(ll);
					break;
				}
				case 5:{
					println("5. Search an element in a array list");
					ArrayList<String> arr = createStringArrayList(input); 
					println("Type the content you want to find ");
					String content = getString(input);
					if ( arr.contains(content) ) {
						println("Array List contain \""+content+"\" at index:" + arr.indexOf(content));
					}	
					else {
						println("Array List does not contain this content");
					}
					
					break;
				}
				case 6:{
					println("6. Write a program to join two array lists");
					println("Create the first array");
					ArrayList<String> arr1 = createStringArrayList(input);
					println("Create the second array");
					ArrayList<String> arr2 = createStringArrayList(input);
					println("Joining two array!");
					ArrayList<String> arr3 = new ArrayList<String>();
					arr3.addAll(arr1);
					arr3.addAll(arr2);
					print("Result: ");
					printArrayListString(arr3);
					
					break;
				}
				case 7:{
					println("7. Write a program to compare the ranking of Player where Player class has ranking, name and age as attributes using comparabel interface.");
					println("Create a list of Player!");
					println("How many Player do you want to create?");
					int numOfPlayer = getInt(input);
					ArrayList<Player> pls = new ArrayList<Player>();
					for (int i =0 ; i< numOfPlayer; i++) {
						pls.add( new Player(input) ); 
					}
					println("Show list of players");
					print("[");
					for (int i=0; i < pls.size()-1; i++) {
						pls.get(i).showNames();
					}
					println(pls.get(pls.size()-1).name+"]");
					
					Collections.sort(pls);
				
					println("After sorting players by age");
					print("[");
					for (int i=0; i < pls.size()-1; i++) {
						pls.get(i).showNames();
					}
					println(pls.get(pls.size()-1).name+"]");
					break;
				}
				case 8:{
					println("8. Write a program to compare the Player based on age and ranking using Comparator interface.");
					println("Create a list of Player!");
					println("How many Player do you want to create?");
					int numOfPlayer = getInt(input);
					ArrayList<Player> pls = new ArrayList<Player>();
					for (int i =0 ; i< numOfPlayer; i++) {
						pls.add( new Player(input) ); 
					}
					println("Show list of players");
					print("[");
					for (int i=0; i < pls.size()-1; i++) {
						pls.get(i).showNames();
					}
					println(pls.get(pls.size()-1).name+"]");
					
					Collections.sort(pls,new PlayerRankComparator());
					println("After sorting players by rank");
					print("[");
					for (int i=0; i < pls.size()-1; i++) {
						pls.get(i).showNames();
					}
					println(pls.get(pls.size()-1).name+"]");
					
					break;
				}
				case 9:{
					println("9. Wrie a program to Open a text file so that you can read the file one line at a time.\r\n"
							+ "Read each line as a String and print the total number of characters.");
					boolean isValid = true;
					do {
						try {
							println("Insert file location");
							String location = getString(input);
							
							Reader reader = new FileReader(location);
							int data =reader.read();
							while( data!=-1 ) {
								System.out.print((char) data);
								data=reader.read();
							}
							isValid = true;
						}
						catch(Exception e) {
							println("Canot read file. Please try again");
							isValid= false;
						}
						
					}
					while(!isValid);
					break;
				}
				case 10:{
					println("10. Write a lambda expression to generate the square of a number.");
					int number = getInt(input);
					longReturn square = (x) -> {
						return x*x;
					};
					print("Result: ");
					println(square.calculation(number) + "");
					break;
				}
				
				default:{
					println("Invalid input");
				}
			
			}
			isContinue =doYouContinue(input);
		}
		while(isContinue);
		input.close();
		println("****************************End********************************************");
	}
	
	
	
	///////////////////////////////////////////////
	
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
	public static int getInt( Scanner input) {
		print("Insert a number: ");
		return input.nextInt();
	}
	
	public static boolean doYouContinue(Scanner input) {
		printBorder();
		println("Do you want to continue?");
		print("1. Yes | ");
		println("2. No");
		int choice = getInt(input);
		if (choice == 1) {
			return true;
		}
		else if (choice == 2) {
			return false;
		}
		else {
			println("Invalid Input! Please try again");
			return doYouContinue(input);
		}
	}
	
	public static ArrayList<String> createStringArrayList(Scanner input){
		ArrayList<String> result = new ArrayList<String>();
		println("How many elements do you want to initiate");
		
		int length = getInt(input);
		for (int i = 0; i < length ; i++) {
			result.add(getString(input));
		}
		return result;
	}
	
	public static void printArrayList (ArrayList<Object> arr) {
		print("[");
		for( int i = 0; i < arr.size()-1; i++) {
			print(arr.get(i)+ ", ");
		}
		println(arr.get(arr.size()-1)+"]");
	}
	public static void printArrayListString (ArrayList<String> arr) {
		print("[");
		for( int i = 0; i < arr.size()-1; i++) {
			print(arr.get(i)+ ", ");
		}
		println(arr.get(arr.size()-1)+"]");
	}
	
	public static LinkedList<String> createLinkedListString( Scanner input) {
		LinkedList<String> result = new LinkedList<String>();
		println("How many elements do you want to initiate");
		int length = getInt(input);
		for (int i = 0; i < length ; i++) {
			result.add(getString(input));
		}
		return result;
	}
	
	public static void printReverseLinkedListString (LinkedList<String> arr) {
		for( int i = arr.size()-1; i >= 0 ; i--) {
			print(arr.get(i)+ "=> ");
		}
		println("");
	}
	
	public static void printLinkedListString (LinkedList<String> arr) {
		for( int i = 0; i< arr.size() ;  i++) {
			print(arr.get(i)+ "=> ");
		}
		println("");
	}
	///////
	
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
