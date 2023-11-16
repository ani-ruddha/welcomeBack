package objectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This is a POM class for Login page
 * @author Aniruddha
 */
public class Login_page_Pom {
	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement username;
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginbtn;
	public Login_page_Pom(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	/**
	 * this is a generic method to perform login Operation
	 * @param User
	 * @param Pass
	 */
	public void loginOperation(String User , String Pass)
	{
		getUsername().sendKeys(User);
		getPassword().sendKeys(Pass);
		getLoginbtn().click();
	}
	
}








