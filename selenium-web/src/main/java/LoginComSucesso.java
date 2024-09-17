

	import org.junit.Assert;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class LoginComSucesso {

		@Test
		public void loginComSucesso() {
			// Configurar o WebDriver (neste exemplo, o ChromeDriver)
	        //System.setProperty("webdriver.chrome.driver", "caminho/para/o/chromedriver");
			WebDriver driver = new FirefoxDriver();

	        // Abrir a página de login
	        driver.get("https://www.saucedemo.com/");

	        // Localizar e preencher os campos de nome de usuário e senha
	        WebElement usernameField = driver.findElement(By.id("user-name"));
	        usernameField.sendKeys("standard_user");

	        WebElement passwordField = driver.findElement(By.id("password"));
	        passwordField.sendKeys("secret_sauce");

	        // Localizar e clicar no botão de login
	        WebElement loginButton = driver.findElement(By.id("login-button"));
	        loginButton.click();

	        // Fechar o navegador
	        Assert.assertEquals("Products", driver.getTitle());
	        driver.quit();
	    }

}
