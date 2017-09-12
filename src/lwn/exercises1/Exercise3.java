package lwn.exercises1;
/**
 *  ‰≥ˆdouble–Õ¡ø
 * @author Administrator
 *
 */
public class Exercise3 {

	public static void main(String[] args) {
		
		printDecimal(-12.3454,4);
		
	}
	
	public static double roundUp(double n,int decimalDigits){
		double bias = 0.5;
		for(int i = 0 ; i < decimalDigits ; i++){
			bias = bias / 10;
		}
		return n + bias;
	}
	
	public static double fractionPart(double n){
		return n - (int)n;
	}
	
	
	public static void printDecimal(double d,int decimalDigits){
		
		if(d < 0){
			System.out.print("-");
			d = -d;
		}
		d = roundUp(d, decimalDigits);
		int integerPart = (int)d;
		printOut(integerPart);
		double fractionPart = fractionPart(d);
		if(fractionPart > 0){
			System.out.print(".");
		}
		printFractionPart(fractionPart,decimalDigits);
	}

	
	private static void printFractionPart(double fractionPart,int decimalDigits) {
		for(int i = 0 ; i < decimalDigits; i++){
			fractionPart = fractionPart * 10;
			printOut((int)fractionPart);
			fractionPart = fractionPart(fractionPart);
			
		}
	}

	public static void printOut(int i){
		if(i / 10 > 0){
			printOut(i / 10);
		}
		printDigit(i % 10);
	}

	private static void printDigit(int i) {
		System.out.print(i);
	}
	
}
