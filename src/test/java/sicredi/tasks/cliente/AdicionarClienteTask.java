package sicredi.tasks.cliente;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import sicredi.appobjects.cliente.CadastroClienteAppObject;

public class AdicionarClienteTask {

	public WebDriver driver;
	private CadastroClienteAppObject cliente;

	public AdicionarClienteTask(WebDriver driver) {
		this.driver = driver;
		this.cliente = new CadastroClienteAppObject(driver);
	}
	
	public void adicionarCliente(String name, String lastName, String contactFirstName, String phone, String adress1,
			String adress2, String city, String state, String postalCode, String country, String employeer,
			String creditLimit) {
		cliente.getNameTextField().sendKeys(name);
		cliente.getLastNameTextField().sendKeys(lastName);
		cliente.getContactFirstNameTextField().sendKeys(contactFirstName);
		cliente.getPhoneTextField().sendKeys(phone);
		cliente.getAdressLine1TextField().sendKeys(adress1);
		cliente.getAdressLine2TextField().sendKeys(adress2);
		cliente.getCityTextField().sendKeys(city);
		cliente.getStateTextField().sendKeys(state);
		cliente.getPostalCodeTextField().sendKeys(postalCode);
		cliente.getCountryTextField().sendKeys(country);
		cliente.getFromEmployeerButton().click();
		cliente.getFromEmployeerTextField().isDisplayed();
		cliente.getFromEmployeerTextField().sendKeys(employeer + Keys.ENTER);
		cliente.getCreditLimitTextField().sendKeys(creditLimit);
		cliente.getSalvarClienteButton().click();
		Assert.assertTrue(cliente.getMensagemSucessoCadastro().getText().contains("Your data has been successfully stored into the database."), "A mensagem de Cadastro não foi encontrada!");
	}
	
	public void visualizarClientes() {
		cliente.getRetornarListaButton().click();
	}

}
