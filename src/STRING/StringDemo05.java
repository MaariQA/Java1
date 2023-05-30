package STRING;
public class StringDemo05 {
	public static void main(String[] args) {
        

	char[] chars = {'a', 'b', 'c', 'd'};
		String str = "abc";
		char[] charArray  = str.toCharArray();
        System.out.println("Original char array:");

		for(int i=0; i<chars.length;i++) {
			System.out.print(chars[i]+" ");
		}	
		System.out.println("\nStrig array");
		for(int i=0; i<charArray.length;i++) {
			System.out.print(charArray[i]+" ");
		}
		System.out.println("\n Reversed char array:");
		int left = 0; 
		int right = chars.length-1;
		while (left<= right) {
			char ch = chars[left];
			chars[left]= chars[right];
			chars[right]= ch;

			left++;
			right--;
		}
		for(int i=0;i<chars.length;i++) {
			System.out.print(chars[i]+" ");
		}}
	}


