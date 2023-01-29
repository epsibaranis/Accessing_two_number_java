package A2nos;

public class main3 {

	public static void main(String[] args) {
		A3nos a1,a2,a3;
		a1=new A3nos();
		a1.print();
		a1.setz(500);
		a1.print();
		a2=new A3nos(1234);
		a2.print();
		a2.setz(4321);;
		a2.print();
		a3=new A3nos(a1);
		a3.print();
	}

}
