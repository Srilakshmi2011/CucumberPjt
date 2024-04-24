package stepdefs;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstepdefs {
	

	WebDriver driver = BaseClass.driver;

	@Given("I haved launched the application URL")
	public void i_haved_launched_the_application_URL() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.simplilearn.com/");

	}

	@Given("Click on login link")
	public void click_on_login_link() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();

	}

	@When("Enter Username")
	public void enter_Username() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("abc@xyz.com");

	    
	}
	@When("Enter Password")
	public void enter_Password() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement Password = driver.findElement(By.name("user_pwd"));
		Password.sendKeys("Abc@1234");

	    
	}

	@When("Click on Login button")
	public void click_on_Login_button() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		LoginBtn.click();
		
	}
	    
	

	@Then("Should land on Homepage")
	public void should_land_on_Homepage() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@When("Enter Username as {string}")
	public void enter_Username_as(String UserNameVal) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys(UserNameVal);

		}
	   

	@When("Enter Password as  {string}")
	public void enter_Password_as(String PasswordVal) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement Password = driver.findElement(By.name("user_pwd"));
		Password.sendKeys(PasswordVal);


	   
	}

	@Then("should get the error message as {string}")
	public void should_get_the_error_message_as(String expError) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement Error = driver.findElement(By.className("error_msg"));
		String ActError = Error.getText();
		Assert.assertEquals(expError, ActError);

	   
	}
	@Then("I should see below login options on the screen")
	public void i_should_see_below_login_options_on_the_screen(List<String> Options) {
	    // Write code here that turns the phrase above into concrete actions
	    
		for(String option:Options) {
			
			WebElement LoginOption = driver.findElement(By.xpath("//button[@data-clickedtype='" + option + "']"));
			Assert.assertTrue(LoginOption.isDisplayed());
		}



	}
	}

