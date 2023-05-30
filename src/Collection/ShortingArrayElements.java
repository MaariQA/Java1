package Collection;

public class ShortingArrayElements {

	public static void main(String[] args) {

		int[] a = {7,9,1,4,3};
		int temp;
		for (int i=0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] < a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i=0; i<a.length; i++)
			System.out.println("Second largest no is" + a[i]);
	}
}
