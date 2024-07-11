class RadioRunner{

    public static void main(String[] audio){
	
	    System.out.println("Main Started");
		        //invoking a method
		boolean connect = Radio.onOrOff();
		    System.out.println("is Radio Conneted :" + connect);
			   
		//boolean connected = Radio.onOrOff();
		//System.out.println("is Radio Connected :" + connect);
		
		Radio.increaseVolume();
	    Radio.increaseVolume();
		Radio.increaseVolume();
	    Radio.increaseVolume();
	    Radio.increaseVolume();
		Radio.increaseVolume();
	    Radio.increaseVolume();
	    Radio.increaseVolume();
		Radio.increaseVolume();
	    
		
		Radio.decreaseVolume();
		Radio.decreaseVolume();
		Radio.decreaseVolume();
		Radio.decreaseVolume();
		Radio.decreaseVolume();
		Radio.decreaseVolume();
		Radio.decreaseVolume();
		Radio.decreaseVolume();
		Radio.decreaseVolume();
		
	
		connect = Radio.onOrOff();
		System.out.println("is Radio Connected :" + connect);
		System.out.println("The Radio is Connected :" +connect);
		Radio.increaseVolume();
		Radio.decreaseVolume();
		System.out.println("Main Ended");
	
	}
}
