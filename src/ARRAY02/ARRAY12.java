// LINER SUCHAR
package ARRAY02;
public class ARRAY12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr= {1,2,5,7,8,9,10,13,17,12};
int a=8,i=0;
boolean ispresent = false;
while (i<arr.length) { 
if (a==arr[i]) {
ispresent=true;
break;
}
i++;
}
System.out.println(ispresent?"present":"not present");
}}