package objectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This is a pom class for Homepage
 * @author Aniruddha
 */
public class Home_Page_Pom {
	@FindBy(xpath = "//div[text()='Time-Track']")
	private WebElement time;
	
	@FindBy(xpath = "//div[text()='Tasks']")
	private WebElement task;
	@FindBy(xpath = "//div[text()='Reports']")
	private WebElement reports;
	
	@FindBy(xpath = "//div[text()='Users']")
	private WebElement users;
	
	@FindBy(xpath = "(//div[@class='menu_icon'])[2]")
	private WebElement settings;
	@FindBy(xpath ="//a[text()='Logout']")
	private WebElement logout;

	public Home_Page_Pom(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}

	public WebElement getTime() {
		return time;
	}

	public WebElement getTask() {
		return task;
	}

	public WebElement getReports() {
		return reports;
	}

	public WebElement getUsers() {
		return users;
	}

	public WebElement getSettings() {
		return settings;
	}

	public WebElement getLogout() {
		return logout;
	}
/**
 * Business library for time	
 */
	public void clickTime()
	{
		getTime().click();
	}
	/**
	 * Business library for task
	 */
	public void clickTask()
	{
		getTask().click();
	}
	/**
	 * Business library for report
	 */
	public void clickReport() {
		getReports().click();
	}
	/**
	 * Business library for users
	 */
	public void clickUsers()
	{
		getUsers().click();
	}
	/**
	 * Business library for settings
	 */
	public void clickSettings()
	{
		getSettings().click();
	}
	/**
	 * Business library for logout
	 */
	public void clickLogout()
	{
		getLogout().click();
	}	
}












