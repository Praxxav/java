public class Employee { 
 protected String name,address,email; 
 protected int id,date,month,year; 
 protected long mobileno; 
 
 
 public Employee(String name,String address,String 
email,int id,int date,int month,int year,long mobileno) { 
 this.name=name; 
 this.address=address; 
 this.email=email; 
 this.id=id; 
 this.date=date; 
 this.month=month; 
 this.year=year; 
 this.mobileno=mobileno; 
 } 
 public void display() { 
 System.out.println("Name:"+name); 
 System.out.println("DOB:"+date+"/"+month+"/"+year); 
 System.out.println("Address:"+address+"\n Email:"+email+"\n Id:"+id+"\n mobileno:"+mobileno); 
 } 
} 






import java.util.Scanner; 
public class Programmer extends Employee{ 
 
double basic_pay; 
 public Programmer(String name, String address, String 
email, int id, int date, int month, int year, long mobileno) 
{ 
 super(name, address, email, id, date, month, year, 
mobileno); 
 
 } 
 
 public void accept() { 
 Scanner sc=new Scanner(System.in); 
 System.out.println("Enter basic pay:"); 
 basic_pay=sc.nextDouble(); 
 } 
 
 double HRA,DA,PF,SCF; 
public void calculate() { 
 
 DA=basic_pay*97/100; 
 HRA=basic_pay*10/1000; 
 PF=basic_pay*12/10; 
 SCF=basic_pay*0.1/100; 
 } 
 public void output() { 
 System.out.println("HRA:"+HRA +"\n DA:"+DA +"\n PF:"+PF
+"\n SCF:"+SCF); 
 } 
}
 







import java.util.Scanner; 
public class Team_Lead extends Employee{ 
double basic_pay; 
 public Team_Lead(String name, String address, String 
email, int id, int date, int month, int year, long mobileno) 
{ 
 super(name, address, email, id, date, month, year, 
mobileno); 
 
 } 
 
 public void accept() { 
 Scanner sc=new Scanner(System.in); 
 System.out.println("Enter basic pay:"); 
 basic_pay=sc.nextDouble(); 
 } 
 
 double HRA,DA,PF,SCF; 
public void calculate() { 
 
 DA=basic_pay*97/100; 
 HRA=basic_pay*10/1000; 
 PF=basic_pay*12/100; 
 SCF=basic_pay*0.1/100; 
 } 
 public void output() { 
 System.out.println("HRA:"+HRA+"\n DA:"+DA+"\n PF:"+PF+"\n SCF:"+SCF); 
 }
}









import java.util.Scanner; 
public class Assistant_Project_Manager extends Employee{ 
double basic_pay; 
 public Assistant_Project_Manager(String name, String 
address, String email, int id, int date, int month, int
year, long mobileno) { 
 super(name, address, email, id, date, month, year, 
mobileno); 
 
 } 
 
 public void accept() { 
 Scanner sc=new Scanner(System.in); 
 System.out.println("Enter basic pay:"); 
 basic_pay=sc.nextDouble(); 
 } 
 
 double HRA,DA,PF,SCF; 
public void calculate() { 
 
 DA=basic_pay*97/100; 
 HRA=basic_pay*10/1000; 
 PF=basic_pay*12/100; 
 SCF=basic_pay*0.1/100; 
 } 
 public void output() { 
 System.out.println("HRA:"+HRA+"\n DA:"+DA+"\n PF:"+PF+"\n SCF:"+SCF); 
 } 
} 




import java.util.Scanner; 
public class Project_Manager extends Employee{ 
double basic_pay; 
 public Project_Manager(String name, String address, 
String email, int id, int date, int month, int year, long
mobileno) { 
 super(name, address, email, id, date, month, year, 
mobileno); 
 
 } 
 
 public void accept() { 
 Scanner sc=new Scanner(System.in); 
 System.out.println("Enter basic pay:"); 
 basic_pay=sc.nextDouble(); 
 } 
 
 double HRA,DA,PF,SCF; 
public void calculate() { 
 
 DA=basic_pay*97/100; 
 HRA=basic_pay*10/1000; 
 PF=basic_pay*12/100; 
 SCF=basic_pay*0.1/100; 
 } 
 public void output() { 
 System.out.println("HRA:"+HRA+"\n DA:"+DA+"\n PF:"+PF+"\n SCF:"+SCF); 
 } 
}





import java.util.Scanner; 
public class Employee_op { 
public static void main(String[] args) { 
 int ch; 
 Scanner sc=new Scanner(System.in); 
 do { 
 System.out.println("1.Programmer"); 
 System.out.println("2.Team_Lead"); 
 System.out.println("3.Assistant_Project_Manager"); 
 System.out.println("4.Project_Manager"); 
 System.out.println("5.Exit"); 
 
 
 System.out.println("Enter your choice:"); 
 ch=sc.nextInt(); 
 switch(ch) { 
 case 1:Programmer p=new
Programmer("Rohit","Pune","xyz",34 , 27, 12, 
2004,937344786); 
 p.display(); 
 p.accept(); 
 p.calculate(); 
 p.output(); 
 break; 
 case 2: 
 Team_Lead t=new
Team_Lead("Yash","Pune","xyz",25 , 2, 1, 2004,937344786); 
 t.display(); 
 t.accept(); 
 t.calculate(); 
 t.output(); 
 break; 

 
 case 4: 
 Project_Manager m=new
Project_Manager("Rohit","Pune","xyz",34 , 27, 12, 
2004,937344786); 
 m.display(); 
 m.accept(); 
 m.calculate(); 
 m.output(); 
 break; 
 case 5: 
 System.out.println("Exit"); 
 
 
 } 
 }while(ch!=5); 
}
}

