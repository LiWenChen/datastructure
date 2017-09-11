package lwn.exercise1_4_4;

public class Square implements Shape {
	private double w;
	public Square(double w){
		this.w = w;
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
	public double area() {
		return this.w * this.w;
	}

	@Override
	public String toString() {
		return "Square";
	}
}
