package A2nos;

class Op3nos extends A3nos {

	public Op3nos() {
		super();
	}
	public int sum() {
		return(x+y+z);
	}
    public int diff() {
    	return(x-y-z);
    }
    public int product() {
    	return(x*y*z);
    }
    public int mod() {
    	return((x%y)%z);
    }
    public int BigOf3no() {
    	return(x>(y>z?y:z)?x:((y>z)?y:z));
    }
    public int SmallOf3no() {
    	return(x<(y<z?y:z)?x:((y<z)?y:z));
    }
}
