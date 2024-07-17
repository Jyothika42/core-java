class Add{

    public static void add(byte num1, byte num2) {
        System.out.println("byte addition " + (num1 + num2));
    }

    public static void add(short age, short num1, short num2, short num3) {
		
        System.out.println("short addition " + (age + num1 + num2 + num3));
		if(age >= 18){ 
		 System.out.println("You are eligible to vote");
		 
		}else{
			System.out.println("your not eligible to vote");
		}
		
		System.out.println("short addition " + age);
        
		return;
		
    }
	
		
	
}
	


