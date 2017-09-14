package lwn.exercises1;

import java.util.Arrays;

import lwn.exercise1_4_4.Circle;
import lwn.exercise1_4_4.Rectangle;
import lwn.exercise1_4_4.Shape;
import lwn.exercise1_4_4.Square;

public class OrdereCollection<E> {

	private int maxLength = 10;
	private Comparable [] comp = new Comparable[maxLength];
	
	public boolean isEmpty(){
		return comp[0] == null ? true : false;
	}
	
	public void makeEmpty(){
		comp = new Comparable[maxLength];
	}
	
	public void insert(E e){
		for(int i = 0 ; i< comp.length ; i++){
			if(comp[i] == null){
				comp[i] = (Comparable) e;
				break;
			}
		}
		
		if(comp[comp.length - 1] != null){//扩容
			maxLength = 2 * maxLength;
			Comparable[] temp = new Comparable[maxLength];
			for(int i = 0 ;i< comp.length ; i++){
				temp[i] = comp[i];
			}
			comp = temp;
		}
	}
	
	public void remove(E e){
		for(int i = 0; i< comp.length ; i++){
			if(e.equals(comp[i])){//比较的是指针相等，如果要比较内容相等可以用compareTo方法
				for(int j = i; i< comp.length - 1; j++){
					comp[j] = comp[j + 1];
					if(comp[j + 1] == null){
						break;
					}
				}
				break;
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public E findMin(){
		E e = (E) comp[0];
		if(e == null){
			return null;
		}
		for(int i = 1 ; i < comp.length ; i++){
			if(comp[i] == null){
				break;
			}
			if(comp[i].compareTo(e) < 0){
				e = (E) comp[i];
			}
		}
		return e;
	}
	@SuppressWarnings("unchecked")
	public E findMax(){
		
		E e = (E) comp[0];
		if(e == null){
			return null;
		}
		for(int i = 1 ; i < comp.length ; i++){
			if(comp[i] == null){
				break;
			}
			if(comp[i].compareTo(e) > 0){
				e = (E) comp[i];
			}
		}
		return e;
	}
	@Override
	public String toString() {
		return "obj = " + Arrays.toString(comp);
	}
	public static void main(String[] args) {
		OrdereCollection<String> oc = new OrdereCollection<>();
		
		oc.insert("we5");
		oc.insert("we4");
		oc.insert("we1");
		oc.insert("we7");
		oc.insert("we3");
		oc.insert("we6");
		oc.insert("we2");
		oc.insert("we12");
		oc.insert("we21");
		oc.insert("we20");
		oc.insert("we92");
		
		
		System.out.println(oc);
		
		System.out.println(oc.findMax());
		System.out.println(oc.findMin());
		oc.remove("we20");
		System.out.println(oc);
		
		OrdereCollection<Shape> oc1 = new OrdereCollection<>();
		Circle c = new Circle(3.0);
		oc1.insert(c);
		oc1.insert(new Square(3.0));
		oc1.insert(new Rectangle(3.0,4.0));
//		oc1.insert(new Circle(4.0));
		
		System.out.println(oc1);
		System.out.println(oc1.findMax());
		System.out.println(oc1.findMin());
		oc1.remove(c);
		System.out.println(oc1);
	}

}
