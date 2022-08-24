package factoryClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pagefactory {
	@FindBy(id="login1")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(name="proceed")
	WebElement loginBtn;
	
	@FindBy(id="remember")
	WebElement keepSigninBtn;
	
	@FindBy(id="div_login_error")
	WebElement errormsg;
	
	WebDriver driver;
	
	public pagefactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String u) {
		userName.sendKeys(u);
	}
	
	public void setPassword(String p) {
		password.sendKeys(p);
	}
	
	public void keepsignin() {
		if(!keepSigninBtn.isSelected()) {
			keepSigninBtn.click();
		}else {
			System.out.println("Already selected");
		}
	}
	
	public void nokeepsignin() {
		if(keepSigninBtn.isSelected()) {
			keepSigninBtn.click();
		}else {
			System.out.println("Already unselected");
		}
	}
	
	public void login() {
		loginBtn.click();
	}
	
	
}
