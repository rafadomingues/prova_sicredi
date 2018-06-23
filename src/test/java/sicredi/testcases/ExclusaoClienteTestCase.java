package sicredi.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import sicredi.tasks.cliente.AdicionarClienteTask;
import sicredi.tasks.cliente.ExcluirClienteTask;
import sicredi.tasks.homepage.HomePageTask;
import sicredi.utils.BrowserUtils;

public class ExclusaoClienteTestCase {
	
	private static WebDriver driver;

	public static void main(String[] args) {
		driver = BrowserUtils.chromeDriver();
		HomePageTask home = new HomePageTask(driver);
		AdicionarClienteTask adicionaCliente = new AdicionarClienteTask(driver);
		ExcluirClienteTask excluiCliente = new ExcluirClienteTask(driver);

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.grocerycrud.com/demo/bootstrap_theme");
		driver.manage().window().maximize();
		home.selecionarCadastroCliente("Bootstrap V4 Theme");
		adicionaCliente.adicionarCliente("Teste Sicredi", "Teste", "Rafael Domingues", "51 9999-9999", "Av Assis Brasil, 3970",
				"Torre D", "Porto Alegre", "RS", "91000-000", "Brasil", "Fixter", "200");
		adicionaCliente.visualizarClientes();
		excluiCliente.excluirCliente("Teste Sicredi");
		BrowserUtils.fecharBrowser();
	}

}
