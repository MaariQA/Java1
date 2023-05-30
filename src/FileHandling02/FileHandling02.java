package FileHandling02;
import java.io.File;
import java.io.IOException;

public class FileHandling02 {
	public static void main(String[] args) throws IOException {
String fn =
"H://CSBatch4849Selenium\\SeleniumBatch4849WorkSpace\\CSTBatch5758CCP\\src\\day9May23\\a.txt";
	String projectPath = System.getProperty("user.dir");    				
	File f = new File(fn);
	boolean res = f.createNewFile();
	if(res) // res == true
		System.out.println("File is created:" + fn);
	else
		System.out.println("File is not created:" + fn);
	}
}


	


