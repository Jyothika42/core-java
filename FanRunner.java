class FanRunner{

    public static void main(String[] bajaj){
	
	    System.out.println("Main Started");
		        //invoking a method
		boolean connect = Fan.onOrOff();
		    System.out.println("is Fan Conneted :" + connect);
			   
		//boolean connected = Fan.onOrOff();
			//System.out.println("is Fan Connected :" + connect);
		
		Fan.increaseSpeed();
		Fan.increaseSpeed();
		Fan.increaseSpeed();
		Fan.increaseSpeed();
		Fan.increaseSpeed();
		Fan.increaseSpeed();
		Fan.increaseSpeed();
		Fan.increaseSpeed();
		Fan.increaseSpeed();
		Fan.increaseSpeed();
		Fan.increaseSpeed();
		Fan.increaseSpeed();
		
	    
		
		Fan.decreaseSpeed();
		Fan.decreaseSpeed();
		Fan.decreaseSpeed();
		Fan.decreaseSpeed();
		Fan.decreaseSpeed();
		Fan.decreaseSpeed();
		Fan.decreaseSpeed();
		Fan.decreaseSpeed();
		Fan.decreaseSpeed();
		Fan.decreaseSpeed();
		Fan.decreaseSpeed();
		Fan.decreaseSpeed();
		
		
	
		 connect = Fan.onOrOff();
		System.out.println("is Fan  Connected :" + connect);
		System.out.println("The Fan is Connected :" +connect);
		Fan.increaseSpeed();
		Fan.decreaseSpeed();
		System.out.println("Main Ended");
	
	}
}