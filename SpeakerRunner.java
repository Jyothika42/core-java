class SpeakerRunner{

	public static void main(String[] audio){
	System.out.println("Main started");
	
			//invoking a method
	boolean connect = Speaker.onOrOff();
	System.out.println("is Speaker connected : " + connect);
	
		connect = Speaker.onOrOff();
		System.out.println("is Speaker connected : " + connect);
	
	
	
	System.out.println("Main ended");
	}

}