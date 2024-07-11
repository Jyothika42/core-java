class IronBoxRunner{

	public static void main(String[] philips){
	System.out.println("Main started");
	
			//invoking a method
	boolean connect = IronBox.onOrOff();
	System.out.println("is IronBox connected : " + connect);
	
	
	IronBox.increaseTemperature();
	IronBox.increaseTemperature();
	IronBox.increaseTemperature();
	IronBox.increaseTemperature();
	IronBox.increaseTemperature();
	IronBox.increaseTemperature();
	IronBox.increaseTemperature();
	IronBox.increaseTemperature();
	
	
	IronBox.decreaseTemperature();
	IronBox.decreaseTemperature();
	IronBox.decreaseTemperature();
	IronBox.decreaseTemperature();
	IronBox.decreaseTemperature();
	IronBox.decreaseTemperature();
	IronBox.decreaseTemperature();
	IronBox.decreaseTemperature();
	
	
	
	connect = IronBox.onOrOff();
	System.out.println("is IronBox connected : " + connect);
	
	System.out.println("The IronBox connected " + connect);
	IronBox.increaseTemperature();
	IronBox.decreaseTemperature();
	System.out.println("Main ended");
	}

}