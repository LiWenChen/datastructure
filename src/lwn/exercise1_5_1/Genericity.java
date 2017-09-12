package lwn.exercise1_5_1;

public class Genericity {

	public static void main(String[] args) {
		
		GenericMemoryCell<Integer>  m = new GenericMemoryCell(); //指定泛型为Integer
		m.write(23); //传的参数不是Integer，会编译报错,Java 5以前不会编译报错，只会运行时报ClassCastException
		Integer val =   m.read();
		System.out.println("Contents are:" + val);
	}

}
