package stepdefiniation;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
public class stepdefinition {

    @Given("^user opens Google URL$")
    public void opens_google_url() throws Throwable {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\eclipse-workspace\\chromedriver.exe");
  		
  		WebDriver driver= new ChromeDriver();
  		
  		driver.get("https://www.google.com");
  		Thread.sleep(2000);

  		driver.quit();   
  	
  		System.out.println("Google Printed");
    
    }

    @Given("^user opens Amazon URL$")
    public void opens_amazon_url() throws Throwable {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\eclipse-workspace\\chromedriver.exe");
  		
  		WebDriver driver= new ChromeDriver();
  		
  		driver.get("https://www.amazon.com");
  		Thread.sleep(2000);

  		driver.quit();   
  	
  		System.out.println("Amazon Printed");
        }

    @Given("^user opens Box URL$")
    public void opens_box_url() throws Throwable {
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\eclipse-workspace\\chromedriver.exe");
  		
  		WebDriver driver= new ChromeDriver();
  		
  		driver.get("https://www.box.com");
  		
  		Thread.sleep(2000);
  		
  		driver.quit();   
  	
  		System.out.println("Box Printed");
    

    
    }

    @Given("^user opens Flipkart URL$")
    public void opens_flipkart_url() throws Throwable {
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\eclipse-workspace\\chromedriver.exe");
  		
  		WebDriver driver= new ChromeDriver();
  		
  		driver.get("https://www.Flipkart.com");
  		
  		Thread.sleep(2000);
  		
  		driver.quit();   
  	
  		System.out.println("Flipkart Printed");

    
    }

    @When("^user enter search criteria$")
    public void user_enter_search_criteria() throws Throwable {
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\eclipse-workspace\\chromedriver.exe");
  		
  		WebDriver driver= new ChromeDriver();
  		
  		driver.get("https://www.facebook.com");
  		Thread.sleep(2000);

  		driver.quit();   
  	
  		System.out.println("User entered search item");

    }

    @Then("^user click on search$")
    public void click_on_search() throws Throwable {
      	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\eclipse-workspace\\chromedriver.exe");
  		
  		WebDriver driver= new ChromeDriver();
  		
  		driver.get("https://www.youtube.com");
  		Thread.sleep(2000);

  		driver.quit();   
  	
  		System.out.println("User clicked on Search button");

   
    	
    
    
    }

    @And("^result is populated$")
    public void result_populated() throws Throwable {
      	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\eclipse-workspace\\chromedriver.exe");
  		
  		WebDriver driver= new ChromeDriver();
  		
  		driver.get("https://www.github.com");
  		Thread.sleep(2000);

  		driver.quit();   
  	
  		System.out.println("Result is printed");

   

    
    }

}