import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class ThirdTest {
    @Test

    public void TestMethod1(){
        open("https://ee.ge");
        Configuration.browserSize = "1920x1080";
        $(byClassName("btn-register"),0).click();
        $(byText("სწრაფი რეგისტრაცია")).shouldBe(Condition.visible);
        $(byId("firstName")).setValue("Oto");
        $(byId("firstName")).shouldNotBe(Condition.empty);
        $(byId("lastName")).setValue("Akhaladze");
        $(byId("lastName")).shouldNotBe(Condition.empty);
        $(byId("email")).setValue("otoaxaladze@gmail.com");
        $(byId("email")).shouldNotBe(Condition.empty);
        $(byId("password")).setValue("Qwer1234");
        $(byId("confirmPassword")).setValue("Qwer1234");
        $(byId("singup")).shouldBe(Condition.enabled);

    }

    @Test

    public void TestMethod2(){
        open("https://ee.ge");
        Configuration.browserSize = "1920x1080";
        $(byClassName("btn-register"),0).click();
        $(byText("სწრაფი რეგისტრაცია")).shouldBe(Condition.visible);
        $(byId("singup")).shouldBe(Condition.disabled);
        $(byId("firstName")).click();
        $(byId("lastName")).click();
        $(byText("სახელი სავალდებულოა")).shouldBe(Condition.visible);
        $(byId("email")).click();
        $(byText("გვარი სავალდებულოა")).shouldBe(Condition.visible,Duration.ofMillis(10000));
        $("#password").click();
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible,Duration.ofMillis(10000));
        $(byId("confirmPassword")).click();
        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
        $(byClassName("ng-untouched")).click();
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);
        $(byId("email")).setValue("otoaxaladze");
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        $(byId("password")).setValue("Qwer1");
        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
        $(byId("password")).setValue("Qwer1234");
        $(byId("confirmPassword")).setValue("Qwer12");
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);
    }

    @Test

    public void TestMethod3(){
        open("https://ee.ge");
        Configuration.browserSize = "1920x1080";
        $(byClassName("btn-cart"),0).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(byId("search_list")).setValue("ლეპტოპი").pressEnter();
        $(byClassName("button-section"),0).$(byClassName("add_to_cart")).click();
        $(byClassName("btn-cart"),0).click();
        $(byText("კალათა ცარიელია")).shouldNotBe(Condition.visible);
        $(byClassName("btn-lightgrey")).$(byClassName("pl-2")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);


    }

    @Test

    public void TestMethod4(){
        System.setProperty("selenide.browserSize", "1980x1080");
        open("https://ee.ge");
        $(byId("rcc-confirm-button")).click();
        $(byClassName("btn-cart"),0).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(byClassName("unexpanded")).$(byText("შენახული ნივთები")).click();
        $(byText("ვერ მოიძებნა")).shouldBe(Condition.visible);
        $(byId("search_list")).setValue("ლეპტოპი").pressEnter();
        $(byClassName("button-section"),0).$(byClassName("add_to_cart")).click();
        $(byClassName("btn-cart"),0).click();
        $(byText("კალათა ცარიელია")).shouldNotBe(Condition.visible,Duration.ofMillis(10000));
        $(byClassName("redButton")).click();
        $(byClassName("unexpanded")).$(byText("შენახული ნივთები")).click();
        $(byText("ვერ მოიძებნა")).shouldNotBe(Condition.visible);
        $(byClassName("btn-cart"),0).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(byClassName("unexpanded")).$(byText("შენახული ნივთები")).click();
        $(byClassName("cross_icon")).$(byClassName("d-xs-none")).click();
        $(byText("ვერ მოიძებნა")).shouldNotBe(Condition.visible);
    }
}
