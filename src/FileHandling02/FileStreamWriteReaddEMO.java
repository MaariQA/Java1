package FileHandling02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamWriteReaddEMO{
	
	public static void main(String[] args) throws IOException {
		// How to get system environment variable value
		// String os1 = System.getProperty("os.name");
		// System.out.println(os1);
		// System.out.println(system.getnv("os"));
		// String fn = System.getProperty("user.dior") +"\\src\\day9May23\\c.txt";
		
		String fn = "H:\\CSTBatch5556Java\\day16Mar23\\ContinueDemo.class";
		
		File f = new File(fn);
		f.createNewFile();
		
		/* FileOutputStream fos = new FileOutputStream(f);
		 * String str = "My Country name is India";
		 * fos.write(ba);
		 * fos.close();
		 */
		
		FileInputStream fis = new FileInputStream(f);
		byte[] bal = fis.readAllBytes();
		for(byte x: bal)
			System.out.println(x);
	}
}