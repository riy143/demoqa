package TestCase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	


		
		
		public  static  ExtentReports extent;
		public static ExtentTest  test;
		public  static ExtentSparkReporter reporter;
		public static WebDriver driver;
		@BeforeTest
		public void browserInt() {
			
			
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			reporter = new ExtentSparkReporter(".//Report//extent.html");
			reporter.config().setReportName("flipkart");
			reporter.config().setDocumentTitle("flipkart eccomerse");
			extent=new ExtentReports();
			extent.attachReporter(reporter);
			
			
			
			
			
		}
		
		
		
		
		
		@AfterTest
		public void tearDown() {
		
			//driver.close();
			extent.flush();
			
		}
		

	}



