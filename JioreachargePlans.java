class JioreachargePlans{

	public static double getReachargPriceByName(String reachargePlan){
	
	double rechargePrice = 0.0;
	if(reachargePlan ==  "365 Days" ){
		rechargePrice = 3599.00;
		return rechargePrice;
	}
	if(reachargePlan == "98 Days"){
		rechargePrice = 999.00;
		return rechargePrice;
	}
	if(reachargePlan == "28 Days"){
		rechargePrice = 349.0.;
		return rechargePrice;
	}
	if(reachargePlan == "84 Days"){
		rechargePrice = 1299.00;
		return rechargePrice;
	}
	if(reachargePlan == "30 Days"){
		rechargePrice = 359.00;
		return rechargePrice;
	}
	if(reachargePlan == "1 Day Data Only"){
		rechargePrice = 49.00;
		return rechargePrice;
	}
	if(reachargePlan == "Active Plan 12GB"){
		rechargePrice = 139.00;
		return rechargePrice;
	}
	if(reachargePlan == "Active Plan 6GB"){
		rechargePrice = 69.00;
		return rechargePrice;
	}
	if(reachargePlan == "336 Days"){
		rechargePrice = 895.00;
		return rechargePrice;
	}
	if(reachargePlan == "23 Days"){
		rechargePrice = 125.00;
		return rechargePrice;
	}
	if(reachargePlan == "30 Days Data"){
		rechargePrice = 359.00;
		return rechargePrice;
	}
	if(reachargePlan == "28 Days Data 10GB"){
		rechargePrice = 175.00;
		return rechargePrice;
	}
	if(reachargePlan == "28 Days Data 2GB"){
		rechargePrice = 26.00;
		return rechargePrice;
	}
	if(reachargePlan == "56 Days"){
		rechargePrice = 234.00;
		return rechargePrice;
	}
	if(reachargePlan == "90 Days"){
		rechargePrice = 899.00;
		return rechargePrice;
	}else{
		System.out.println("reachargePlan " + "not found");
	}
	return rechargePrice;
	}

}