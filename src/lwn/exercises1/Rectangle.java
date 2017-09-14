package lwn.exercises1;

import java.util.Comparator;

public class Rectangle {
	private double length;
	private double width;
	public Rectangle(double l,double w){
		this.length = l;
		this.width = w;
	}
	
	public double getLength(){
		return this.length;
	}
	
	public double getWidth(){
		return this.width;
	}
	
	public static <AnyType> AnyType findMax(AnyType[] arr,Comparator<? super AnyType > cmp){
		
		int maxIndex = 0;
		for(int i = 1; i < arr.length; i++){
			if(cmp.compare(arr[i], arr[maxIndex]) > 0){
				maxIndex = i;
			}
		}
		return arr[maxIndex];
	}
	
	public double area(){
		return this.length * this.width;
	}
	
	public double perimeter(){
		return 2*(this.length + this.width);
	}
	
	@Override
	public String toString() {
		return "rectangle width:" + this.width + " length:" + this.length;
	}
	
	public static void main(String[] args) {
		Rectangle [] re = new Rectangle[]{
				new Rectangle(1.0, 10.0),
				new Rectangle(2.0, 7.0),
				new Rectangle(4.0, 6.0),
				new Rectangle(5.0, 1.0),
				new Rectangle(7.0, 4.0),
				new Rectangle(2.0, 13.0)
		};
		
		System.out.println("面积最大的矩形："+Rectangle.findMax(re, new AreaComparator()));
		System.out.println("周长最大的矩形："+Rectangle.findMax(re, new PerimeterComparator()));
	}

}
