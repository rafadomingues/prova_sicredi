package sicredi.tasks.cliente;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import sicredi.appobjects.homepage.HomePageAppObject;

public class ExcluirClienteTask {
	
	public WebDriver driver;
	private HomePageAppObject home;
	
	public ExcluirClienteTask(WebDriver driver) {
		this.driver = driver;
		this.home = new HomePageAppObject(driver);
	}
	
	public void excluirCliente(String cliente) {
		home.getPesquisarClienteButton().isDisplayed();
		home.getPesquisarClienteButton().click();
		home.getPesquisaClienteTextField().isDisplayed();
		home.getPesquisaClienteTextField().sendKeys(cliente + Keys.ENTER);
		home.getSelecionarClientesCheckbox().click();
		home.getExcluirClienteButton().isDisplayed();
		home.getExcluirClienteButton().click();
		Assert.assertTrue(home.getMensagemExclusaoCliente().getText().contains("Are you sure that you want to delete this 1 item?"), "A mensagem de Exclusão não foi encontrada!");
		home.getExcluirPopUpButton().click();
		home.getMensagemCadastroSucesso().isDisplayed();
		Assert.assertTrue(home.getMensagemCadastroSucesso().getText().contains("Your data has been successfully deleted from the database."), "A mensagem de Cadastro com Sucesso não foi encontrada!");
	}

}
