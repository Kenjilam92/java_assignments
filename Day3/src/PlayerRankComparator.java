import java.util.*;

public class PlayerRankComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Player p1 = (Player)o1;
		Player p2 = (Player)o2;
		if (p1.rank == p2.rank) {
			return 0;
		}
		else if(p1.rank<p2.rank) {
			return 1;
		}
		else {
			return -1;
		}
		
	}
}
