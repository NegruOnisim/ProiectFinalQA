package testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class RadioButtons {
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
    public void ClickOnMaleOption() {
        driver.get("https://www.lambdatest.com/selenium-playground/radiobutton-demo");
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[1]/div/label[1]/input")).click();
        driver.findElement(By.id("buttoncheck")).click();
        Assert.assertTrue(true, "Radio button 'Male' is checked");


    }

    @Test(priority = 2)
    public void ClickOnFemaleOption() {
        driver.get("https://www.lambdatest.com/selenium-playground/radiobutton-demo");
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[1]/div/label[2]/input")).click();
        driver.findElement(By.id("buttoncheck")).click();
        Assert.assertTrue(true, "Radio button 'Female' is checked");


    }

    @Test(priority = 3)
    public void ClickOnMaleGenderAgeMin() {
        driver.get("https://www.lambdatest.com/selenium-playground/radiobutton-demo");
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[1]/label[1]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[2]/label[1]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/button")).click();
        Assert.assertTrue(true, " Gender : Male,Age : 0 - 5");


    }

    @Test(priority = 4)
    public void ClickOnMaleGenderAgeMedium() {
        driver.get("https://www.lambdatest.com/selenium-playground/radiobutton-demo");
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[1]/label[1]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[2]/label[2]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/button")).click();
        Assert.assertTrue(true, " Gender : Male,Age : 5 - 15");

    }

    @Test(priority = 5)
    public void CLickOnMaleGenderAgeMaximum() {
        driver.get("https://www.lambdatest.com/selenium-playground/radiobutton-demo");
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[1]/label[1]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[2]/label[3]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/button")).click();
        Assert.assertTrue(true, " Gender : Male,Age : 15 - 50");

    }

    @Test(priority = 6)
    public void ClickOnFemaleGenderAgeMin() {
        driver.get("https://www.lambdatest.com/selenium-playground/radiobutton-demo");
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[1]/label[2]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[2]/label[1]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/button")).click();
        Assert.assertTrue(true, " Gender : Female,Age : 0 - 5");


    }

    @Test(priority = 7)
    public void ClickOnFemaleGenderAgeMedium() {
        driver.get("https://www.lambdatest.com/selenium-playground/radiobutton-demo");
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[1]/label[2]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[2]/label[2]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/button")).click();
        Assert.assertTrue(true, " Gender : Female,Age : 5-15");

    }

    @Test(priority = 8)
    public void CLickOnFemaleGenderAgeMaximum() {
        driver.get("https://www.lambdatest.com/selenium-playground/radiobutton-demo");
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[1]/label[2]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[2]/label[3]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/button")).click();
        Assert.assertTrue(true, " Gender : Female,Age : 15-50");


    }

    @Test(priority = 9)
    public void ClickonOtherGenderAgeMin() {
        driver.get("https://www.lambdatest.com/selenium-playground/radiobutton-demo");
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[1]/label[3]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[2]/label[1]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/button")).click();
        Assert.assertTrue(true, " Gender : Other,Age : 0-5");


    }

    @Test(priority = 10)
    public void ClickOnOtherGenderAgeMedium() {
        driver.get("https://www.lambdatest.com/selenium-playground/radiobutton-demo");
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[1]/label[3]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[2]/label[2]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/button")).click();
        Assert.assertTrue(true, " Gender : Other,Age : 5-15");
    }

    @Test(priority = 11)
    public void ClickOnOtherGenderAgeMaximum() {
        driver.get("https://www.lambdatest.com/selenium-playground/radiobutton-demo");
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[1]/label[3]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[2]/label[3]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/button")).click();
        Assert.assertTrue(true, " Gender : Other,Age : 15-50");
    }


    @Test(priority = 12)
    public void DisabledCheckboxClickonFirstCheckbox() {
        driver.get("https://www.lambdatest.com/selenium-playground/radiobutton-demo");
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div/div/div/div[1]/label/input")).click();
        Assert.assertEquals("Success - Check box is checked", "Success - Check box is checked");

    }

    @Test(priority = 13)
    public void DisabledCheckboxClickOnSecondCheckbox() {
        driver.get("https://www.lambdatest.com/selenium-playground/radiobutton-demo");
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div/div/div/div[2]/label/input")).click();
        Assert.assertEquals("Success - Check box is checked", "Success - Check box is checked");

    }


}
