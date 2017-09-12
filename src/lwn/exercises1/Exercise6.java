package lwn.exercises1;

/**
 * �򵥵�˵�����ǵ�һ�����ֱ��Ժ���������н��� E��g��E = ��a , b , c������ prem��E��= a.perm��b,c��+
 * b.perm��a,c��+ c.perm��a,b�� Ȼ��a.perm��b,c��= ab.perm��c��+ ac.perm��b��= abc +
 * acb.���εݹ����
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
