


import java.util.*;
 class Complex_No{
	float real,img;
	public Complex_No(){
		
		real=0;
		img=0;
	}
	public Complex_No(float a ,float b){
		
		real=a;
		img=b;
	}

	public void Display(Complex_No C1,Complex_No C2) {
		System.out.println("First Complex Numbers =("+C1.real+")+("+C1.img+")i");
		
		System.out.println("Second Complex Numbers =("+C2.real+")+("+C2.img+")i");
		
	}

	public void AddNumbers(Complex_No C1,Complex_No C2) {
		
		float real,img;
		real=(C1.real+C2.real);
		
		img=(C1.img+C2.img);
	
		System.out.println("Addition of Complex Numbers =("+real+")+("+img+")i");
		
	}

	public void SubNumbers(Complex_No C1,Complex_No C2) {
		
		float real,img;
		real=(C1.real-C2.real);
		
		img=(C1.img-C2.img);
	
		System.out.println("Substraction of Complex Numbers =("+real+")+("+img+")i");
		
	}

	public void MultiNumbers(Complex_No C1,Complex_No C2) {
	
		float real,img;
		real=(C1.real*C2.real-C1.img*C2.img);
		
		img=(C1.real*C2.img+C1.img*C2.real);
		
		System.out.println("Multiplication of Complex Numbers =("+real+")+("+img+")i");
		
	}

	public void DivNumbers(Complex_No C1,Complex_No C2) {
		
		float real,img;
		real=(C1.real*C2.real+C1.img*C2.img)/(C2.real*C2.real+C2.img*C2.img);
	
		img=(C1.img*C2.real-C1.real*C2.img)/(C2.real*C2.real+C2.img*C2.img);
	
		System.out.println("Division of Complex Numbers =("+real+")+("+img+")i");
		
	}

}

//======================= CLASS Main =======================//
public class com{

	public static void main(String[] args) {
		float num1,num2;
		Complex_No cal=new Complex_No();
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the Complex number in a+bi format : ");

		
		System.out.print("Enter real part of First Number: a : ");
		num1=Sc.nextFloat();
		System.out.print("Enter img part of First Number: b : ");
		num2=Sc.nextFloat();
		Complex_No Com1=new Complex_No(num1,num2);

		
		System.out.print("Enter real part of Second Number: a : ");
		num1=Sc.nextFloat();
		System.out.print("Enter img part of Second Number: b : ");
		num2=Sc.nextFloat();
		Complex_No Com2=new Complex_No(num1,num2);
		Sc.close();

		System.out.print("\n");
		cal.Display(Com1,Com2);
		
		System.out.print("\n");
		cal.AddNumbers(Com1,Com2);
	
		cal.SubNumbers(Com1,Com2);
	
		cal.MultiNumbers(Com1,Com2);
	
		cal.DivNumbers(Com1, Com2);
	

	}

}


/*
 
OUTPUT
 
Enter the Complex number in a+bi format : 
Enter real part of First Number: a : 4
Enter img part of First Number: b : 5.3
Enter real part of Second Number: a : 2.7
Enter img part of Second Number: b : -6.4
First Complex Numbers =(4.0)+(5.3)i
Second Complex Numbers =(2.7)+(-6.4)i
Addition of Complex Numbers =(6.7)+(-1.0999999)i
Substraction of Complex Numbers =(1.3)+(11.700001)i
Multiplication of Complex Numbers =(44.72)+(-11.29)i
Division of Complex Numbers =(-0.479171)+(0.82715017)i
*/
