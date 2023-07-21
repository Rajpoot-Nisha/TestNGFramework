package javaScriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic_Utilities.File_Utility;
import generic_Utilities.JavaScriptExecutor_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorExamp {

	public static void main(String[] args) {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		JavaScriptExecutor_Utility jslib = new JavaScriptExecutor_Utility(driver);
		jslib.launchAppUrl("http://localhost:8888");
		File_Utility flib= new File_Utility();
		flib.getStringKeyAndVAlue(null)

	}

}
