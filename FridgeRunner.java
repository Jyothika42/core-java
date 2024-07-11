class FridgeRunner{

	public static void main(String[] godrej){
	System.out.println("Main started");
	
			//invoking a method
	boolean connect = Fridge.onOrOff();
	System.out.println("is Fridge connected : " + connect);
	
	
	Fridge.increaseTemperature();
	Fridge.increaseTemperature();
	Fridge.increaseTemperature();
	Fridge.increaseTemperature();
	Fridge.increaseTemperature();
	Fridge.increaseTemperature();
	Fridge.increaseTemperature();
	Fridge.increaseTemperature();
	Fridge.increaseTemperature();
	Fridge.increaseTemperature();
	Fridge.increaseTemperature();
	
	
	Fridge.decreaseTemperature();
	Fridge.decreaseTemperature();
	Fridge.decreaseTemperature();
	Fridge.decreaseTemperature();
	Fridge.decreaseTemperature();
	Fridge.decreaseTemperature();
	Fridge.decreaseTemperature();
	Fridge.decreaseTemperature();
	Fridge.decreaseTemperature();
	Fridge.decreaseTemperature();
	Fridge.decreaseTemperature();
	
	
	connect = Fridge.onOrOff();
	System.out.println("is Fridge connected : " + connect);
	
	System.out.println("The Fridge connected " + connect);
	Fridge.increaseTemperature();
	Fridge.decreaseTemperature();
	System.out.println("Main ended");
	}

}