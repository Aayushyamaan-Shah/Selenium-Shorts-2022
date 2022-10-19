package testpages.herokuapp;
// Clicking the test link

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;
public class Demo2_Click {
    public static void main(String[] args) {
        // Set the path of the Chrome WebDriver
        // Version mismatch example
        // System.setProperty("webdriver.chrome.driver", "E:\\Tools\\Chrome-Webdriver\\107_0_5304_18\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "E:\\Tools\\Chrome-Webdriver\\106_0_5249_61\\chromedriver.exe");


        // Get the instance of the web driver
        WebDriver driver = new ChromeDriver();


        // Launch website
        // Method 1
        // driver.get("https://testpages.herokuapp.com/styled/basic-web-page-test.html");
        // Method 2
        driver.navigate().to("https://testpages.herokuapp.com");

        // Selecting an element
        // And clicking it
        driver.findElement(By.xpath("/html/body/div/ul[1]/li[1]/a")).click();



        Scanner in = new Scanner(System.in);
        Character something = in.next().charAt(0);


        driver.close();
        driver.quit();
    }

}
