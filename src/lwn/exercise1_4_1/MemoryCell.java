package lwn.exercise1_4_1;

public class MemoryCell{
	private Object storedValue;
	public Object read(){
		return storedValue;
	};
	public void write(Object x){
		storedValue = x;
	}
}
