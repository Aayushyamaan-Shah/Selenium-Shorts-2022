package testpages.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Scanner;

public class Demo7_Forms {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "E:\\Tools\\Chrome-Webdriver\\106_0_5249_61\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testpages.herokuapp.com");
        driver.findElement(By.id("htmlformtest")).click();

        Scanner in = new Scanner(System.in);
        char wait = 'W';

        System.out.println("Enter the username: ");
        driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[1]/td/input")).sendKeys(in.nextLine());

        System.out.println("Enter the password: ");
        driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[2]/td/input")).sendKeys(in.nextLine());
        System.out.println("Enter the Comments: ");
        driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[3]/td/textarea")).clear();
        driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[3]/td/textarea")).sendKeys(in.nextLine());
        System.out.println("Uploading file");
        driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[4]/td/input[1]")).sendKeys("E:\\College (CSPIT)\\Sem 7\\Extra\\Selenium_Sample\\src\\main\\java\\testpages\\herokuapp\\sampleFile.txt");
        System.out.println("File uploaded");
        System.out.println("Select 2nd checkbox");
        driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[5]/td/input[2]")).click();
        System.out.println("Unselect 3rd checkbox");
        driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[5]/td/input[3]")).click();
        System.out.println("Select 1st radio button");
        driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[6]/td/input[1]")).click();
        System.out.println("Select 2nd item from multiple select");

        Select select = new Select(driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[7]/td/select")));

        new Select(driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[7]/td/select"))).selectByIndex(0);
        new Select(driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[7]/td/select"))).selectByIndex(1);
        new Select(driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[7]/td/select"))).deselectByIndex(3);
        System.out.println("Select 6th item from dropdown select");
        new Select(driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[8]/td/select"))).selectByIndex(5);
        wait = in.next().charAt(0);

        driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[9]/td/input[2]")).click();
        wait = in.next().charAt(0);

        driver.close();
        driver.quit();

        // TODO : HW1 and Practice Question 2

    }

}
