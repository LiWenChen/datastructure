package lwn.exercises1;

import java.util.Comparator;

public class PerimeterComparator implements Comparator<Rectangle> {

	@Override
	public int compare(Rectangle o1, Rectangle o2) {
		if(o1.perimeter()-o2.perimeter() > 0){
			return 1;
		}else if(o1.perimeter()-o2.perimeter() < 0){
			return -1;
		}else{
			return 0;
		}
	}

}
