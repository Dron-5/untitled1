import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
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
        System.out.println();
        loginInput.should(Condition.visible).val("demo");
        passwordInput.should(Condition.visible).val("demo");
        loginBtn.should(Condition.visible).click();
        BtnId.should(Condition.visible).click();
        OwerviewId.should(Condition.visible).getText().equals("ОБЗОР");
        IndId.should(Condition.visible).getText().equals("СЧЕТА");
        PayId.should(Condition.visible).getText().equals("ПЛАТЕЖИ И ПЕРЕВОДЫ");
        CardId.should(Condition.visible).getText().equals("КАРТЫ");
        DesId.should(Condition.visible).getText().equals("ВКЛАДЫ");
        LonId.should(Condition.visible).getText().equals("КРЕДИТЫ");
        ExtId.should(Condition.visible).getText().equals("ВАЛЮТА");
        InsId.should(Condition.visible).getText().equals("СТРАХОВАНИЕ");

        sleep(100000);
    }

    @AfterEach
    public void after()
    {

    }
}
