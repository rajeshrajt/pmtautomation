package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagespom.loginpage_pom;

public class loginsteps_pom {
	
	WebDriver driver=null;
	loginpage_pom page;

	@Given("user is on login screen")
	public void user_is_on_login_screen() {
		
		System.out.println("inside step-user is on login page");
		System.setProperty("webdriver.chrome.driver","D:\\system programs\\exercise programs\\Bddsecondframework\\src\\test\\resources\\drivers\\latestchromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 
		 
		
	   
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) {
		
		page=new loginpage_pom(driver);
		page.enterusername(username);
		page.enterpassword(password);
	
		System.out.println("inside step-user enters username and password");
	//	driver.findElement(By.id("email")).sendKeys(username);
		//driver.findElement(By.id("pass")).sendKeys(password);
		
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("inside step-user clicks on login button");
		page.click();
		
		
		driver.close();
		
	}
	

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("inside step-user is navigated to home page");
		
	}




}



