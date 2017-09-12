package lwn.exercise1_5_3;

import java.util.ArrayList;

import lwn.exercise1_4_4.Circle;
import lwn.exercise1_4_4.Rectangle;
import lwn.exercise1_4_4.Shape;
import lwn.exercise1_4_4.Square;

public class WildcardCharacter {

	public static void main(String[] args) {
		Shape[] s = {
			new Circle(3.0),
			new Square(4.0),
			new Rectangle(4, 3.0)
		};
		
		Square [] s1 = {
				new Square(4.0),
				new Square(3.0),
				new Square(5.0),
		};
		ArrayList<Shape> array1 = new ArrayList<Shape>();
		array1.add(new Circle(3.0));
		array1.add(new Square(4.0));
		array1.add(new Rectangle(4, 3.0));
		
		ArrayList<Square> array2 = new ArrayList<Square>();
		array2.add(new Square(3.0));
		array2.add(new Square(4.0));
		array2.add(new Square(5.0));
		//array2.add(new Rectangle(4, 3.0)); 编译报错
		double areas = totalArea(s);
		System.out.println("total area1: " +areas);
//		System.out.println("total area2: " +totalArea(s1));
		System.out.println("total area3: " +totalArea(array1));
//		System.out.println("total area3: " +totalArea(array2)); 编译报错
		System.out.println("total area3: " +totalArea1(array2));//使用通配符，编译不会报错
	}
	
	public static double totalArea(Shape [] arr){
		double total = 0;
		for(Shape s : arr){
			if(s != null)
				total += s.area();
		}
		return total;
	}
	
	public static double totalArea(ArrayList<Shape> arr){
		double total = 0;
		for(Shape s : arr){
			if(s != null)
				total += s.area();
		}
		return total;
	}
	
	public static double totalArea1(ArrayList<? extends Shape> arr){
		double total = 0;
		for(Shape s : arr){
			if(s != null)
				total += s.area();
		}
		return total;
	}
	

}
