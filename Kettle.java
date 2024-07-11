class Kettle{

    static boolean isConnected = false ;
	static int maxTemperature = 7;
	static int minTemperature = 0;
	static int currentTemperature;
	
	//method declaration
	public static boolean onOrOff(){
	
	    System.out.println("start of onOrOff");
		
		isConnected = (isConnected == false) ?true:false;
		
		System.out.println("end of onOrOff");
		return isConnected;
	
}

		public static void increaseTemperature(){
			
			System.out.println("Increase Temperature method started");
			if(isConnected ==true){
				if(currentTemperature < maxTemperature){
					currentTemperature = currentTemperature+1;
					System.out.println("The current Temperature is " + currentTemperature);
				}else{
					System.out.println("Maxium Temperature Reached");
				}
			}else{
				System.out.println("Turn on Kettle");
				System.out.println("Increase Volume method ended");
				return;
			}
			
			
		}
	
	public static void decreaseTemperature(){
		
		System.out.println("Decrease Temperature started");
		if(isConnected == true){
			if(currentTemperature > minTemperature){
				currentTemperature = currentTemperature-1;
				System.out.println("The current temperature is " + currentTemperature);
			}else{
				System.out.println("The Min Temperature reached");
			}
			}else{
				System.out.println("turn off Kettle");
				System.out.println("Decrease Temperature ended");
			return;
		}
		
		
		
	}
	
}
