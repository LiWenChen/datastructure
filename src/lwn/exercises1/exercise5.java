package lwn.exercises1;

public class exercise5 {
	private static StringBuffer sb = new StringBuffer();
	public static void main(String[] args) {

//		int acount = binaryAcount(3);
//		System.out.println(acount);
		System.out.println(binaryCount(13));
	}

	
	/**
	 * ������ʵ�����n����������ô��1�ĸ�������n / 2�Ķ����Ʊ�ʾ��1�ĸ�����1
	 */
	public static int binaryCount(int n){
		if(n == 2 || n == 1){
			return 1;
		}else if(n % 2 == 1){
			return binaryCount(n/2) + 1;
		}else{
			return binaryCount(n/2);
		}
	}

}
