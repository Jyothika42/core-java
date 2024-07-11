class KettleRunner{

	public static void main(String[] hotWater){
	System.out.println("Main started");
	
			//invoking a method
	boolean connect = Kettle.onOrOff();
	System.out.println("is Kettle connected : " + connect);
	
	
	Kettle.increaseTemperature();
	Kettle.increaseTemperature();
	Kettle.increaseTemperature();
	Kettle.increaseTemperature();
	Kettle.increaseTemperature();
	Kettle.increaseTemperature();
	Kettle.increaseTemperature();
	Kettle.increaseTemperature();
	
	
	
	
	Kettle.decreaseTemperature();
	Kettle.decreaseTemperature();
	Kettle.decreaseTemperature();
	Kettle.decreaseTemperature();
	Kettle.decreaseTemperature();
	Kettle.decreaseTemperature();
	Kettle.decreaseTemperature();
	Kettle.decreaseTemperature();
	
	
	
	connect = Kettle.onOrOff();
	System.out.println("is Kettle connected : " + connect);
	
	System.out.println("The Kettle connected " + connect);
	Kettle.increaseTemperature();
	Kettle.decreaseTemperature();
	System.out.println("Main ended");
	}

}