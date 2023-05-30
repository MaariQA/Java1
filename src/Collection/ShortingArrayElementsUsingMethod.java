package Collection;

public class ShortingArrayElementsUsingMethod {

	public static  void ShortAsc(int[] a, char ch) {
		int temp;
		if(ch == 'a' || ch == 'A' || ch == 'D' || ch == 'd')
		{
			for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a.length;j++)
		{
			if(ch == 'A' || ch =='a' ) 
		{
			if(a[i]> a[j])
		{
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		}
			else if(ch == 'D' || ch == 'd') 
		{
			if(a[i]< a[j])
		{
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
	}}}}}
			else
			System.out.println("Array will not sort and you will see original array");
		}
			static void printArray(int[] a, char asDesc)
		{
			if(asDesc == 'A' || asDesc == 'a')
			System.out.println("Asc sorted list =>");
			
			else if(asDesc == 'D' ||  asDesc == 'd')
			System.out.println("Desc sorted list =>");
			
			else
			System.out.println("Original list =>");
			
			for(int i=0;i<a.length;i++)
			System.out.println(a[i] + " ");
			}
			public static void main(String[] args) {
				char ascDesc = 'e';
				int[]a = {7,9,1,4,3};
				ShortAsc(a,ascDesc);
				printArray(a,ascDesc);
			}
		}