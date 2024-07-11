class SpeakerRunner{

    public static void main(String[] jBL){
	
	    System.out.println("Main Started");
		        //invoking a method
		boolean connect = Speaker.onOrOff();
		    System.out.println("is Speaker Conneted :" + connect);
			   
		//boolean	  connected = Speaker.onOrOff();
			//System.out.println("is Speaker Connected :" + connect);
		
		Speaker.increaseVolume();
	    Speaker.increaseVolume();
		Speaker.increaseVolume();
	    Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
	    Speaker.increaseVolume();
		
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
	
		 connect = Speaker.onOrOff();
		System.out.println("is Speaker Connected :" + connect);
		System.out.println("The Speaker is Connected :" +connect);
		Speaker.increaseVolume();
		Speaker.decreaseVolume();
		System.out.println("Main Ended");
	
	}
}
