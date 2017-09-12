package lwn.exercises1;

public class Sort {
	/**
	 * ц╟ещеепР
	 * @param arr
	 * @return
	 */
	public static int[] Bubble(int[] arr){
		int temp = 0;
		for(int i = 0 ; i < arr.length - 1; i++){
			for(int j = 1; j < arr.length - i; j++){
				if(arr[j - 1] < arr[j]){
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
	}
	
	
	public static void main(String[] args) {
			int[] arr = new int[]{1,2,78,4,9,23,67,6,43,58,98,-1,23};
			Bubble(arr);
			for(int a : arr){
				System.out.println(a);
			}
			
		}
}
