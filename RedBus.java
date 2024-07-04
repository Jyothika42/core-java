class RedBus{

public static void main(String[] bus){

String busNames[] ={"Volvo" , "Rajahamsa", "SRS","Sugama", "Sea Bird", "Vrl","Airavata"};
String founder = "";
String headQuaters = "Bengaluru";
int dateFounded = 2006;

System.out.println("Date Founded : " + dateFounded);
System.out.println("It is located in :" + headQuaters );
System.out.println("no of bus available is " + busNames.length);
System.out.println("List of Buses Available");
//System.out.println(busNames);

for(int ref = 0 ; ref < busNames.length ; ref++){
	           // return value or ref
String value = busNames[ref];
System.out.println(value);
} 



}

}