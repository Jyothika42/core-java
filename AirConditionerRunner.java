class AirConditionerRunner{

	public static void main(String[] bajaj){
	System.out.println("Main started");
	
			//invoking a method
	boolean connect = AirConditioner.onOrOff();
	System.out.println("is AirConditioner connected : " + connect);
	
	
	AirConditioner.increaseTemperature();
	AirConditioner.increaseTemperature();
	AirConditioner.increaseTemperature();
	AirConditioner.increaseTemperature();
	AirConditioner.increaseTemperature();
	AirConditioner.increaseTemperature();
	AirConditioner.increaseTemperature();
	AirConditioner.increaseTemperature();
	AirConditioner.increaseTemperature();
	
	
	
	AirConditioner.decreaseTemperature();
	AirConditioner.decreaseTemperature();
	AirConditioner.decreaseTemperature();
	AirConditioner.decreaseTemperature();
	AirConditioner.decreaseTemperature();
	AirConditioner.decreaseTemperature();
	AirConditioner.decreaseTemperature();
	AirConditioner.decreaseTemperature();
	
	
	
	connect = AirConditioner.onOrOff();
	System.out.println("is AirConditioner connected : " + connect);
	
	System.out.println("The AirConditioner connected " + connect);
	AirConditioner.increaseTemperature();
	AirConditioner.decreaseTemperature();
	System.out.println("Main ended");
	}

}