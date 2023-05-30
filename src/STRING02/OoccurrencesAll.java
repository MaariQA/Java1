package STRING02;
public class OoccurrencesAll {
	public static void main(String[] args) {
		String str =  "All Indians are my brother and sister";
		for (char ch = 'a', ch1 = 'A'; ch <= 'z' && ch1 <= 'Z'; ch++, ch1++) {
			int cnt = 0,cnt1 = 0;
			for(int i=0; i<str.length();i++) {
			if(ch == str.charAt(i))
					cnt++;
			}
			if(cnt == 1)    // unique occurrences
				System.out.println(ch +"occurred"+cnt +"times");
			
			if(cnt == 1)    // unique occurrences
				System.out.println(ch +"occurred"+cnt1 +"times");
		}
	}
}
