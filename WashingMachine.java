class WashingMachine{
	
	static boolean isConnected = false;
	static int maxSpeed = 10;
	static int minSpeed=0;
	static int currentSpeed;
	
	public static boolean onOrOff(){
	
	System.out.println("Start of onOrOff");
	isConnected = (isConnected==false) ?true:false;
	
	System.out.println("end of onOrOff");
	return isConnected;
	
	}
	
	
	public static void increaseSpeed(){
		System.out.println("start of Increase Speed");
		if(isConnected == true){
			if(currentSpeed < maxSpeed){
				currentSpeed = currentSpeed+1;
				System.out.println("The Current Speed " + currentSpeed);
		}else{
			System.out.println("Max speed reached");
		}
	}
	else{
		System.out.println("Turn on washing machine");
		System.out.println("end of Increase Speed");
		return;	
		
	}
	}
	
	public static void decreaseSpeed(){
		
	System.out.println("Decrease Speed Started");
		if(isConnected=true){
			if(currentSpeed > minSpeed){
				currentSpeed = currentSpeed-1;
				System.out.println("the Decreased is " + currentSpeed);
				} else{
					System.out.println("Min speed reached");
				}
			} 
			else {
					System.out.println("Turn on washing machine");
					System.out.println("End of decreased Speed");
			return;
			}
		
		
	
	}

}


























