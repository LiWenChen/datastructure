package lwn.exercises1;

import java.util.Arrays;

public class Collection<E> {
	private int maxLength = 10;
	private Object[] obj = new Object[maxLength];
	
	public Object[] getobj(){
		return obj;
	}
	
	public boolean isEmpty(){
		return obj[0] != null ? false:true;
	}
	
	public void makeEmpty(){
		obj = new Object[maxLength];
	}
	
	public void insert(E a){
		for(int i = 0 ; i< obj.length ; i++){
			if(obj[i] == null){
				obj[i] = a;
				break;
			}
		}
		
		if(obj[obj.length - 1] != null){//À©ÈÝ
			maxLength = 2 * maxLength;
			Object[] temp = new Object[maxLength];
			for(int i = 0 ;i< obj.length ; i++){
				temp[i] = obj[i];
			}
			obj = temp;
		}
	}
	
	public boolean isPresent(E o){
		for(Object ob:obj){
			if(o.equals(ob)){
				return true;
			}
		}
		return false;
	}
	
	public void remove(E o){
		for(int i = 0; i< obj.length ; i++){
			if(o.equals(obj[i])){
				for(int j = i; i< obj.length - 1; j++){
					obj[j] = obj[j + 1];
					if(obj[j + 1] == null){
						break;
					}
				}
				break;
			}
		}
	}
	@Override
	public String toString() {
		return "obj=" + Arrays.toString(obj);
	}
	public static void main(String[] args) {
		Collection<String> c = new Collection<String>();
		System.out.println(c.isEmpty());
		for(int i = 0 ; i < 9 ; i++){
			c.insert(""+8 * i);
		}
		 c.remove(""+8);
		 
		System.out.println(c+ " -- " + c.isEmpty());
		c.makeEmpty();
		System.out.println(c.isEmpty());
	}
}
