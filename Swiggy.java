class Swiggy{
	public static void main(String[] food){
	
	String nonVegStarter[] = {"Chilli Chicken" , "Chicken Fry" , "Chicken Liver Fry" , "Mutton Keema Fry" , "Boti Fry" , "Chicken Dry" , "Nati Chicken Fry" , "Chicken Ghee Roast" , "French Chicken" , "Chicken Tandoori"};
	String vegStarter[] = {"Gobi Manchurian" , "Chilli Panner" , "Panner Manchurian" , "Mushroom Pepper" , "Panner Pepper Dry" , "Allo Pepper Dry" , "Gobi 65" ,"Gobi chilli" , "Baby corn Manchurian" , "Panner ghee roast"};
	String nonVegMainCourse[] = {"chicken manchurian gravy" ,"bannur mutton saaru" , "nalli curry" ,"kaima unde cury" ,"egg green cury" ,"mutton chops" ,"konkani egg cury" , "butter chicken"};
	String vegMainCourse[] = {"batani gojju" ,"dal tovve" , "mushroom cury" ,"ennegayi" , "Mixed veg kurma" , "masoppu" ,"kadala cury" ,"paneer butter masala" ,"dal fry" ,"veg noodles"};
	
	//System.out.println("The Non Veg Starters are :" + nonVegStarter[0]+ " , " + nonVegStarter[1]+ " , " + nonVegStarter[2]+ " , " + nonVegStarter[3]+ " , " + nonVegStarter[4]+ " , " + nonVegStarter[5]+ " , " + nonVegStarter[6]+ " , " + nonVegStarter[7]+ " , " + nonVegStarter[8]+ " , " + nonVegStarter[9])
	
	for(String nonvegstarters : nonVegStarter){
		System.out.println(nonvegstarters);
	}
	
	//System.out.println("The Veg Starters are :" + vegStarter[0]+ " , " + vegStarter[1]+ " , " + vegStarter[2]+ " , " + vegStarter[3]+ " , " + vegStarter[4]+ " , " + vegStarter[5]+ " , " + vegStarter[6]+ " , " + vegStarter[7]+ " , " + vegStarter[8]+ " , " + vegStarter[9])
	
	for(String vegstarters : vegStarter){
		System.out.println( vegstarters);
	}
	//System.out.println("The Non Veg Main Course are :" + nonVegMainCourse[0]+ " , " + nonVegMainCourse[1] + " , " + nonVegMainCourse[2]+ " , " + nonVegMainCourse[3]+ " , " + nonVegMainCourse[4]+ " , " + nonVegMainCourse[5]+ " , " + nonVegMainCourse[6]+ " , " + nonVegMainCourse[7]+ " , " + nonVegMainCourse[8]+ " , " + nonVegMainCourse[9])
	for(String nonvegmaincourses: nonVegMainCourse){
		System.out.println( nonvegmaincourses);
	}
	//System.out.println("The Veg Main Course are :" + vegMainCourse[0]+ " , " + vegMainCourse[1]+ " , " + vegMainCourse[2]+ " , " + vegMainCourse[3] + " , "+ vegMainCourse[4]+ " , " + vegMainCourse[5]+ " , " + vegMainCourse[6]+ " , " + vegMainCourse[7]+ " , " + vegMainCourse[8]+ " , " + vegMainCourse[9])
	for(String vegmaincourses : vegMainCourse){
		System.out.println (vegmaincourses);
	}
	}

}