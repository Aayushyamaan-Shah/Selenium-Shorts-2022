package testpages.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.Scanner;

public class Demo6_FakeAlerts {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "E:\\Tools\\Chrome-Webdriver\\106_0_5249_61\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testpages.herokuapp.com");
        driver.findElement(By.id("fakealerttest")).click();


        // Simple Fake Alert Box
        // Open fake alert box
        driver.findElement(By.id("fakealert")).click();
        Scanner in = new Scanner(System.in);
        char wait = in.next().charAt(0);
        // Close the fake alert box
        // The following line of code will not work
        //driver.switchTo().alert().dismiss();
        driver.findElement(By.id("dialog-ok")).click();
        wait = in.next().charAt(0);


        // Confirmation Alert Box
        // Open the confirmation alert box
        driver.findElement(By.id("modaldialog")).click();
        wait = in.next().charAt(0);
        // Click on positive/OK
        //driver.switchTo().alert().accept();

        // Click on OK
        // driver.findElement(By.id("dialog-ok")).click();

        // Using Actions (REF: https://www.guru99.com/keyboard-mouse-events-files-webdriver.html)
        // Click anywhere outside the div
        Actions action = new Actions(driver);
        Action mouseMoveClick = action.moveToElement(driver.findElement(By.id("modaldialog"))).click().build();
        mouseMoveClick.perform();
        wait = in.next().charAt(0);



        driver.close();
        driver.quit();
    }

}
