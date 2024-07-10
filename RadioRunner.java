class RadioRunner{

	public static void main(String[] audio){
	System.out.println("Main started");
	
	
	boolean connect = Radio.onOrOff();
	System.out.println("is Radio connected " + connect);
	
	connect = Radio.onOrOff();
	System.out.println("is Radio connected " + connect);
	
	System.out.println("Main ended");
	}

}