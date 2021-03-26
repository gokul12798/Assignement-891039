package org.assigment.add;

public class TestClass4 {
	
public int add(int[] numbers){
		
		int sum = 0;
		for(int n : numbers){
			sum += n;
		}
		
		return sum;
	}
	
	//Due to compilation error, we changed the method name
	public String concatenate(int[] numbers){
		
		String str = "";
		
		for(int n: numbers){
			str += String.valueOf(n);
		}
		
		return str;
	}
	
	
	public static void main(String[] args){
		
		TestClass4  tc4 = new TestClass4();
		int[] arr = {1,2,3,4,5}; 
		
		System.out.println("Sum : "+tc4.add(arr));
		System.out.println("After Concatenation : "+tc4.concatenate(arr));
}
}
