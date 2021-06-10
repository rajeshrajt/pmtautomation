package pagespom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class loginpage_pom {
	
	WebDriver driver=null;
	By txt_usetname=By.id("email");
	By Txt_password=By.id("pass");
	By txt_login=By.name("login");
	
	public loginpage_pom(WebDriver driver){
		this.driver=driver;
		
		
	}
	
	public void enterusername(String username)
	
	{
		driver.findElement(txt_usetname).sendKeys(username);
		
	}
public void enterpassword(String password)
	
	{
		
		driver.findElement(Txt_password).sendKeys(password);
	}
public void click()

{
	driver.findElement(txt_login).click();
}
	

}
