package Array;
public class ArrayCla09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]Country= new String[3];    // Default value
		System.out.println("Country Array :"+ Country.length);
		
		for(int i=0; i<Country.length; i++)
		System.out.println(Country[i]);
		String[]City= new String []
				{"Pune","Kolhapur","Satara","Nashik"};
		
		System.out.println("City array.length:"+City.length);
		
		for(int i=0; i<City.length; i++)
			System.out.println("City :"+City[i]);
	}
}
