import java.util.Scanner;

public class converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter the code  corresponding codes for conversion");
		System.out.println("3 for weight");
		System.out.println("4 for temperatures");
		System.out.println("5 for lengths");
		int a = input.nextInt();
	if ( a == 3) {
		System.out.println("conversion of weight from kilograms(Kg) to pound(lbs)");
		System.out.print("enter your weight in kgs");
		double x = input.nextDouble();
		double y = 2.205*x;
		System.out.println("your weight in pounds is "+y+" lbs");
	}
	else if (a == 4) {
		System.out.println("conversion of temperature from celcius to fahrenheit");
		System.out.println("enter the temperature in celcius");
		double c = input.nextDouble();
		double k = c+273 ;
		double t = (9*c)/2 + 32 ;
		System.out.println("the temperature in fahrenheit is "+t+ "degree fahrenheit");
		System.out.println("the temperature in kelvin is "+k+ "degree kelvin");
	}
	else if (a == 5) {
		System.out.println("conversion of length from centimeters to different forms");
		System.out.println("enter the length in centimeters");
		double cm = input.nextDouble();
		double m = cm/100;
		double mm = cm*10;
		double km = cm/100000;
		double in = cm/(2.5);
		double ft = cm/30;
		System.out.println("lenth in meters(m) is: "+m);
		System.out.println("lenth in millimeters(mm) is: "+mm);
		System.out.println("lenth in kilometers(km) is: "+km);
		System.out.println("lenth in inches(in) is: "+in);
		System.out.println("lenth in feet(ft) is: "+ft);	
	}
	if (3<=a && 5>=a) {
		System.out.println("thanks for using this converter");
	}
	if (a>5)
	{ System.out.println("enter a code in the range");}
	
	
	
	
		
	}

}
