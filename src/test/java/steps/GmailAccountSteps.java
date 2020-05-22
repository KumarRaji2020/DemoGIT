package steps;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GmailAccountSteps {
	
WebDriver driver;

@Given("^Open the gmail application$")
public void open_the_gmail_application() throws Throwable {
   
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\CSS\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
}

@When("^Enter username and password$")
public void enter_username_and_password() throws Throwable {
    driver.findElement(By.id("identifierId")).sendKeys("enter your mail id");
    WebElement nextBtn = driver.findElement(By.xpath("//div[@id='identifierNext']/span"));
    nextBtn.click();
    driver.findElement(By.name("password")).sendKeys("enter your password");
    WebElement pwdNextBtn = driver.findElement(By.xpath("//div[@id='passwordNext']/span"));
    pwdNextBtn.click();
}
@Then("^Verify user is successfully logged in$")
public void verify_user_is_successfully_logged_in() throws Throwable {
    
String actualtitle = driver.getTitle();
if(actualtitle.contains("rkumar.gctece")) 
{
System.out.println("Yes, User Logged in successfully");}
else {
	System.out.println("No, User failed to Log in");
}
		


}

}