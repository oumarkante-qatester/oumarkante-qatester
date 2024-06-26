// Generated by Selenium IDE
package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ASCdonnesvalidesTest {
	
	 public static void main(String[] args) {
		// Chemin vers le pilote WebDriver Chrome
	        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Utilisateur\\chromedriver_win32\\chromedriver.exe");

	        // Initialisez le pilote Chrome
	        WebDriver driver = new ChromeDriver();

	        // Ouvrez la page de connexion
	        driver.get("https://frontend.staging.saytutension.baamtuservices.com/login");

	        // Entrez les informations d'identification
	        driver.findElement(By.id("email")).sendKeys("rasajel434@notedns.com");
	        driver.findElement(By.id("password")).sendKeys("fyc2ELY&07z1Q7");

	        // Cliquez sur le bouton de connexion
	        //driver.findElement(By.id("button")).click();
	        driver.findElement(By.xpath("//button[@class='w-full p-2 text-white bg-primary-saytu rounded-lg my-6\']")).click();


    // Test name: ASC(données valides)
    // Step # | name | target | value
    // 1 | open | https://frontend.saytutension.baamtuservices.com/home/community-health-worker | 
    driver.get("https://frontend.staging.saytutension.baamtuservices.com/home/community-health-worker");
    // 2 | click | css=.btn-primary | 
    driver.findElement(By.cssSelector(".btn-primary")).click();
    // 3 | click | id=grid-last-name | 
    driver.findElement(By.id("grid-last-name")).click();
    // 4 | type | id=grid-last-name | Test3
    driver.findElement(By.id("grid-last-name")).sendKeys("Test3");
    // 5 | click | id=grid-first-name | 
    driver.findElement(By.id("grid-first-name")).click();
    // 6 | type | id=grid-first-name | Dev3
    driver.findElement(By.id("grid-first-name")).sendKeys("Dev3");
    // 7 | click | id=grid-email | 
    driver.findElement(By.id("grid-email")).click();
    // 8 | type | id=grid-email | test3dev3@gmail.com
    driver.findElement(By.id("grid-email")).sendKeys("test3dev3@gmail.com");
    // 9 | click | id=grid-phone | 
    driver.findElement(By.id("grid-phone")).click();
    // 10 | type | id=grid-phone | 77283kh35
    driver.findElement(By.id("grid-phone")).sendKeys("772837663");
    // 11 | click | id=grid-birthday | 
    driver.findElement(By.id("grid-birthday")).click();
    // 12 | type | id=grid-birthday | 1990-05-08
    driver.findElement(By.id("grid-birthday")).sendKeys("1990-05-08");
    // 13 | click | id=grid-region | 
    driver.findElement(By.id("grid-region")).click();
    // 14 | click | id=grid-region | 
    driver.findElement(By.id("grid-region")).click();
    // 15 | select | id=grid-region | label=RM Dakar
    {
      WebElement dropdown = driver.findElement(By.id("grid-region"));
      dropdown.findElement(By.xpath("//option[. = 'RM Dakar']")).click();
    }
    // 16 | click | id=grid-district | 
    driver.findElement(By.id("grid-district")).click();
    // 17 | select | id=grid-district | label=Dakar Sud
    {
      WebElement dropdown = driver.findElement(By.id("grid-district"));
      dropdown.findElement(By.xpath("//option[. = 'Dakar Sud']")).click();
    }
    // 18 | click | css=.btn-primary | 
    driver.findElement(By.cssSelector(".btn-primary")).click();
  }
 }
