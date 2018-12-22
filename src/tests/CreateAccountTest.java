package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {
    @Test

    public void CreateNewAccount () throws InterruptedException {

           // Thread.sleep(10000);
        waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Create Account')]"),45);

           // WebElement createAccount = driver.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
           // createAccount.click();

            WebElement mailField = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
            mailField.click();
            mailField.sendKeys("mishUser2254@gmail.com");


            WebElement passwordField = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
            passwordField.click();
            passwordField.sendKeys("example");

            WebElement repPasswordField = driver.findElement(By.xpath("//input[@formcontrolname='passwordRep']"));
            repPasswordField.click();
            repPasswordField.sendKeys("example");

            WebElement registrationButton = driver.findElement(By.xpath("//span[contains(text(),'Registration')]"));
            registrationButton.click();
            Thread.sleep(15000);

            WebElement firstName =  driver.findElement(By.xpath("//input[@id='inputFirstName']"));
            firstName.click();
            Thread.sleep(10000);
            firstName.click();
            firstName.sendKeys("Denis");

            WebElement events=driver.findElement(By.xpath("//h5[contains(text(),'Change banner')]"));

            WebElement cancelButton = driver
                    .findElement(By.xpath("//button[@type='button']//span[contains(text(),'Cancel')]/.."));

            cancelButton.click();
            Thread.sleep(3000);

            WebElement menuButton = driver.findElement(By.xpath("//mat-icon[@mattooltip='Menu']"));
            menuButton.click();

            WebElement logOutMenu = driver.findElement(By.xpath("//span[@class='marginLeft']"));

            logOutMenu.click();
            Thread.sleep(3000);
            driver.quit();
        Assert.assertTrue(events.getText().equals("Change banner"));


        }
        @Test
        public void CreateNewAccountAndLogIn ()throws InterruptedException {
           // CreateNewAccount ();


               WebElement createAccount = driver.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
                createAccount.click();

                WebElement mailField = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
                mailField.click();
                mailField.sendKeys("mishUser2255@gmail.com");


                WebElement passwordField = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
                passwordField.click();
                passwordField.sendKeys("example");

                WebElement repPasswordField = driver.findElement(By.xpath("//input[@formcontrolname='passwordRep']"));
                repPasswordField.click();
                repPasswordField.sendKeys("example");

                WebElement registrationButton = driver.findElement(By.xpath("//span[contains(text(),'Registration')]"));
                registrationButton.click();
                Thread.sleep(15000);

                WebElement cancelButton = driver
                        .findElement(By.xpath("//button[@type='button']//span[contains(text(),'Cancel')]/.."));

                cancelButton.click();
               Thread.sleep(3000);

                WebElement menuButton = driver.findElement(By.xpath("//mat-icon[@mattooltip='Menu']"));
                //menuButton = driver.findElement(By.cssSelector('mat-icon.but.mat-icon'));
                menuButton.click();

                WebElement logOutMenu = driver.findElement(By.xpath("//span[@class='marginLeft']"));
                logOutMenu.click();
               // Thread.sleep(3000);

                //----------Login created user----------
            waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Login')]"),30);


                WebElement login = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
                login.click();

                WebElement emailReg = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
                emailReg.click();
                emailReg.sendKeys("mishUser2248@gmail.com");
                Thread.sleep(2000);

                WebElement passReg =  driver.findElement(By.xpath("//input[@formcontrolname='password']"));
                passReg.click();
                passReg.sendKeys("example");

                WebElement log_In = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
                log_In.click();
                Thread.sleep(8000);
                WebElement cancel=driver.findElement(By.xpath("//span[contains(text(),'Cancel')]"));
                Assert.assertTrue(cancel.getText().equals("Cancel"));
                Thread.sleep(10000);
                driver.quit();

            }

    private void waitUntilElementIsLoaded(WebDriver driver,
                                          By locator, int time)
    {
        try {
            new WebDriverWait(driver, time).until(ExpectedConditions
                    .presenceOfElementLocated(locator));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

