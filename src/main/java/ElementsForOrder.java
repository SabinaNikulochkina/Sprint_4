import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ElementsForOrder {
    //добавили поле driver, что бы программа искала элементы по их описанию
    private WebDriver driver;
    //добавили конструктор для инициализации поля driver
    public ElementsForOrder(WebDriver driver){
        this.driver = driver;
    }

    public String linkOrder = "https://qa-scooter.praktikum-services.ru/order";

    //поле для ввода имени
    public By nameOrder = By.xpath(".//input[@placeholder='* Имя']");
    //поле для ввода фамилии
    public By lastNameOrder = By.xpath(".//input[@placeholder='* Фамилия']");
    //поле для ввода адреса
    public By addressOrder = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    //поле станции метро
    public By stationOrder = By.xpath(".//input[@placeholder='* Станция метро']");
    //поле для выбора станции метро
    public By choiceStationOrder = By.xpath(".//button[@value='5']");
    //поле для ввода телефона
    public By phoneNumberOrder = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    //кнопка "далее"
    private By ButtonNextOrder = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //поле "когда привезти самокат"
    public By whenBringSamokatOrder = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    public By dateOrder = By.xpath(".//div[contains(@class, 'react-datepicker__day') and (@aria-label='Choose среда, 5-е октября 2022 г.')]");
    //поле "срок аренды"
    public By rentalPeriodOrder = By.className("Dropdown-placeholder");
    public By periodOrder =  By.xpath(".//div[@class='Dropdown-option'][3]");
    //чек-бокс выбора черного или серого цвета самоката
    public By colorBlackOrder = By.xpath(".//input[@id='black']");
    public By colorGreyOrder = By.xpath(".//input[@id='grey']");
    //комментарий для курьера
    public By commentOrder = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    //кнопка "заказать"
    private By ButtonOrder = By.xpath(".//button[@class ='Button_Button__ra12g Button_Middle__1CSJM' and (text()='Заказать')]");
    //кнопка "да" в сплывающем окне
    public By yesButton = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM' and (text()='Да')]");
    //окно подтверждения заказа
    public By confirmationWindow = By.xpath(".//div[@class = 'Order_ModalHeader__3FDaJ']");

    //элемент ошибки если ввести некорректное имя
    public By errorName = By.xpath(".//div[@class='Input_ErrorMessage__3HvIb Input_Visible___syz6']");

    //............................методы для взаимодействия с локаторами

    //метод заполняет поле имя
    public void setName(String name) {
        driver.findElement(nameOrder).sendKeys(name);
    }

    //метод заполняет поле фамилия
    public void setLastName(String lastName) {
        driver.findElement(lastNameOrder).sendKeys(lastName);
    }

    //метод заполняет поле адрес
    public void setAddressOrder(String address) {
        driver.findElement(addressOrder).sendKeys(address);
    }

    //метод кликает по полю станция метро
    public void clickStationOrder() {
        driver.findElement(stationOrder).click();
    }

    //метод выбирает станцию метро
    public void clickChoiceStationOrder() {
        driver.findElement(choiceStationOrder).click();
    }

    //метод заполняет поле телефон
    public void setPhoneNumberOrder(String phoneNumber) {
        driver.findElement(phoneNumberOrder).sendKeys(phoneNumber);
    }

    //метод кликает на кнопку "далее"
    public void clickButtonNextOrder() {
        driver.findElement(ButtonNextOrder).click();
    }

    //метод, котрый объединяет ввод данных в поля на 1 части формы заказа
    public void fillingFirstOrder(String name, String lastName, String address, String phoneNumber){
        setName(name);
        setLastName(lastName);
        setAddressOrder(address);
        clickStationOrder();
        clickChoiceStationOrder();
        setPhoneNumberOrder(phoneNumber);
    }

    //метод кликает по полю когда привезти самокат
    public void clickWhenBringSamokatOrder() {
        driver.findElement(whenBringSamokatOrder).click();
    }

    //метод выбирает дату
    public void clickDateOrder() {
        driver.findElement(dateOrder).click();
    }

    //метод кликает по полю срок аренды
    public void clickRentalPeriodOrder() {
        driver.findElement(rentalPeriodOrder).click();
    }

    //метод выбирает срок аренды
    public void clickPeriodOrder() {
        driver.findElement(periodOrder).click();
    }

    //метод выбирает цвет самоката черный
    public void clickColorBlackOrder() {
        driver.findElement(colorBlackOrder).click();
    }

    //метод выбирает цвет самоката серый
    public void clickColorGreyOrder() {
        driver.findElement(colorGreyOrder).click();
    }

    //метод заполняет поле комментарий
    public void setСommentOrder(String comment) {
        driver.findElement(commentOrder).sendKeys(comment);
    }

    //метод нажимает на кнопку "заказать"
    public void clickButtonOrder() {
        driver.findElement(ButtonOrder).click();
    }

    //метод нажимает на кнопку "да"
    public void clickYesButton() {
        driver.findElement(yesButton).click();
    }

    public String getTextOfConfirmationWindow() {
        return driver.findElement(confirmationWindow).getText();
    }

    public void fillingSecondOrder(String comment){
        clickWhenBringSamokatOrder();
        clickDateOrder();
        clickRentalPeriodOrder();
        clickPeriodOrder();
        clickColorBlackOrder();
        setСommentOrder(comment);
        clickButtonOrder();
        clickYesButton();

    }

    public String getTextError() {
        return driver.findElement(errorName).getText();
    }

}
