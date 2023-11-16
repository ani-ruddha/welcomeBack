package genericUtility_Library;
import java.util.Random;
/**
 * This class is for Java related reusable methods
 * @author Aniruddha
 */
public class JavaUtility {
/**
 * This a generic method to generate Random number
 * @return
 */
	public int createRandomNumber()
	{
		Random r = new Random();
		int num = r.nextInt(1000);
		return num;
	}
}
