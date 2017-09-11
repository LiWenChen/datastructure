package lwn.exercise1_4_4;

public class Circle implements Shape {
	
	private double r ;

	public Circle(double r){
		this.r = r;
	}
	public double area(){
		return Math.PI * r * r;
	}
	@Override
	public int compareTo(Shape o) {
		double diff = area() - o.area();
		if(diff > 0)
			return 1;
		else if(diff < 0)
			return -1;
		else 
			return 0;
	}

	@Override
	public String toString() {
		return "Circle";
	}
}
