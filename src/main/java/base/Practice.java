package base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("http://qa.taltektc.com/home/login");

        driver.findElement(By.name("email")).sendKeys("Anhngocjade2303@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Enajade2303");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
      //  try {
     //       assertEquals(driver.findElement(By.xpath("//form[@id='profile_form']/legend")).getText(), "Welcome to TalentTek");
      //  } catch (Error e) {
     //       verificationErrors.append(e.toString());
        }
    }
}