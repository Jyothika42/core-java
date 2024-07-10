class FanRunner{

	public static void main(String[] run){
	System.out.println("Main started");
	
	boolean conect = Fan.onOrOff();
	System.out.println("is Fan connected : " + conect);
	
	conect = Fan.onOrOff();
	System.out.println("is Fan connected : " + conect);
	
	System.out.println("Main ended");
	}
}