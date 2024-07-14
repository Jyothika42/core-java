class InsurancePackageRunner{

	public static void main(String[] insurance){
	
	String lifeInsurance = "Hdfc Life Insurance";
	double price = InsurancePackage.getInsurancePriceByName(lifeInsurance);
	System.out.println( lifeInsurance +  " name  is :" + price);
	}


}