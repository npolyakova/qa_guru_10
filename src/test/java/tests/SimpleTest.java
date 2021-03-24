package tests;

import com.codeborne.selenide.Condition;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleTest extends TestBase {

    @Test
    public void openGoogle(){
        open("https://www.google.com/");
        $("[name='q']").shouldBe(Condition.visible);
    }
}
