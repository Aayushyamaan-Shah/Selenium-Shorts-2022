package testpages.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Demo3_2_DynamicAttributes {
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
        driver.findElement(By.id("elementattributestest")).click();

        // Selecting an element
        // Method 1
        // WebElement webElement = driver.findElement(By.id("para2"));
        // Method 2
        char ch = 'a';

        while(ch != 'n' && ch != 'N'){
            // driver.findElement(By.id("jsattributes")).click();
            driver.findElement(By.className("styled-click-button")).click();

            WebElement webElement = driver.findElement(By.xpath("//*[@id=\"jsattributes\"]"));

            System.out.println("Text: " + webElement.getText());
            for(int i = 1; i < Integer.parseInt(webElement.getDomAttribute("nextid")); i++)
                System.out.println("Custom-attribute "+i+": " + webElement.getDomAttribute("custom-"+i));
            System.out.println("Continue? Y/N: ");
            Scanner in = new Scanner(System.in);
            ch = in.next().charAt(0);
        }


        driver.close();
        driver.quit();
    }

}
