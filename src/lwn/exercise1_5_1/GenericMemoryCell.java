package lwn.exercise1_5_1;
/**
 * @param <AnyType> ·ºÐÍ
 */
public class GenericMemoryCell<AnyType>{
	private AnyType storedValue;
	public AnyType read(){
		return storedValue;
	};
	public void write(AnyType x){
		storedValue = x;
	}
}
