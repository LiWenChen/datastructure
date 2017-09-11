package lwn.exercise1_4_4;

public class FindMaxDemo {

	public static void main(String[] args) {
		Shape[] sh1 = {
				new Circle(2.0),
				new Square(4.0),
				new Rectangle(3.0, 4.0)
		};
		
		String[] sh2 = {"Joe","Bob","Bill","Zeke"};
		
		System.out.println(findMax(sh1));
		System.out.println(findMax(sh2));
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Comparable findMax(Comparable[] arr){
		int maxIndex = 0;
		for(int i = 1; i < arr.length; i++){
			if(arr[i].compareTo(arr[maxIndex]) > 0){
				maxIndex = i;
			}
		}
		return arr[maxIndex];
	}

}
