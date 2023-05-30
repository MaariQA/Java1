package forloop;
import java.util.Scanner ;
public class PrimeNOEvOdd {
public static void main(String[] args) {
int no,r, i;
Scanner sc=new Scanner (System.in);
System.out.println("Enter no");
no=sc.nextInt();
for(i=2;i<=(no/2); i++) { 
		r=no%i;
if(r==0) {
System.out.println("Factor:"+i);
break;
}}
String a=(no%2==0)?"Even":"Odd";

//String evenodd;
//if(no%2==0)
//	//evenodd="Even";
//else
//	evenodd="odd";

if(i==(no/2)+1) 
System.out.println(no+"is a prime no and is "+ a+"no");
else 
System.out.println(no+" is not a prime no and is"+a+"no");
}}




