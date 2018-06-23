package sicredi.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserUtils {
	
	public static WebDriver chromeDriver() {
		BrowserUtils.finalizarProcesso();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
		return new ChromeDriver();
	}
	
	public static void fecharBrowser() {
		try { 
			BufferedReader user = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("whoami").getInputStream()));  
			String usuario = user.readLine(); 
			BufferedReader taskkill = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("taskkill /IM chrome.exe /FI \"USERNAME eq " + usuario + "\" /f").getInputStream()));
			taskkill.close();
		} catch (Exception e) { 
			System.err.println("Não foi possível fechar o navegador!" + e);
		}
	}
	
	public static void finalizarProcesso() {
		try { 
			BufferedReader user = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("whoami").getInputStream()));  
			String usuario = user.readLine(); 
			BufferedReader taskkill = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("taskkill /IM chromedriver.exe /FI \"USERNAME eq " + usuario + "\" /f").getInputStream()));
			taskkill.close();
		} catch (Exception e) { 
			System.err.println("Processo não finalizado!" + e);
		}
	}

}
