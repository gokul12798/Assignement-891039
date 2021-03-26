package org.assigment.q10;

public class HashCodeImpl {
	public static void main(String[] args) {
		HashCodeAndEquals he = new HashCodeAndEquals();
		HashCodeAndEquals he1 = new HashCodeAndEquals();
		
		System.out.println("Equals Method ::" +he.equals(he1));
		System.out.println("HashCode Method Obj1"+he.hashCode());
		System.out.println("HashCode Method Obj2"+he1.hashCode());
	}

}
