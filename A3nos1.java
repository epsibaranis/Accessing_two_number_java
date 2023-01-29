package A2nos;

class A3nos1 extends A2nos {

	 protected int z;
	 public A3nos1() {
			super();
			z=25;
		}
		public A3nos1(int a) {
			super(a);
			z=25;
		}
		public A3nos1(int a,int b) {
			super(a,b);
			z=25;
		}
		public A3nos1(int a,int b,int c) {
			super(a,b);
			z=c;
		}
	    public A3nos1(A3nos1 a) {
	    	super(a);
	    	z=a.z;
	    }
	    public void set(int a) {
	    	z=a;
	    	
	    }
	    public void set(int a,int b) {
	    	x=a;y=b;
	    }
	    public void set(int a,int b,int c) {
	    	x=a;y=b;
	    	z=c;
	    }
	    public void set(A3nos1 a) {
	    	x=a.x;
	    	y=a.y;
	    	z=a.z;
	    }
	    public void set() {
	    	super.set();
	    	z=0;
	    }
	    
	    public int getz() {
	    	return z;
	    }
	    public void print() {
	    	super.print();
	    	System.out.println(" z value is "+z);
	    }
}
