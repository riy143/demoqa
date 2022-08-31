package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageModel.textBox;

public class textBoxTest extends Baseclass {
	@Test
	
	public void TextBoxFun() throws InterruptedException  {
		test=extent.createTest("textbox test");
		textBox tbox = new textBox(driver);
		driver.get("https://demoqa.com/elements");
		test.info("open url");
		tbox.Textbox();
		test.info("click on text box");
		tbox.Name("rajkumar patil");
		test.info("enter name");
		tbox.Usermail("rahul@gmail.com");
		test.info("enter mail");
		tbox.current_address("at aurangabad cidco");
		test.info("enter curent address");
		tbox.p_adress("beed gevrai");
		test.info("enter permenant address");
		Thread.sleep(4000);
	    tbox.submit();
		test.info("click on submit");
	   
		WebElement text = driver.findElement(By.xpath("//p[@id='name']"));
	    
	    Assert.assertEquals(text.getText(), "Name:rajkumar patil");
	    test.log(Status.PASS, "test pass succesfully");
		

		
		
		
		
		
		
	}


}
