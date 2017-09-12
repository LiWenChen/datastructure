package lwn.exercises1;

/**
 * 简单地说：就是第一个数分别以后面的数进行交换 E．g：E = （a , b , c），则 prem（E）= a.perm（b,c）+
 * b.perm（a,c）+ c.perm（a,b） 然后a.perm（b,c）= ab.perm（c）+ ac.perm（b）= abc +
 * acb.依次递归进行
 * 
 * @author lwn
 *
 */
public class Exercise6 {

	public static void main(String[] args) {
		permute("abc");

	}

	public static void permute(String str) {
		char[] arr = str.toCharArray();
		permute(arr, 0, arr.length - 1);
	}

	public static void permute(char[] str, int low, int high) {
		// permute(news, i + 1, high);
		if (low >= high || high == 0) {
			System.out.println(new String(str));
			return;
		}

		for (int i = low; i <= high; i++) {

			swap(str, low, i);
			permute(str, low + 1, high);
			swap(str, low, i);

		}

	}

	public static void swap(char[] str, int i, int low) {
		char temp = str[i];
		str[i] = str[low];
		str[low] = temp;
	}
}
