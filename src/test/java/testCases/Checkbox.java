package testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Checkbox {
    private WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("web-driver.chrome.driver", "/Users/roxananegru/Desktop/Oni IT/Automation program/Chrome Driver/chromedriver");
        driver = new ChromeDriver();
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }



    @Test(priority = 1)
    public void clickOnTheSingleCheckboxCheckmark() {
        driver.get("https://www.lambdatest.com/selenium-playground/checkbox-demo");
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[1]/div[2]/div[1]/label/input")).click();
        Assert.assertEquals("Success - Check box is checked", "Success - Check box is checked");
    }

    @Test(priority = 2)
    public void clickOnFirstCheckbox() {
        driver.get("https://www.lambdatest.com/selenium-playground/checkbox-demo");
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div[1]/input")).click();
        Assert.assertTrue(true, "Option1 is checked");
    }

    @Test(priority = 3)
    public void clickOnFirstTwoCheckbox() {
        driver.get("https://www.lambdatest.com/selenium-playground/checkbox-demo");
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div[1]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div[2]/input")).click();
        Assert.assertTrue(true, "Option1 and Option 2  is checked");
    }

    @Test(priority = 4)
    public void ClickonFirstOption1MultipleCheckbox() {
        driver.get("https://www.lambdatest.com/selenium-playground/checkbox-demo");
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div[1]/div[1]/input")).click();
        Assert.assertTrue(true, "Option1 is checked");
    }

    @Test(priority = 5)
    public void ClickonFirstTwoOptionsMultipleCheckbox() {
        driver.get("https://www.lambdatest.com/selenium-playground/checkbox-demo");
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div[1]/div[1]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div[1]/div[2]/input")).click();
        Assert.assertTrue(true, "Option1 and Option2  is checked");
    }

    @Test(priority = 6)
    public void ClickonFirstThreeOptionsMultipleCheckbox() {
        driver.get("https://www.lambdatest.com/selenium-playground/checkbox-demo");
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div[1]/div[1]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div[1]/div[2]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div[1]/div[3]/input")).click();
        Assert.assertTrue(true, "Option1, Option2 and Option 3  is checked");
    }

    @Test(priority = 7)
    public void ClickOnAllOptions() {
        driver.get("https://www.lambdatest.com/selenium-playground/checkbox-demo");
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div[1]/div[1]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div[1]/div[2]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div[1]/div[3]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div[1]/div[4]/input")).click();
        Assert.assertTrue(true, "Option1, Option2 , Option 3 and Option4 is checked");

    }

    @Test(priority = 8)
    public void ClickOnCheckAllButton() {
        driver.get("https://www.lambdatest.com/selenium-playground/checkbox-demo");
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div[2]/input")).click();
        Assert.assertTrue(true, "All Options is checked");

    }

    @Test(priority = 9)
    public void ClickOnUnCheckAllButton() {
        driver.get("https://www.lambdatest.com/selenium-playground/checkbox-demo");
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div[2]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div[2]/input")).click();
        Assert.assertTrue(true, "All Options is unchecked");


    }
}



