package org.stepdefinition;

import org.mvn.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookLogin extends BaseClass {
	@Given("To launch a Browser and Minimize to a windows")
	public void to_launch_a_Browser_and_Minimize_to_a_windows() {
		launchBrowser();
	}

	@When("To get the FaceBook Url to lauch the chrome")
	public void to_get_the_FaceBook_Url_to_lauch_the_chrome() {
		driver.get("https://en-gb.facebook.com/login/");

	}

	@When("User Enter the FaceBook valid {string} UserName")
	public void user_Enter_the_FaceBook_valid_UserName(String email) {
		WebElement UserName = driver.findElement(By.id("email"));
		UserName.sendKeys(email);
	}

	@When("User Enter the FaceBook Valid {string} PassWord")
	public void user_Enter_the_FaceBook_Valid_PassWord(String pass1) {
		WebElement UserName = driver.findElement(By.id("pass"));
		UserName.sendKeys(pass1);

	}

	@When("User Click the Login btn")
	public void user_Click_the_Login_btn() {
		WebElement click1 = driver.findElement(By.xpath("//button[text()='Log in']"));
		click1.click();
	}

	@Then("Close the Browser")
	public void close_the_Browser() {
		driver.close();
	}

}
