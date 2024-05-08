abstract public class shape {
protected float a;
 abstract public void computeArea();
 }



import java.util.Scanner;
public class circle extends shape{
 float area;
 public void getdata() {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter radius:");
 a=sc.nextFloat();
 }
 public void computeArea() {
 area=(float) (3.14*a*a);
 }
 public void display() {
 System.out.println("Area of circle:"+area);
 }
}





import java.util.Scanner;
public class rectangle extends shape{
 float breadth,area;
 public void getdata() {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter length and breadth of Rectangle:");
 a=sc.nextFloat();
 breadth=sc.nextFloat();
 }
 public void computeArea() {
 area=a*breadth;
 }
 
 public void display() {
 System.out.println("Area of Rectangle:"+area);
 }
}



import java.util.Scanner;
public class triangle extends shape{
 float b,area;
 
 public void getdata() {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter base and height of the Triangle:");
 a=sc.nextFloat();
 b=sc.nextFloat();
 }
 
 public void computeArea() {
 area=(float) (0.5*a*b);
 }
 public void display() {
 System.out.println("The area of Triangle:"+area);
 }
}




import java.util.Scanner;
public class Main {
public static void main(String[] args) {
 int ch;
 shape s;
 Scanner sc=new Scanner(System.in);
 do {
 System.out.println("1.Area of Circle");
 System.out.println("2.Area of Rectangle ");
 System.out.println("3.Area of Triangle");
 System.out.println("4.Exit");
 System.out.println("Enter your choice:");
 ch=sc.nextInt();
 switch(ch){
 case 1: circle c=new circle();
s=new circle();
 c.getdata();
 s.computeArea();
 c.display();
 break;
 
 case 2: rectangle r=new rectangle();
 s=new rectangle();
 r.getdata();
 s.computeArea();
 r.display();
 break;
case 3: triangle t=new triangle();
s=new triangle();
 t.getdata();
 s.computeArea();
 t.display();
 break;
 
 default: System.out.println("Invalid Choice:") ; 
 }
 }while(ch!=4);
}
}
		

