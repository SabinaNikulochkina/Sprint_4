import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ElementsForHomePage {
    //добавили поле driver, что бы программа искала элементы по их описанию
    private WebDriver driver;
    //добавили конструктор для инициализации поля driver
    public ElementsForHomePage(WebDriver driver){
        this.driver = driver;
    }

    //кнопка "заказать" находится в верхней части
    private By topButtonOrder = By.className("Button_Button__ra12g");
    //кнопка "заказать" снизу
    private By downButtonOrder = By.className("Button_Button__ra12g Button_Middle__1CSJM");

    public String linkHomePage = "https://qa-scooter.praktikum-services.ru/";

    //локатор для скролла
    public By scrollQuestions =  By.id("accordion__heading-0");

    //локатор для кнопки "да все привыкли"
    public By cookieButton = By.id("rcc-confirm-button");

    //локатор кнопки 1-го вопроса
    private By buttonFirstQuestion = By.id("accordion__heading-0");
    //локатор описания 1-го вопроса
    private By descriptionFirstQuestion = By.id("accordion__panel-0");
    public String textFirstQuestion = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    //локатор кнопки 2-го вопроса
    private By buttonSecondQuestion = By.id("accordion__heading-1");
    //локатор описания 2-го вопроса
    private By descriptionSecondQuestion = By.id("accordion__panel-1");
    public String textSecondQuestion = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    //локатор кнопки 3-го вопроса
    private By buttonThirdQuestion = By.id("accordion__heading-2");
    //локатор описания 3-го вопроса
    private By descriptionThirdQuestion = By.id("accordion__panel-2");
    public String textThirdQuestion = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    //локатор кнопки 4-го вопроса
    private By buttonFourthQuestion = By.id("accordion__heading-3");
    //локатор описания 4-го вопроса
    private By descriptionFourthQuestion = By.id("accordion__panel-3");
    public String textFourthQuestion = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    //локатор кнопки 5-го вопроса
    private By buttonFifthQuestion = By.id("accordion__heading-4");
    //локатор описания 5-го вопроса
    private By descriptionFifthQuestion = By.id("accordion__panel-4");
    public String textFifthQuestion = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    //локатор кнопки 6-го вопроса
    private By buttonSixthQuestion = By.id("accordion__heading-5");
    //локатор описания 6-го вопроса
    private By descriptionSixthQuestion = By.id("accordion__panel-5");
    public String textSixthQuestion = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    //локатор кнопки 7-го вопроса
    private By buttonSeventhQuestion = By.id("accordion__heading-6");
    //локатор описания 7-го вопроса
    private By descriptionSeventhQuestion = By.id("accordion__panel-6");
    public String textSeventhQuestion = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    //локатор кнопки 8-го вопроса
    private By buttonEighthQuestion = By.id("accordion__heading-7");
    //локатор описания 8-го вопроса
    private By descriptionEighthQuestion = By.id("accordion__panel-7");
    public String textEighthQuestion = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    //............................методы для взаимодействия с локаторами

    //метод открывает сайт
    public void openHomePage (){
        driver.get(linkHomePage);
    }

    //метод кликает на кнопку "заказать", которая находится в верхней части
    public void clickTopButtonOrder (){
        driver.findElement(topButtonOrder).click();
    }

    //метод кликает на кнопку "заказать" снизу
    public void clickDownButtonOrder (){
        driver.findElement(downButtonOrder).click();
    }

    //метод кликает на кнопку куки
    public void clickCookieButton (){
        driver.findElement(cookieButton).click();
    }

    //метод скролл
    public void scrollToImportantQuestions(){
        WebElement element = driver.findElement(scrollQuestions);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);}
    public void standBy(By element){ //Ожидание
        WebElement dynamicElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(element));
    }

    //метод кликает по первому вопросу
    public void clickButtonFirstQuestion (){
        driver.findElement(buttonFirstQuestion).click();
    }

    //метод кликает по второму вопросу
    public void clickButtonSecondQuestion (){
        driver.findElement(buttonSecondQuestion).click();
    }

    //метод кликает по третьему вопросу
    public void clickButtonThirdQuestion (){
        driver.findElement(buttonThirdQuestion).click();
    }

    //метод кликает по четвертому вопросу
    public void clickButtonFourthQuestion (){
        driver.findElement(buttonFourthQuestion).click();
    }

    //метод кликает по пятому вопросу
    public void clickButtonFifthQuestion (){
        driver.findElement(buttonFifthQuestion).click();
    }

    //метод кликает по шестому вопросу
    public void clickButtonSixthQuestion (){
        driver.findElement(buttonSixthQuestion).click();
    }

    //метод кликает по седьмому вопросу
    public void clickButtonSeventhQuestion (){
        driver.findElement(buttonSeventhQuestion).click();
    }
    //метод кликает по восьмому вопросу
    public void clickButtonEighthQuestion (){
        driver.findElement(buttonEighthQuestion).click();
    }


}
