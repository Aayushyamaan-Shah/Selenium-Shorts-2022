package testpages.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;

public class Practice1_DynamicTable {
    public static void main(String[] args) {
        // TODO : Write the code to handle the dynamic table on link:
        // Main Link: https://testpages.herokuapp.com/styled/index.html
        // https://testpages.herokuapp.com/styled/tag/dynamic-table.html

        System.setProperty("webdriver.chrome.driver", "E:\\Tools\\Chrome-Webdriver\\106_0_5249_61\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://testpages.herokuapp.com/styled/tag/dynamic-table.html");

        WebElement table = webDriver.findElement(By.tagName("table"));

        List<WebElement> childElement = table.findElements(By.xpath("./child::tr"));

        for(WebElement element : childElement){
            List<WebElement> elementsInner = element.findElements(By.xpath("./child::*"));
            for(WebElement innerElement : elementsInner)
                System.out.println("Data: "+innerElement.getText());
        }

        new Scanner(System.in).next().charAt(0);

        webDriver.close();
        webDriver.quit();

    }
}
