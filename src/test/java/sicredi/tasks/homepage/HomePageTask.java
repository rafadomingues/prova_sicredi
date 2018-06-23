package sicredi.tasks.homepage;


import org.openqa.selenium.WebDriver;

import sicredi.appobjects.homepage.HomePageAppObject;


public class HomePageTask {
	
		public WebDriver driver;
		private HomePageAppObject home;
		
		public HomePageTask(WebDriver driver) {
			this.driver = driver;
			this.home = new HomePageAppObject(driver);
		}
		
		public void selecionarCadastroCliente(String version) {
			home.getVersionBootstrapSelect().selectByVisibleText(version);
			home.getAddClienteButton().click();
		}

}
