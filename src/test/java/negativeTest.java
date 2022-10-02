import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.CoreMatchers.startsWith;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class negativeTest {
    private static String name;
    private static String lastName;
    private static String address;
    private static String phoneNumber;
    private static String comment;
    private static String expectedOrder;

    public negativeTest(String name, String lastName, String adress, String phoneNumber, String comment, String expectedOrder){
        this.name = name;
        this.lastName = lastName;
        this.address = adress;
        this.phoneNumber = phoneNumber;
        this.expectedOrder = expectedOrder;
        this.comment = comment;
    }
    private WebDriver driver;

    @Parameterized.Parameters
    public static Object[][] getCredentials() {
        return new Object[][]{
                {"Sabina", "Никулочкина", "Москва, Шоссейная, 5", "79998881122", "Побыстрее", "Введите корректное имя"},
                {"Сабина", "Nikulochkina", "Москва, Шоссейная, 5", "79998881122", "", "Введите корректную фамилию"},
        };
    }

    @Test
    public void orderWithNoValidData() {
        WebDriver driver = new ChromeDriver();
        ElementsForHomePage forOpenSite = new ElementsForHomePage(driver);
        ElementsForOrder elements = new ElementsForOrder(driver);
        forOpenSite.openHomePage(); //
        forOpenSite.clickCookieButton(); //
        forOpenSite.clickTopButtonOrder(); //
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); //
        elements.fillingFirstOrder(name, lastName, address, phoneNumber); //
        elements.clickButtonNextOrder(); //
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); //
        String actualOrder2 = elements.getTextError(); //
        MatcherAssert.assertThat(actualOrder2, startsWith(expectedOrder)); //
        driver.quit();
        System.out.println("Не валидный тест");
    }

}
