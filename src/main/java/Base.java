import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

            WebDriver driver;
            @BeforeMethod
            public void browserStartUp()
            {
            System.setProperty("webdriver.chrome.driver","C:\\All_Download\\Chrome_ValidDriver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("http://www.google.com");


            }

//            @AfterMethod
//            public void browserTearDown()
//            {
//            driver.close();
//            driver.quit();
//
//            }

            }
