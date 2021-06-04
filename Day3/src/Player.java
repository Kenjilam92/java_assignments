import java.util.*;

public class Player implements Comparable<Player> {
	public String name;
	public int age;
	public int rank;

	public Player(Scanner input) {
		System.out.println("Creating new Player");
		System.out.print("Name: ");
		name = input.next();
		System.out.print("Age: ");
		age = input.nextInt();
		System.out.print("Rank: ");
		rank = input.nextInt();
	};

	public int compareTo(Player a) {
		if (age == a.age) {
			return 0;
		} else if (age < a.age) {
			return -1;
		} else {
			return 1;
		}
	}
	
	public void showNames() {
		System.out.print(name+", ");
	}
	public void showName() {
		System.out.println(name);
	}
}
