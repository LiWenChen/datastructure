package lwn.exercise1_6;

import java.util.Comparator;

public class CaseInsensitiveCompare implements Comparator<String> {

	public int compare(String lhs,String rhs){
		return lhs.compareToIgnoreCase(rhs);
	}
	
}
