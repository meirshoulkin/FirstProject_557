import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
    WebDriver wd;
 @Test
    public void loginTest(){
        wd = new ChromeDriver();
        wd.get("https://www.google.com");
    }
}
