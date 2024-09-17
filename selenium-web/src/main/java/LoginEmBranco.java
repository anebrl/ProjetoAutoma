import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginEmBranco {
	
	@Test
    public void loginComCamposEmBranco() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        WebElement errorMessage = driver.findElement(By.cssSelector(".error-message-container"));
        Assert.assertTrue(errorMessage.isDisplayed());

        driver.quit();
    }

}
