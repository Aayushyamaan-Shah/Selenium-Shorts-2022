package testpages.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;

public class Demo4_TableData {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "E:\\Tools\\Chrome-Webdriver\\106_0_5249_61\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testpages.herokuapp.com");
        driver.findElement(By.id("tablestest")).click();

        // Select the table
        WebElement table = driver.findElement(By.xpath("//*[@id=\"mytable\"]"));

        // List of rows
        List<WebElement> webElements = table.findElement(By.xpath("./child::tbody"))
                .findElements(By.xpath("./child::*"));

        boolean isFirstCol = true;

        for(WebElement webElementInner : webElements){
            List<WebElement> webElementList = webElementInner.findElements(By.xpath("./child::*"));
            for(WebElement tableCell : webElementList)
                if(isFirstCol){
                    System.out.print(tableCell.getText()+"\t\t\t");
                    isFirstCol = false;
                }else{
                    isFirstCol = true;
                    System.out.println(tableCell.getText());
                }
        }

        new Scanner(System.in).next().charAt(0);


        driver.close();
        driver.quit();

        // TODO Go to practice 1
    }

}
