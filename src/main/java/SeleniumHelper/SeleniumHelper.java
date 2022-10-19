package SeleniumHelper;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumHelper {

    public static void wait(@NotNull WebDriver webDriver){
        synchronized (webDriver){
            try{
                webDriver.wait();
            }catch (InterruptedException | IllegalMonitorStateException e){
                System.out.println("The wait was not successful");
            }
        }
    }

    public static void wait(@NotNull WebDriver webDriver, int millSec){
        synchronized (webDriver){
            try{
                webDriver.wait(millSec);
            }catch (InterruptedException | IllegalMonitorStateException e){
                System.out.println("The wait was not successful");
            }
        }
    }

    // The following function is used to wait for an element to be visible based on its ID
    public static void waitForElementID(@NotNull WebDriver webDriver, int waitFor, String elementID){
        try{
            WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(waitFor));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementID)));
        }catch (NoSuchElementException e){
            e.printStackTrace();
            System.out.println("The element you asked for did not appear in the given timeframe.");
        }
    }

    // The following function is used to wait for an element to be visible based on its xPath
    public static void waitForElementXpath(@NotNull WebDriver webDriver, int waitFor, String xPath){

        try{
            WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(waitFor));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)));
        }catch (NoSuchElementException e){
            e.printStackTrace();
            System.out.println("The element you asked for did not appear in the given timeframe.");
        }
    }

    public static void waitForElementToBeClickableID(@NotNull WebDriver webDriver, int waitFor, String elementID){
        try{
            WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(waitFor));
            wait.until(ExpectedConditions.elementToBeClickable(By.id(elementID)));
        }catch (NoSuchElementException e){
            e.printStackTrace();
            System.out.println("The element you asked for did not appear in the given timeframe.");
        }
    }

    public static void waitForElementToBeClickableXpath(@NotNull WebDriver webDriver, int waitFor, String xPath){
        try{
            WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(waitFor));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPath)));
        }catch (NoSuchElementException e){
            e.printStackTrace();
            System.out.println("The element you asked for did not appear in the given timeframe.");
        }
    }
}
