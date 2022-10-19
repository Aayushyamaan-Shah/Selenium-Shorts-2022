package testpages.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Demo5_Alerts {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\Tools\\Chrome-Webdriver\\106_0_5249_61\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testpages.herokuapp.com");
        driver.findElement(By.id("alerttest")).click();


        // Simple Alert Box
        // Open simple alert box
        driver.findElement(By.id("alertexamples")).click();
        Scanner in = new Scanner(System.in);
        char wait = in.next().charAt(0);
        // Dismiss the alert box
        driver.switchTo().alert().dismiss();
        wait = in.next().charAt(0);


        // Confirmation Alert Box
        // Open the confirmation alert box
        driver.findElement(By.id("confirmexample")).click();
        wait = in.next().charAt(0);
        // Click on positive/OK
        driver.switchTo().alert().accept();
        // Click on cancel
        // driver.switchTo().alert().dismiss();
        wait = in.next().charAt(0);



        // Prompt dialog box
        // Open the prompt dialog box
        driver.findElement(By.id("promptexample")).click();
        wait = in.next().charAt(0);

        // Send text to the prompt
        driver.switchTo().alert().sendKeys("A5 and friends were here");
        wait = in.next().charAt(0);

        driver.switchTo().alert().accept();
        // driver.switchTo().alert().dismiss();
        wait = in.next().charAt(0);


        driver.close();
        driver.quit();
    }

}
