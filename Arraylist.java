
import java.util.*;
public class Array_list {
private ArrayList<Integer> list =new 
ArrayList<Integer>();
private ArrayList<Integer> even =new 
ArrayList<Integer>();
private ArrayList<Integer> odd =new 
ArrayList<Integer>();
private ArrayList<Integer> prime =new 
ArrayList<Integer>();
private ArrayList<String> Stringlist =new 
ArrayList<String>();
private ArrayList<String> Palindromelist =new 
ArrayList<String>();
public void getdata()
{
Scanner sc = new Scanner(System.in);
int element;
int num;
System.out.println("Enter no. of elements:");
element=sc.nextInt();
for(int i=0;i<element;i++)
{
System.out.println("Enter numbers:");
num=sc.nextInt();
list.add(num);
}
}
public void evenodd()
{
for (int i=0;i<list.size();i++)
{
if (list.get(i)%2==0)
{
even.add(list.get(i));
}
else 
{
odd.add(list.get(i));
}
}
}
public void prime()
{
int i,j,flag=0;
for (i=0;i<list.size();i++)
{
flag=0;
for(j=2;j<Math.sqrt(list.get(i));j++)
{
if (list.get(i)%j==0)
{
flag= 1;
break;
}
}
if (flag==0 && list.get(i) !=1)
{
prime.add(list.get(i));
}
}
}
public void dispaly()
{
System.out.println("List:"+list);
System.out.println("Even numberslist:"+even);
System.out.println("Odd numbres list:"+odd);
System.out.println("Prime numbres 
list:"+prime);
}
public void addstrings()
{
Scanner sc = new Scanner(System.in);
int num;
System.out.println("Enter the number of strings 
you want to insert:");
num=sc.nextInt();
String s1;
for (int i=0;i<num;i++)
{
System.out.println("Enter Strings:");
s1=sc.next();
Stringlist.add(s1);
}
}
public void get_plaindrome_String()
{
for (int i=0;i<Stringlist.size();i++)
{
String s1 = Stringlist.get(i);
boolean ispalindrom = 
checkPlaindrome(s1);
if (ispalindrom)
{
Palindromelist.add(s1);
}
}
System.out.println("Palindrome 
Strings:"+Palindromelist);
}
private boolean checkPlaindrome(String s1)
{
StringBuilder reversed = new 
StringBuilder(s1).reverse();
return s1.equals(reversed.toString());
}
}





import java.util.*;
public class Arraylist_op {
public static void main(String[] args) {
Array_list obj =new Array_list() ;
int ch ;
Scanner sc =new Scanner (System.in);
do 
{
System.out.println("1. For Integer");
System.out.println("2. For String");
System.out.println("3. Exit");
ch=sc.nextInt();
switch (ch)
{
case 1:
{
obj.getdata();
obj.evenodd();
obj.prime();
obj.dispaly();
break ;
}
case 2 :
{
obj.addstrings();
obj.get_plaindrome_String();
break ;
}
}
}while(ch !=3);
}
}

