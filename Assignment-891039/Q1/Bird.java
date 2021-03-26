package org.assigment.ds;

public class Bird {
	
	public static String name;
	public static int no;
	public static float no_1;
	public static double no_2;
	public static boolean t;
	
	//instance variable
	int ii=1;
	float averageHeight=2.0f;
	double averageSpeed=7.0;
	boolean hasWings=false;
	String name1="Pikku";
	
	public Bird(String name,int no,float no_1,double no_2,boolean t) {
		this.name=name;
		this.no=no;
		this.no_1=no_1;
		this.no_2=no_2;
		this.t=t;
	}
	public void fly() {
		System.out.println(name+":"+no+":"+no_1+":"+no_2+":"+t);
	}
	
	
}