package FileHandling;

	import java.io.File;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	
	public class printfDemo02 {
	public static void main(String[] args) throws IOException{
	File f = new File
	("H:/CSBatch4849Selenium/SeleniumBatch4849WorkSpace/CSTBatch5556/src/day6May23/b.txt");

	boolean res = f.createNewFile();
	System.out.println("res ="+res);

	FileWriter fw = new FileWriter(f,false);
	// char[] chArr = {'P','u','n','e'};
	// fw.write(chArr);
	// fw.close();
    //	String str = "I am learning java\nAt Cyber Success"
    //			   + "\n i am sure that I will a good job !!!";

	String str = "I have practiced a lot !!! and hence I know that "
			   + "I will get a good job! My name is khan, king khan!";

	fw.write(str);
	fw.close();
	System.out.println("------------");
	System.out.println("reading a file------>");

	FileReader fr = new FileReader(f);
	int ch;
	while ( (ch=fr.read()) != -1)
	System.out.println((char)ch);
	}
	}
