import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class loginTest extends Base {



    @Test
    public void firstTest()
    {
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("mizanur rahman");
        driver.findElement(By.name("btnK")).click();

    }


}
