package lwn.exercise1_5_4;

import lwn.exercise1_4_4.Circle;
import lwn.exercise1_4_4.Rectangle;
import lwn.exercise1_4_4.Shape;
import lwn.exercise1_4_4.Square;

public class Genericity {

	public static void main(String[] args) {
		int[] arrs = new int[]{1,2,3,4,5,6,7,8,9}; 
		Circle c = new Circle(3.0);
		Square sq = new Square(4.0);
		Shape[] s = {
				c,
				sq,
				new Rectangle(3.0, 4.0)
		};
//		Genericity.contains(arrs,"2"); 编译报错,int类型不能作为泛型参数，用包装类Integer
		System.out.println(Genericity.contains(s,new Rectangle(3.0, 4.0)));
	}

	/**
	 * 泛型static方法
	 * @param arr
	 * @param x
	 * @return
	 */
	public static<AnyType> boolean contains(AnyType[] arr, AnyType x) {
		
		for (AnyType val : arr) {
			if (x.equals(val)) {
				return true;
			}
		}
		return false;
	}
	
	public static <AnyType> void print(AnyType arr){
		System.out.println("arr : " + arr);
	}

}
