package lwn.exercises1;

/**
 * ��̽��ѡ������
 * 
 * @author lwn
 *
 */
public class Exercise1 {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 78, 4, 9, 23, 67, 6, 43, 58, 98, -1, 23 ,88,98};
		int k = arr.length / 2;
		long start = System.currentTimeMillis();
		int max_k = select(arr,k);
		long end = System.currentTimeMillis();
		long diff = end - start;
		System.out.println("�� " + k + "������� " + max_k + "��ʱ��" + diff + "���� " );
	}

	/**
	 * ѡ���k�������
	 * 
	 * @param arr
	 * @param k
	 * @return
	 */
	public static int select(int[] arr, int k) {
		if (k <= 0) {
			return -1;
		}

		int[] preArr = new int[k];

		for (int i = 0; i < k; i++) {
			preArr[i] = arr[i];
		}

		Sort.Bubble(preArr);
		
		for (int i = 0; i < arr.length - k; i++) {
			for (int j = k - 1; j >= 0; j--) {

				if (arr[k + i] < preArr[k - 1]) {  //С�ڵ�k������ߣ��޳�
					break;
				} else if (arr[k + i] > preArr[0]) {  //���ڵ�һ������ߣ���λ���Ѵ�Ĳ��뵽��һ����k�����ļ���ȥ

					for (int n = k - 1; n > 0; n--) {
						preArr[n] = preArr[n - 1];
					}
					preArr[0] = arr[k + i];
					break;
				} else if (arr[k + i] <= preArr[j] && j < k - 1) {//�����м䣬���������
					
					for(int n = k - 1 ; n > j + 1; n--){
						preArr[n] = preArr[n - 1];
					}
					preArr[j + 1] = arr[k + i];
					break;
				}
			}
		}
//		for (int a : preArr) {
//			System.out.println(a);
//		}
		return preArr[k - 1];
	}

}
