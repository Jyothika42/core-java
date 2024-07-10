class KettleRunner{

	public static void main(String[] hotWater){
	System.out.println("Main started");
	
	boolean connect = Kettle.onOrOff();
	System.out.println("is Kettle connected : " + connect);
	
		connect = Kettle.onOrOff();
		System.out.println("is Kettle connected : " + connect);
	
	System.out.println("Main ended");
	}

}