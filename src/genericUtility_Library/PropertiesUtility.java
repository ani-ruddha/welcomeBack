package genericUtility_Library;
import java.io.FileInputStream;
import java.util.Properties;
/**
 * this class is for properties utility
 * @author Aniruddha
 */
public class PropertiesUtility {
	/**
	 * this is a generic method to use properties Data
	 * @param data
	 * @return
	 * @throws Exception
	 */
	public String getDataFromProperties(String data)throws Exception
	{
		FileInputStream fis = new FileInputStream
				(IconstantUtility.propertiesPath);
		Properties pobj = new Properties();
		pobj.load(fis);
		String value =	pobj.getProperty(data);
		return value;
	}
}





