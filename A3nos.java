package A2nos;
class A3nos extends A2nos {
    protected int z;
	public A3nos() {
		super();
		z=5;
		}
	public A3nos(int a) {
		super(a);
		z=25;
	}
	public A3nos(int a,int b) {
		super(a,b);
		z=25;
	}
	public A3nos(int a,int b,int c) {
		super(a,b);
		z=c;
	}
	public A3nos(A3nos a) {
		super(a);
        z=a.z;		
		}
	 public void reset() {
	    	set();
	    	z=30;
	    }
	    public void setobj(A3nos a) {
	    	x=a.x;
	    	y=a.y;
	    	z=a.z;
	    }
	    public void setz(int a) {
	    	z=a;
	    }
	    public void set(int a,int b,int c) {
	    	x=a;
	    	y=b;
	    	z=c;
	    }
	    public int getz() {
	    	return z;
	    }
	    public void displayz() {
	    	System.out.println(z);
	    }

}
