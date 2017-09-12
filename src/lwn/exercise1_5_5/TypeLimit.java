package lwn.exercise1_5_5;

import lwn.exercise1_4_4.Circle;
import lwn.exercise1_4_4.Rectangle;
import lwn.exercise1_4_4.Shape;
import lwn.exercise1_4_4.Square;

public class TypeLimit {

	public static void main(String[] args) {

		Shape[] s = {
			new Circle(3.0),
			new Square(6.0),
			new Rectangle(3.0, 4.5)
		};
		
		System.out.println(findMax(s));
	}
	
	public static <AnyType extends Comparable<? super AnyType>> AnyType findMax(AnyType [] arr){
		int maxIndex = 0;
		for(int i = 1; i < arr.length; i++){
			if(arr[i].compareTo(arr[maxIndex]) > 0){
				maxIndex = i;
			}
		}
		return arr[maxIndex];
	}

}
