package testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SimpleForm {
    private WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("web-driver.chrome.driver", "/Users/roxananegru/Desktop/Oni IT/Automation program/Chrome Driver/chromedriver");
        driver = new ChromeDriver();
    }

    @AfterClass
    public void teardown() { driver.quit();
    }


    @Test(priority = 1)
    public void singleInputField() {
        driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
        driver.findElement(By.id("user-message")).sendKeys("testcaseQA");
        driver.findElement(By.id("showInput")).click();
        WebElement yourMessage = driver.findElement(By.id("message"));
        Assert.assertEquals(true, yourMessage.isDisplayed());
    }
    @Test(priority = 2)
    public void singleInputFieldwithNumbers() {
        driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
        driver.findElement(By.id("user-message")).sendKeys("990");
        driver.findElement(By.id("showInput")).click();
        WebElement yourMessage = driver.findElement(By.id("message"));
        Assert.assertEquals(true, yourMessage.isDisplayed());
    }

    @Test(priority = 3)
    public void SingleInputFieldwithNegativeNumber() {
        driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
        driver.findElement(By.id("user-message")).sendKeys("-100");
        driver.findElement(By.id("showInput")).click();
        WebElement yourMessage = driver.findElement(By.id("message"));
        Assert.assertEquals(true, yourMessage.isDisplayed());

    }

    @Test(priority = 4)
    public void SingleInputFieldwithZeroNumber() {
        driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
        driver.findElement(By.id("user-message")).sendKeys(" 0");
        driver.findElement(By.id("showInput")).click();
        WebElement yourMessage = driver.findElement(By.id("message"));
        Assert.assertEquals(true, yourMessage.isDisplayed());

    }

    @Test(priority = 5)
    public void SingleinputFieldwithSmallLetters() {
        driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
        driver.findElement(By.id("user-message")).sendKeys(" abcde");
        driver.findElement(By.id("showInput")).click();
        WebElement yourMessage = driver.findElement(By.id("message"));
        Assert.assertEquals(true, yourMessage.isDisplayed());
    }

    @Test(priority = 6)
    public void SingleInputFieldwithFloatNumbers() {
        driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
        driver.findElement(By.id("user-message")).sendKeys(" 15.5");
        driver.findElement(By.id("showInput")).click();
        WebElement yourMessage = driver.findElement(By.id("message"));
        Assert.assertEquals(true, yourMessage.isDisplayed());
    }

    @Test(priority = 7)
    public void SingleInputFieldWithNegativefloatNumbers() {
        driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
        driver.findElement(By.id("user-message")).sendKeys(" -4.5");
        driver.findElement(By.id("showInput")).click();
        WebElement yourMessage = driver.findElement(By.id("message"));
        Assert.assertEquals(true, yourMessage.isDisplayed());

    }

    @Test(priority = 8)
    public void SingleInputFieldWithNumberwithLetters() {
        driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
        driver.findElement(By.id("user-message")).sendKeys(" 100 A");
        driver.findElement(By.id("showInput")).click();
        WebElement yourMessage = driver.findElement(By.id("message"));
        Assert.assertEquals(true, yourMessage.isDisplayed());

    }

    @Test(priority = 9)
    public void SingleInputFieldWithNegativeNumbersAndLetters() {
        driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
        driver.findElement(By.id("user-message")).sendKeys(" -1993 B");
        driver.findElement(By.id("showInput")).click();
        WebElement yourMessage = driver.findElement(By.id("message"));
        Assert.assertEquals(true, yourMessage.isDisplayed());

    }

    @Test(priority = 10)
    public void singleInputFieldwithCharacters() {
        driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
        driver.findElement(By.id("user-message")).sendKeys("?!-");
        driver.findElement(By.id("showInput")).click();
        WebElement yourMessage = driver.findElement(By.id("message"));
        Assert.assertEquals(true, yourMessage.isDisplayed());

    }

    @Test(priority = 11)
    public void TextNumbersAndSpecialCharacters() {
        driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
        driver.findElement(By.id("user-message")).sendKeys("TestQA1993!");
        driver.findElement(By.id("showInput")).click();
        WebElement yourMessage = driver.findElement(By.id("message"));
        Assert.assertEquals(true, yourMessage.isDisplayed());

    }

    @Test(priority = 12)
    public void TwoInputFieldsSumNumbers() {
        driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
        driver.findElement(By.id("sum1")).click();
        driver.findElement(By.id("sum1")).sendKeys("10");
        driver.findElement(By.id("sum2")).click();
        driver.findElement(By.id("sum2")).sendKeys("5");
        WebElement yourMessage = driver.findElement(By.id("message"));
        driver.findElement(By.id("sum2"));
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div/div[1]/form/button")).click();

    }

    @Test(priority = 13)
    public void TwoInputFieldsSumNumbersWithDecimals() {
        driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
        driver.findElement(By.id("sum1")).click();
        driver.findElement(By.id("sum1")).sendKeys("10.5");
        driver.findElement(By.id("sum2")).click();
        driver.findElement(By.id("sum2")).sendKeys("5.8");
        WebElement yourMessage = driver.findElement(By.id("message"));
        driver.findElement(By.id("sum2"));
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div/div[1]/form/button")).click();
    }

    @Test(priority = 14)
    public void TwoInputFieldsSumwithNegativeNumbers() {
        driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
        driver.findElement(By.id("sum1")).click();
        driver.findElement(By.id("sum1")).sendKeys("-1");
        driver.findElement(By.id("sum2")).click();
        driver.findElement(By.id("sum2")).sendKeys("-3");
        WebElement yourMessage = driver.findElement(By.id("message"));
        driver.findElement(By.id("sum2"));
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div/div[1]/form/button")).click();

    }

}
