class FridgeRunner{

	public static void main(String[] godrej){
	System.out.println("Main started");
	
			//invoking a method
	boolean connect = Fridge.onOrOff();
	System.out.println("is Fridge connected : " + connect);
	
		connect = Fridge.onOrOff();
		System.out.println("is Fridge connected : " + connect);
	
	
	
	System.out.println("Main ended");
	}

}