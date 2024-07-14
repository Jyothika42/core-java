class InsurancePackage{

	public static double getInsurancePriceByName(String insuranceName){
	
	double insurancePrice = 0.0;
	if(insuranceName ==  "Hdfc Life Insurance" ){
		insurancePrice = 5000.70;
		return insurancePrice;
	}
	if(insuranceName == "Max Life"){
		insurancePrice = 8500.50;
		return insurancePrice;
	}
	if(insuranceName == "LIC"){
		insurancePrice = 8000.70;
		return insurancePrice;
	}
	if(insuranceName == "Max Life Insurance"){
		insurancePrice = 50000.54;
		return insurancePrice;
	}
	if(insuranceName == "ICIC"){
		insurancePrice =  9004.45;
		return insurancePrice;
	}
	if(insuranceName == "Bandhan Life iTerm Prime"){
		insurancePrice = 45523.2;
		return insurancePrice;
	}
	if(insuranceName == "Mera Term Plan Plus"){
		insurancePrice = 20000.45;
		return insurancePrice;
	}
	if(insuranceName == "SBI Life Insurance"){
		insurancePrice =  85000.50;
		return insurancePrice;
	}
	if(insuranceName == "Bjaj"){
		insurancePrice = 78500.8;
		return insurancePrice;
	}
	if(insuranceName == "TATA AIA Life Insurance"){
		insurancePrice = 30400.5;
		return insurancePrice;
	}
	if(insuranceName == "Sahara Iindia Life Insurance"){
		insurancePrice = 8236.78;
		return insurancePrice;
	}else{
		System.out.println("insuranceName " + "not found");
	}
	return insurancePrice;
	}

}