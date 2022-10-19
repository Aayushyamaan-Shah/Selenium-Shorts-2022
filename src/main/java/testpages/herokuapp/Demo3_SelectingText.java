package testpages.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Demo3_SelectingText {
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
        WebElement webElement = driver.findElement(By.xpath("//*[@id=\"domattributes\"]"));

        // Print the text inside the WebElement in the console
        System.out.println("Text: " + webElement.getText());

        // Selecting attributes
        System.out.println("Title: " + webElement.getDomAttribute("title"));
        System.out.println("Custom-attribute: " + webElement.getDomAttribute("custom-attrib"));

        // Not useful, but works
        // System.out.println(webElement.getDomProperty("attributes"));
        // We can write a custom class that takes these values and creates a object that makes the data easy to use


        // Changing the text
        // The following code won't work!
        // webElement.sendKeys("This is my new text");
        // webElement.innerHtml("This is my new text");


        Scanner in = new Scanner(System.in);
        Character something = in.next().charAt(0);




        driver.close();
        driver.quit();
    }

}
