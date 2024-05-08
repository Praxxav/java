public class Complex {
	private int real,img;
	
 public Complex() {
		real=0;
		img=0;
	}
	public Complex(int real,int img) {
		this.real=real;
		this.img=img;
		
	}
	public void add(Complex x,Complex y) {
		real=x.real+y.real;
		img=x.img+y.img;
		
		System.out.print("The addition of complex number is :");
		System.out.println(real+ "+" +img + "i");
	}
	public void sub(Complex x,Complex y) {
		real=x.real-y.real;
		img=x.img-y.img;
		
		System.out.print("The substraction  of complex number is:");
		System.out.println(real+ "+" +img + "i");
	}
	public void mult(Complex x,Complex y) {
		real=x.real*y.real;
		img=x.img*y.img;
		
		System.out.print("The multiplication of two complex number  is:");
		System.out.println(real+ "+" +img + "i");
			
	}
	
	public void div(Complex x,Complex y) {
		real=x.real/y.real;
		img=x.img/y.img;
		
		System.out.println("The division of complex numberis:");
		System.out.println(real+ "+" +img + "i");
	}

}




import java.util.Scanner;

public class ComplexOperations {

	public static void main(String[] args) {
		int r1,i1,r2,i2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First complex number:");
		r1=sc.nextInt();
		i1=sc.nextInt();
		
		System.out.println("Enter Second complex number:");
		r2=sc.nextInt();
		i2=sc.nextInt();
		
		Complex c1=new Complex(r1,i1);
		Complex c2=new Complex(r2,i2);
		Complex c3=new Complex();
		Complex c4=new Complex();
		Complex c5=new Complex();
		Complex c6=new Complex();
				
		c3.add(c1, c2);
		c4.sub(c1, c2);
		c5.mult(c1, c2);
		c6.div(c1, c2);
				
	}
}
