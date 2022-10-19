import SeleniumHelper.SeleniumHelper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3_Scroll {

    public static void main(String[] args) {
        // Set the path of the Chrome WebDriver
        // Version mismatch sample
        // System.setProperty("webdriver.chrome.driver", "E:\\Tools\\Chrome-Webdriver\\107_0_5304_18\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "E:\\Tools\\Chrome-Webdriver\\106_0_5249_61\\chromedriver.exe");

        // Get the instance of the web driver
        WebDriver driver=new ChromeDriver();

        // Launch website
        driver.navigate().to("https://unsplash.com/");

        try{
            //Scroll down the webpage by 5000 pixels
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("scrollBy(0, 400)");
            SeleniumHelper.wait(driver, 4000);
            js.executeScript("scrollBy(0,-500)");
        }catch (NotFoundException e){
            System.out.println("The element was not found.");
        }
    }
}
