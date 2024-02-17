package Maven_Testng.TestNG_IFSM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	 WebDriver driver;
//	package Maven_Testng.TestNG_IFSM;
  @Test(priority=1)
  public void Testcase() throws InterruptedException {
	  Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gl@gmail.com");
  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Abcd1234");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	 Thread.sleep(4000);
	  driver.navigate().refresh();
	 
  }
  @Test(priority=2)
  public void Testcase1() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//a[@activeclassname='active'][2]")).click();
  }
  @Test(priority=3)
  public void Testcase2() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@id='serialno']")).sendKeys("FLD");
  }
  @Test(priority=4)
  public void Testcase3() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@id='complaintdesc']")).click();
//	  driver.findElement(By.xpath("//div[@class='MuiBox-root css-1aeycle']//..//h2[@id='@']"));
//	  driver.findElement(By.xpath("//label[text()='Search']")).click();
	  Thread.sleep(3000);
//	  driver.switchTo().frame(0);
	  driver.findElement(By.xpath("//div[@class='MuiBox-root css-1aeycle']//..//input[@name='Search']")).sendKeys("Perform the Wiggle Test on the Cat® Electronic Technician (ET) Service Tool");
	  Thread.sleep(3000);
//	  driver.findElement(By.xpath("//input[@id=':rd:']")).sendKeys("Perform the Wiggle Test on the Cat® Electronic Technician (ET) Service Tool");
	  driver.findElement(By.xpath("//p[text()='Perform the Wiggle Test on the Cat® Electronic Technician (ET) Service Tool']")).click();
	  Thread.sleep(2000);
  }
  @Test(priority=5)
  public void Testcase4() throws InterruptedException {
	  Thread.sleep(3000);
	  WebElement click = driver.findElement(By.xpath("//button[@type='submit'][2]"));
	  JavascriptExecutor jk = (JavascriptExecutor) driver;
	  jk.executeScript("arguments[0].scrollIntoView(true)",click );
	  click.click();
	  Thread.sleep(3000);
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\TestNG_IFSM\\servers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://43.204.46.144:3000/");
  }

  @AfterClass
  public void afterClass() {
//	  driver.quit();
  }

}
