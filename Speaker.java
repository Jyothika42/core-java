class Speaker{
     
	static boolean isConnected = false ;
	static int maxVolume = 7;
	static int minVolume = 0 ;
	static int currentVolume ;

       //method declaration
        public static boolean onOrOff(){
			 
			System.out.println("start of onOrOff");
			
		/* if(!isConnected) isConnected = true;
		System.out.println("Speaker is turn on");
		else if(isConnected) isConnected = false;
		System.out.println("Speaker is turn off");  */
			
			isConnected = (isConnected == false) ? true : false ;
			
			System.out.println("end of onOrOff");
	    return isConnected;
	    }

		
	public static void increaseVolume(){
		
		System.out.println("increaseVolume method started");
		if(isConnected == true){
			if(currentVolume < maxVolume){
			currentVolume = currentVolume + 1 ;
			System.out.println("The Current Volume is :" + currentVolume);
		}else{
			System.out.println("Maximum Volume reached");
		}
		
		}else{
			System.out.println("Turn on the Speaker");
		
		System.out.println("increaseVolume method ended");
		return ;
	}
	}
		
	public static void decreaseVolume(){
		
		System.out.println("decreaseVolume method started");
		if(isConnected == true){
			if(currentVolume > minVolume){
			currentVolume = currentVolume - 1 ;
			System.out.println("Current Volume is :" + currentVolume);
		}else{
			System.out.println("Minimum Volume reached");
		}
		}else {
			System.out.println("Turn on the Speaker");
		
		System.out.println("decreaseVolume method ended");
		return ;
	}
	
}
}