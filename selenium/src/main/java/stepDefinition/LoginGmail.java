package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginGmail {

	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, 20);

	@Given("^user is on Gmail Login Page$")
	public void user_is_on_Gmail_Login_Page() {
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mail.google.com/");
		driver.manage().window().maximize();

	}

	@Then("^Login with valid gmail account$")
	public void Login_into_Gmail() throws InterruptedException  {
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("sislamincubyte1@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("incubyte1");
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		
	}

	@And("^Click on Compose mail$")
	public void click_on_Compose_mail() throws Throwable {
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Compose')]"))).click();
		Thread.sleep(3000);

	}

	@Then("^Verify that on clicking Compose button a frame to compose a mail gets displayed$")
	public void verify_that_on_clicking_Compose_button_a_frame_to_compose_a_mail_gets_displayed() throws Throwable {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//textarea[contains(@aria-label, 'To')]")))
				.sendKeys("sislamincubyte1@gmail.com");
	}

	@Then("^Verify that the user can type Subject line in the Subject textbox$")
	public void verify_that_the_user_can_type_Subject_line_in_the_Subject_textbox() throws Throwable {
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Demo");
		Thread.sleep(3000);

	}

	@Then("^Verify that the user can type the email in the email-body section$")
	public void verify_that_the_user_can_type_the_email_in_the_email_body_section() throws Throwable {
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Hello World");
		Thread.sleep(3000);

	}

	@Then("^click on send$")
	public void click_on_send() throws Throwable {
		driver.findElement(By.xpath("//div[@aria-label='Send ‪(Ctrl-Enter)‬']")).click();
		Thread.sleep(3000);

	}

//	@Then("^Verify that sent mails can be found in Sent Mail sections of the sender$")
//	public void verify_that_sent_mails_can_be_found_in_Sent_Mail_sections_of_the_sender() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//
//	}

}
