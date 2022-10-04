import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


public class testForQuestion {
    private WebDriver driver;

    @Test
    public void questionOneTest (){
        WebDriver driver = new ChromeDriver();
        ElementsForHomePage element = new ElementsForHomePage(driver);
        element.openHomePage();
        element.clickCookieButton ();
        element.scrollToImportantQuestions();
        element.clickButtonFirstQuestion();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        assertEquals(element.textFirstQuestion, driver.findElement(By.id("accordion__panel-0")).getText());
        driver.quit();
    }

    @Test
    public void questionTwoTest (){
        WebDriver driver = new ChromeDriver();
        ElementsForHomePage element = new ElementsForHomePage(driver);
        element.openHomePage();
        element.clickCookieButton ();
        element.scrollToImportantQuestions();
        element.clickButtonSecondQuestion();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        assertEquals(element.textSecondQuestion, driver.findElement(By.id("accordion__panel-1")).getText());
        driver.quit();
    }

    @Test
    public void questionThreeTest (){
        WebDriver driver = new ChromeDriver();
        ElementsForHomePage element = new ElementsForHomePage(driver);
        element.openHomePage();
        element.clickCookieButton ();
        element.scrollToImportantQuestions();
        element.clickButtonThirdQuestion();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        assertEquals(element.textThirdQuestion, driver.findElement(By.id("accordion__panel-2")).getText());
        driver.quit();
    }

    @Test
    public void questionFourTest (){
        WebDriver driver = new ChromeDriver();
        ElementsForHomePage element = new ElementsForHomePage(driver);
        element.openHomePage();
        element.clickCookieButton ();
        element.scrollToImportantQuestions();
        element.clickButtonFourthQuestion();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        assertEquals(element.textFourthQuestion, driver.findElement(By.id("accordion__panel-3")).getText());
        driver.quit();
    }

    @Test
    public void questionFiveTest (){
        WebDriver driver = new ChromeDriver();
        ElementsForHomePage element = new ElementsForHomePage(driver);
        element.openHomePage();
        element.clickCookieButton ();
        element.scrollToImportantQuestions();
        element.clickButtonFifthQuestion();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        assertEquals(element.textFifthQuestion, driver.findElement(By.id("accordion__panel-4")).getText());
        driver.quit();
    }

    @Test
    public void questionSixTest (){
        WebDriver driver = new ChromeDriver();
        ElementsForHomePage element = new ElementsForHomePage(driver);
        element.openHomePage();
        element.clickCookieButton ();
        element.scrollToImportantQuestions();
        element.clickButtonSixthQuestion();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        assertEquals(element.textSixthQuestion, driver.findElement(By.id("accordion__panel-5")).getText());
        driver.quit();
    }

    @Test
    public void questionSevenTest (){
        WebDriver driver = new ChromeDriver();
        ElementsForHomePage element = new ElementsForHomePage(driver);
        element.openHomePage();
        element.clickCookieButton ();
        element.scrollToImportantQuestions();
        element.clickButtonSeventhQuestion();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        assertEquals(element.textSeventhQuestion, driver.findElement(By.id("accordion__panel-6")).getText());
        driver.quit();
    }

    @Test
    public void questionEightTest (){
        WebDriver driver = new ChromeDriver();
        ElementsForHomePage element = new ElementsForHomePage(driver);
        element.openHomePage();
        element.clickCookieButton ();
        element.scrollToImportantQuestions();
        element.clickButtonEighthQuestion();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        assertEquals(element.textEighthQuestion, driver.findElement(By.id("accordion__panel-7")).getText());
        driver.quit();
    }

}
