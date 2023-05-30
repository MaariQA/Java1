package FileHandling02;

import java.io.File;
import java .io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {
	
	public static void main(String[] args) throws IOException {
		
	String rootpath = System.getProperty("user.dir");
	System.out.println("rootPath:" + rootpath);
	String fn = rootpath + "\\src\\day9May23\\" + "file_"+ 
	System.currentTimeMillis() + ".txt";
	
	System.out.println("rootPath:" + rootpath);
	
	File f = new File(fn);
	boolean res = f.createNewFile();
	if (res)
		System.out.println("file create :" + fn);
	else
		System.out.println("file didn't create :" + fn);
	
	FileWriter fw = new FileWriter(f);
	String str  = " My name is Mayur\n I am learning java\nI am appearing interview for Googl icn.. wish me luck !!!";
	fw.write(str);
	fw.close();
	
	FileReader fr = new FileReader(f);
	int ch;
	while ((ch = fr.read())!= -1)
		System.out.print((char)ch);
	fr.close();
	}
}

