package sicredi.appobjects.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageAppObject {
	
	private WebDriver driver;
	
	public HomePageAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public Select getVersionBootstrapSelect() {			
		WebElement element = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.id("switch-version-select")));
		return new Select(element);
	}
	
	public WebElement getAddClienteButton() {
		return new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"gcrud-search-form\"]/div[1]/div[1]/a")));
	}
	
	public WebElement getPesquisarClienteButton() {
		return new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"gcrud-search-form\"]/div[1]/div[2]/a[3]")));
	}
	
	public WebElement getPesquisaClienteTextField() {
		return new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.className("search-input")));
	}
	
	public WebElement getSelecionarClientesCheckbox() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"gcrud-search-form\"]/div[2]/table/thead/tr[2]/td[1]/div/input")));
	}
	
	public WebElement getExcluirClienteButton() {
		return new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"gcrud-search-form\"]/div[2]/table/thead/tr[2]/td[2]/div[1]/a/i")));
	}
	
	public WebElement getMensagemExclusaoCliente() {
		return new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div[2]")));
	}
	
	public WebElement getExcluirPopUpButton() {
		return new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div[3]/button[2]")));
	}
	
	public WebElement getMensagemCadastroSucesso() {
		return new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/span[3]/p")));
	}
	

}
