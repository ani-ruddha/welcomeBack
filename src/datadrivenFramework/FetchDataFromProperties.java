package datadrivenFramework;
import java.io.FileInputStream;
import java.util.Properties;
public class FetchDataFromProperties {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream
				("D:\\Selenium folder\\Kcsm22Credentials.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
	String URL =	pobj.getProperty("url");
	String USERNAME =	pobj.getProperty("username");
	String PASSWORD =	pobj.getProperty("password");	
	System.out.println(URL);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);
		
	}
}







