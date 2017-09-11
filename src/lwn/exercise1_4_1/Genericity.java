package lwn.exercise1_4_1;

public class Genericity {

	public static void main(String[] args) {
		
		MemoryCell m = new MemoryCell();
		m.write(new Integer(23));
		Object val =  m.read();
		System.out.println("Contents are:" + val);
	}

}
