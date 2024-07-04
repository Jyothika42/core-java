class MasalaNoodels {
	
	static String name = "Maggi";
	static int datefounded = 1884;
	static int itemWeightInGms = 70;
	static String dietType = "Vegetarian";
	static String ingredients[] = {"kcal","Protein","Carbohydrrate","Sodium","Fiber","Calcium"};
	
public static void main(String[] noodels){
	System.out.println(" The Brand Name is : "  + name);
	System.out.println(" The Founded year of" + name + " is " + datefounded);
	System.out.println(" The Item Weight In Gms : " + itemWeightInGms);
	System.out.println(" The Diet Type  : " + dietType);
	System.out.println(" Ingredients of " + name + " are ");
	for(String ingredient :  ingredients){
	System.out.println(ingredient);
	}



 }

}