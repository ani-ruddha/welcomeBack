package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this is a pom class for task module
 * @author Aniruddha
 */
public class Task_Page_Pom {

	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addNew;
	
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	private WebElement newCustomer;
	
	@FindBy(xpath ="//div[@class='item createNewProject']")
	private WebElement newProject;
	
	@FindBy(xpath="//div[@class='item createNewTasks']")
	private WebElement newTasks;
	
	@FindBy(xpath ="//div[@class='item importTasks']")
	private WebElement importReport;
	
	@FindBy(xpath ="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement customerName;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerDesc;
	
	@FindBy(xpath ="//div[text()='Create Customer']")
	private WebElement create;
	
	@FindBy(xpath ="(//div[text()='Cancel'])[28]")
	private WebElement cancel;

	public Task_Page_Pom(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getAddNew() {
		return addNew;
	}

	public WebElement getNewCustomer() {
		return newCustomer;
	}

	public WebElement getNewProject() {
		return newProject;
	}

	public WebElement getNewTasks() {
		return newTasks;
	}

	public WebElement getImportReport() {
		return importReport;
	}

	public WebElement getCustomerName() {
		return customerName;
	}

	public WebElement getCustomerDesc() {
		return customerDesc;
	}

	public WebElement getCreate() {
		return create;
	}

	public WebElement getCancel() {
		return cancel;
	}
	/**
	 * Business library for addnew Button
	 */
	public void clickOnAddNeW()
	{
		getAddNew().click();
	}
	/**
	 * Business library for new Customer
	 */
	public void clickNewCustomer()
	{
		getNewCustomer().click();
	}
	/**
	 * Business library for new Project
	 */
	public void clickNewProject()
	{
		getNewProject().click();
	}
	/**
	 * Business library for new task
	 */
	public void clickNewtasks()
	{
		getNewTasks().click();
	}
	
	/**
	 * Business library for import report
	 */
	public void ClickImportReport()
	{
		getImportReport().click();
	}
	/**
	 * Business library for creating user with only customer name
	 */
	public void createUser(String cname)
	{
		getCustomerName().sendKeys(cname);
		getCreate().click();
	}
	/**
	 * Business library for creating user with only customer name
	 */
	public void createUser(String cname , String desc)
	{
		getCustomerName().sendKeys(cname);
		getCustomerDesc().sendKeys(desc);
		getCreate().click();
	}
	/**
	 * Business library for cancel user with only customer name
	 */
	public void cancelToCreateUser(String cname)
	{
		getCustomerName().sendKeys(cname);
		getCancel().click();
	}
	/**
	 * Business library for cancel user with only customer name and customer description
	 */
	public void cancelToCreateUser(String cname , String desc)
	{
		getCustomerName().sendKeys(cname);
		getCustomerDesc().sendKeys(desc);
		getCancel().click();
	}
}














