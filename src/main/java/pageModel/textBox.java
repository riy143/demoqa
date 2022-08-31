package pageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class textBox {
public WebDriver driver;
Actions act;
	public textBox(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy (id="item-0")
	WebElement text;
	@FindBy (id="userName")
	WebElement Fname;
	@FindBy (id="userEmail")
	WebElement mail;
	@FindBy (id="currentAddress")
	WebElement current;
	@FindBy (id="permanentAddress")
	WebElement permenant;
	@FindBy (xpath="//button[@id='submit']")
	WebElement Sub;
	
	
	public void Textbox() {
		text.click();
	}
	public void Name(String name) {
		
		Fname.sendKeys(name);
		
	}
	public void Usermail(String Mail) {
		mail.sendKeys(Mail);
	}
	public void current_address(String add) {
		current.sendKeys(add);
	}
	public void p_adress(String adress) {
		permenant.sendKeys(adress);
	}
	public void submit() {
		Actions act=new  Actions(driver);
		act.moveToElement(Sub).click().build().perform();
		//Sub.click();
	}
}
