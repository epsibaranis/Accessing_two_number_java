package A2nos;

public class A2nos {
	protected int x,y;
	public A2nos() {
		x=10;
		y=20;
	}
	public A2nos(int a) {
		x=a;
		y=20;
	}
	public A2nos(int a,int b) {
		x=a;
		y=b;
	}
	public A2nos(A2nos a) {
		x=a.x;
		y=a.y;
	}
	public void set(int a) {
		x=a;
	}
	public void set(int a,int b) {
		x=a;
		y=b;
	}
	public void set() {
		x=0;
		y=0;
	}
	public void set(A2nos a) {
		x=a.x;
		y=a.y;
	}
	public int getx() {
		return x;
	}
	public int gety() {
		return y;
	}
	public int getobj(A2nos a) {
		return(a.x&a.y);
	}
	public void print() {
		System.out.println(" x value is "+x);
		System.out.println(" y value is "+y);
	}

}
