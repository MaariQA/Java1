package Collection02;

public class Demo {
		static
		{
		System.out.println("Static block#1");
		}
		{
		System.out.println("instance block#1");
		}
		private Demo(int price)
		{
		System.out.println("******");
		}
		private int price;
		String color;
		protected float weight;
		int getPrice()
		{
		return 10;
		}
		void display()
		{
		System.out.println("Somethings getting displayed");
		}
		public static void main(String[] args){
		Demo d= new Demo(10);
		}
	}