import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


import javax.xml.soap.Text;

import static com.codeborne.selenide.Selenide.*;

public class FirsTtest
{
    private String baseUrl = "https://idemo.bspb.ru/";
    private SelenideElement loginInput = $(By.xpath("//input[@name='username']"));
    private SelenideElement passwordInput = $(By.xpath("//input[@name='password']"));
    private SelenideElement loginBtn = $(By.xpath("//button[@id='login-button']"));
    private SelenideElement BtnId = $(By.xpath("//button[@id='login-otp-button']"));
    private SelenideElement OwerviewId = $(By.xpath("//a[@id='bank-overview']"));
    private SelenideElement IndId = $(By.xpath("//a[@id='accounts-index']"));
    private SelenideElement PayId = $(By.xpath("//a[@id='payments-form']"));
    private SelenideElement CardId = $(By.xpath("//a[@id='cards-overview-index']"));
    private SelenideElement DesId = $(By.xpath("//a[@id='deposits-index']"));
    private SelenideElement LonId = $(By.xpath("//a[@id='loans-index']"));
    private SelenideElement ExtId = $(By.xpath("//a[@id='externaltraderoom-index']"));
    private SelenideElement InsId = $(By.xpath("//a[@id='insurance-travel']"));







    @BeforeAll
    static void beforeConfig()
    {
        Configuration.timeout= 3000;
        Configuration.browserSize = "1920x720";
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
        step5();
        step6();
        step7();
        step8();
        step9();


    }

    @Step("Авторизация")
    private void step1(){
        loginInput.should(Condition.visible).val("demo");
        passwordInput.should(Condition.visible).val("demo");
        loginBtn.should(Condition.visible).click();
        BtnId.should(Condition.visible).click();
    }
    @Step("Проверка кнопки 'Обзор'")
    private void step2(){
        OwerviewId.should(Condition.visible).getText().equals("ОБЗОР");
    }
    @Step("Проверка кнопки 'Счета'")
    private void step3(){
        IndId.should(Condition.visible).getText().equals("СЧЕТА");
    }
    @Step("Проверка кнопки 'Платежи и переводы'")
    private void step4(){
        PayId.should(Condition.visible).getText().equals("ПЛАТЕЖИ И ПЕРЕВОДЫ");
    }
    @Step("Проверка кнопки 'Карты'")
    private void step5(){
        CardId.should(Condition.visible).getText().equals("КАРТЫ");
    }
    @Step("Проверка кнопки 'Вклады'")
    private void step6(){
        DesId.should(Condition.visible).getText().equals("ВКЛАДЫ");
    }
    @Step("Проверка кнопки 'Кредиты'")
    private void step7(){
        LonId.should(Condition.visible).getText().equals("КРЕДИТЫ");
    }
    @Step("Проверка кнопки 'Валюта'")
    private void step8(){
        ExtId.should(Condition.visible).getText().equals("ВАЛЮТА");
    }
    @Step("Проверка кнопки 'Страхование'")
    private void step9(){
        InsId.should(Condition.visible).getText().equals("СТРАХОВАНИЕ");
    }


    @AfterEach
    public void after()
    {

    }
}
