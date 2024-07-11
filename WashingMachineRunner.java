class WashingMachineRunner{

    public static void main(String[] whiprol){
	
	    System.out.println("Main Started");
		        //invoking a method
		boolean connect = WashingMachine.onOrOff();
		    System.out.println("is Washing Machine Conneted :" + connect);
			   
		//boolean	  connected = WashingMachine.onOrOff();
			//System.out.println("is Washing Machine Connected :" + connect);
		
		WashingMachine.increaseSpeed();
		WashingMachine.increaseSpeed();
		WashingMachine.increaseSpeed();
		WashingMachine.increaseSpeed();
		WashingMachine.increaseSpeed();
		WashingMachine.increaseSpeed();
		WashingMachine.increaseSpeed();
		WashingMachine.increaseSpeed();
		WashingMachine.increaseSpeed();
		WashingMachine.increaseSpeed();
		WashingMachine.increaseSpeed();
		WashingMachine.increaseSpeed();
	    
		
		WashingMachine.decreaseSpeed();
		WashingMachine.decreaseSpeed();
		WashingMachine.decreaseSpeed();
		WashingMachine.decreaseSpeed();
		WashingMachine.decreaseSpeed();
		WashingMachine.decreaseSpeed();
		WashingMachine.decreaseSpeed();
		WashingMachine.decreaseSpeed();
		WashingMachine.decreaseSpeed();
		WashingMachine.decreaseSpeed();
		WashingMachine.decreaseSpeed();
		WashingMachine.decreaseSpeed();
		
	
		 connect = WashingMachine.onOrOff();
		System.out.println("is washing machine Connected :" + connect);
		System.out.println("The washing machine is Connected :" +connect);
		WashingMachine.increaseSpeed();
		WashingMachine.decreaseSpeed();
		System.out.println("Main Ended");
	
	}
}