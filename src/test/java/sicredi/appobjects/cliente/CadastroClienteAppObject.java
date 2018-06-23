package sicredi.appobjects.cliente;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CadastroClienteAppObject {
	
private WebDriver driver;
	
	public CadastroClienteAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getNameTextField() {
		return new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("field-customerName")));
	}
	
	public WebElement getLastNameTextField() {
		return new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("field-contactLastName")));
	}
	
	public WebElement getContactFirstNameTextField() {
		return new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("field-contactFirstName")));
	}
	
	public WebElement getPhoneTextField() {
		return new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("field-phone")));
	}
	
	public WebElement getAdressLine1TextField() {
		return new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("field-addressLine1")));
	}
	
	public WebElement getAdressLine2TextField() {
		return new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("field-addressLine2")));
	}
	
	public WebElement getCityTextField() {
		return new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("field-city")));
	}
	
	public WebElement getStateTextField() {
		return new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("field-state")));
	}
	
	public WebElement getPostalCodeTextField() {
		return new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("field-postalCode")));
	}
	
	public WebElement getCountryTextField() {
		return new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("field-country")));
	}
	
	public WebElement getFromEmployeerButton() {			
		return new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"field_salesRepEmployeeNumber_chosen\"]/a/div/b")));
	}
	
	public WebElement getFromEmployeerTextField() {
		return new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"field_salesRepEmployeeNumber_chosen\"]/div/div/input")));
	}
	
	public WebElement getCreditLimitTextField() {
		return new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("field-creditLimit")));
	}
	
	public WebElement getSalvarClienteButton() {
		return new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.id("form-button-save")));
	}
	
	public WebElement getMensagemSucessoCadastro() {
		return new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.id("report-success")));
	}
	
	public WebElement getRetornarListaButton() {
		return new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"report-success\"]/p/a[2]")));
	}
}
