package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class definition {
	WebDriver driver;
	
	@Given("login page")
	public void login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("Test Login with Valid Data")
	public void test_login_with_valid_data() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 driver.findElement(By.id("btnLogin")).click();
	}
	
	@Then("Login Successfull")
	public void login_successfull() {
	   System.out.println("Login Successfull");
	}
}
