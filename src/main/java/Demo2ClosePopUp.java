import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2ClosePopUp {

    public static void main(String[] args) {
        // Set the path of the Chrome WebDriver
        // Version mismatch sample
        // System.setProperty("webdriver.chrome.driver", "E:\\Tools\\Chrome-Webdriver\\107_0_5304_18\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "E:\\Tools\\Chrome-Webdriver\\106_0_5249_61\\chromedriver.exe");

        // Get the instance of the web driver
        WebDriver driver=new ChromeDriver();

        // Launch website
        driver.navigate().to("http://www.google.com/");

        try{
            driver.findElement(By.xpath("/html/body/div/c-wiz/div/div/c-wiz/div/div/div/div[2]/div[2]/button")).click();
            synchronized (driver){
                try{
                    driver.wait(5000);
                }catch (InterruptedException | IllegalMonitorStateException e){
                    System.out.println("The wait was not successful");
                }
            }

        }catch (NotFoundException e){
            System.out.println("The element was not found.");
        }

        // Click on the search text box and send value
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("aayushyamaan shah bitbucker");

        // Click on the search button
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();

        driver.close();
    }
}
