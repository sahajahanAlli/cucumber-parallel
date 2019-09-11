package seleniumgluecode;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class test {
    public static WebDriver driver;
    @SuppressWarnings("deprecation")
	@Given("^user is  on homepage as (.*)$")
    public void user_is_on_homepage(String url) throws Throwable {
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\seikhs.MAVERICSYSTEMS\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");
    	DesiredCapabilities capabilities = new DesiredCapabilities(); 
    	driver = new FirefoxDriver(capabilities);
        //driver.setPreference("capability.policy.default.Window.QueryInterface", "allAccess"); 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // driver.get("http://automationpractice.com/index.php");
        driver.get(url);
    }
    
    @When("^user navigates to Login Page$")
    public void user_navigates_to_Login_Page() throws Throwable {
        driver.findElement(By.linkText("Sign in")).click();
    }
    
    @When("^user enters (.*) and (.*)$")
    public void user_enters_username_and_Password(String username, String password) throws Throwable {
    	driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.id("SubmitLogin")).click();   
    }
    
    @Then("^success message is displayed as (.*)$")
    public void success_message_is_displayed(String exp_message) throws Throwable {
    	//String exp_message = "Welcome to your account. Here you can manage all of your personal information and orders.";
    	String actual = driver.findElement(By.cssSelector(".info-account")).getText();
        Assert.assertEquals(exp_message, actual);
        driver.quit();  
    }      
}