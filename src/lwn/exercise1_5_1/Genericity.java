package lwn.exercise1_5_1;

public class Genericity {

	public static void main(String[] args) {
		
		GenericMemoryCell<Integer>  m = new GenericMemoryCell(); //ָ������ΪInteger
		m.write(23); //���Ĳ�������Integer������뱨��,Java 5��ǰ������뱨��ֻ������ʱ��ClassCastException
		Integer val =   m.read();
		System.out.println("Contents are:" + val);
	}

}
