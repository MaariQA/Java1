package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class printfDemo03 {
	public static void main(String[] args) throws IOException{
		File f = new File
				("H:/CSBatch4849Selenium/SeleniumBatch4849WorkSpace\\CSTBatch5556/src/day6May23/b.txt");
		if (f.createNewFile())
			System.out.println("File Create...");
		else
			System.out.println("File Not create...");
		
		FileOutputStream fos = new FileOutputStream(f);
		// byte[] ba = {'p','u','n','e'};
		String str = "We are write a file using output stream ..";
		byte[]ba = str.getBytes();

		fos.write(ba);
		fos.close();

		FileInputStream fis = new FileInputStream (f);
		int ch;
		while((ch=fis.read())!= -1)
			System.out.println((char)ch);
	}
}
