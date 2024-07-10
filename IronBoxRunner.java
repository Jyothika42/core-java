class IronBoxRunner{

	public static void main(String[] bajaj){
	System.out.println("Main started");
	
			//invoking a method
	boolean connect = IronBox.onOrOff();
	System.out.println("is IronBox connected : " + connect);
	
		connect = IronBox.onOrOff();
		System.out.println("is IronBox connected : " + connect);
	
	System.out.println("Main ended");
	}

}