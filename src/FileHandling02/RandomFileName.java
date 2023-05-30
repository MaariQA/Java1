package FileHandling02;

import java.util.Random ;

public class RandomFileName {

	static String genrateRandomFileName(int maxLean) {
		String charSet =
				"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		String fn ="";
		for(int i=0; i<maxLean; i++) 
		{
			Random random = new Random();
			int randomInd = random.nextInt(charSet.length());

			char chr = charSet.charAt(randomInd);
			fn = fn + chr;
		}
		return fn;
	}
	public static void main(String[] args) {
		int cnt = 1;
		while(cnt<=10)
		{
			String fn = genrateRandomFileName(20);
			System.out.println("fileName:" +fn);
			cnt++;
		}
	}
}