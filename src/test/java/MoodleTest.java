import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class MoodleTest {
    private String baseUrl = "https://idemo.bspb.ru/";
    private SelenideElement loginInput = $(By.xpath("//input[@name='username']"));
    private SelenideElement passwordInput = $(By.xpath("//input[@name='password']"));
    private SelenideElement loginBtn = $(By.xpath("//button[@id='login-button']"));
    private SelenideElement BtnId = $(By.xpath("//button[@id='login-otp-button']"));
    private SelenideElement PymId = $(By.xpath("//a[@id='payments-form']"));
    private SelenideElement LinID = $(By.xpath("//a[@class='linked-icon card-to-card']"));
    private SelenideElement DatID = $(By.xpath("//a[@onclick='fromCardToCardPage.toggleSourceCardModeForDestination();']"));
    private SelenideElement TXID = $(By.xpath("//input[@class='card-number']"));
    private SelenideElement ReqID = $(By.xpath("//input[@class='required input-small amount']"));
    private SelenideElement ForID = $(By.xpath("//button[@id='forward']"));
    private SelenideElement PID = $(By.xpath("//input[@type='checkbox']"));





    @BeforeAll
    static void beforeConfig()
    {
        Configuration.timeout= 3000;
        Configuration.browserSize = "1920x1920";
    }

    @BeforeEach
    public void before()
    {
        open(baseUrl);
    }

    @Test
    public void test()
    {
        step1();
        step2();
        step3();
        step4();

    }

    @Step("Авторизация")
    private void step1(){
        loginInput.should(Condition.visible).val("demo");
        passwordInput.should(Condition.visible).val("demo");
        loginBtn.should(Condition.visible).click();
        BtnId.should(Condition.visible).click();
    }
    @Step("Перевод на карту")
    private void step2(){
        PymId.should(Condition.visible).click();
        LinID.should(Condition.visible).click();
        DatID.should(Condition.visible).click();
    }
    @Step("Ввод номера карты и суммы для перевода")
    private void step3(){
        TXID.should(Condition.visible).val("1156 1565 1561 5616");
        ReqID.should(Condition.visible).val("100");
    }
    @Step("Переходим далее и соглашаемся с Правилами")
    private void step4(){
        ForID.should(Condition.visible).click();
        PID.should(Condition.visible).click();
    }
    @AfterEach
    public void after()
    {

    }
}
