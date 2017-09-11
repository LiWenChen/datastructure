package lwn.exercise1_4_4;

public class Rectangle implements Shape{
	private double w;
	private double h;
	
	public Rectangle(double w,double h){
		this.w = w;
		this.h = h;
	}
	@Override
	public int compareTo(Shape o) {
		// TODO Auto-generated method stub
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
		return this.w * this.h;
	}

	@Override
	public String toString() {
		return "Rectangle";
	}
}
