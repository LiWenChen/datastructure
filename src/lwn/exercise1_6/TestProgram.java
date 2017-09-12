package lwn.exercise1_6;

public class TestProgram {

	public static void main(String[] args) {
		String [] arr = {"ZEBRA","alligator","crocodile"};
		System.out.println(FindMaxDemo.findMax(arr, new CaseInsensitiveCompare()));
	}

}
