public class bag1 {
private int wt;
private String col;
private static int total_object=0;
private static int total_weight=0;
public bag1()
{
col="red";
wt=10;
total_object=total_object+1;
total_weight=total_weight+wt;
}
public bag1(String col,int wt)
{
this.col=col;
this.wt=wt;
total_object=total_object+1;
total_weight=total_weight+wt;
}
public bag1(String col)
{
this.col=col;
wt=10;
total_object=total_object+1;
total_weight=total_weight+wt;
}
public bag1(int wt)
 {
this.wt=wt;
col="red";
total_object=total_object+1;
total_weight=total_weight+wt;
}
public void display(int i)
{
i=i+1;
System.out.println(i+" "+ col+" "+wt);
}
public static void accept() {
System.out.println("Total Objects;");
System.out.println("Total Weight:");
}
public static void output() {
System.out.println("total_object:"+total_object+"\n"+"total_weight:"+total_weight);
}
}




import java.util.Scanner;
public class bag1_op {
public static void main(String[] args) {
bag1 obj[]=new bag1[10];
int ch1,ch2;
int w;
String c;
int n=0;
try (Scanner in = new Scanner(System.in)) {
do
{
System.out.println("1:Add:");
System.out.println("2:Display:");
System.out.println("3:Exit");
System.out.println("Enter the choice:");
ch1=in.nextInt();
switch(ch1)
{
case 1:
do
{
System.out.println("1:Both Default");
System.out.println("2:Both from user");
System.out.println("3:Value of colour from user");
System.out.println("4:Value of weight from user");
System.out.println("5:Exit");
 System.out.println("Enter the Choice:");
 ch2=in.nextInt();
 switch(ch2)
{
case 1:
 obj[n]=new bag1();
n=n+1;
System.out.println("Ball is added");
break;
case 2:
System.out.println("Enter Weight of ball:");
w=in.nextInt();
System.out.println("Enter Colour of ball:");
c=in.next();
obj[n]=new bag1(c,w);
 n=n+1;
 System.out.println("Ball is added");
break;
case 3:
System.out.println("Enter Colour of ball:");
c=in.next();
obj[n]=new bag1(c);
n=n+1;
System.out.println("Ball is added");
break;
case 4:
System.out.println("Enter Weight of ball:");
w=in.nextInt();
obj[n]=new bag1(w);
 n=n+1;
 System.out.println("Ball is added");
break;
case 5:
System.out.println("Exit");
break;
}
 }while(ch2!=5);
 case 2:
for(int i=0;i<n;i++) {
obj[i].display(i);
}
bag1.output();
break;
case 3:
System.out.println("Exit");
break;
}
}while(ch1!=3);
 }
 }
 }
