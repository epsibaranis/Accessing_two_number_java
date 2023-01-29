package A2nos;

class Op2nos extends A2nos {

	public Op2nos() {
		super();
	}
	public Op2nos(int a) {
		super(a);
	}
	public Op2nos(int a,int b) {
		super(a,b);
	}
	public Op2nos(Op2nos a) {
		super(a);
	}
    public int sum() {
    	return(x+y);
    }
    public int diff() {
    	return(x-y);
    }
    public int proudct() {
    	return(x*y);
    }
    public int mod() {
    	return(x%y);
    }
    public int Bigof2no() {
    	return(x>y?x:y);
    }
    public int smallof2no() {
    	return(x<y?x:y);
    }
}
