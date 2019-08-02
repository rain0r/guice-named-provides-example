package org.hihn.guice;

public class BizLogic {

	private Integer a = 0;

	private Integer b = 0;

	public BizLogic(Integer a) {
		super();
		this.a = a;
	}

	public BizLogic(Integer a, Integer b) {
		super();
		this.a = a;
		this.b = b;
	}

	public void print() {
		System.out.println("A: " + a);
		System.out.println("B: " + b);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}