package A2nos;

public class main2 {

	public static void main(String[] args) {
		Op2nos a1,a2,a3,a4;
		a1=new Op2nos();
		System.out.println(a1.sum());
		System.out.println(a1.diff());
		System.out.println(a1.proudct());
		System.out.println(a1.mod());
		System.out.println(a1.Bigof2no());
		System.out.println(a1.smallof2no());
		a2=new Op2nos(100);
		System.out.println(a2.sum());
		System.out.println(a2.diff());
		System.out.println(a2.proudct());
		System.out.println(a2.mod());
		System.out.println(a2.Bigof2no());
		System.out.println(a2.smallof2no());
		a3=new Op2nos(100,200);
		System.out.println(a3.sum());
		System.out.println(a3.diff());
		System.out.println(a3.proudct());
		System.out.println(a3.mod());
		System.out.println(a3.Bigof2no());
		System.out.println(a3.smallof2no());
		a4=new Op2nos(a1);
		System.out.println(a4.sum());
		System.out.println(a4.diff());
		System.out.println(a4.proudct());
		System.out.println(a4.mod());
		System.out.println(a4.Bigof2no());
		System.out.println(a4.smallof2no());
	}

}
