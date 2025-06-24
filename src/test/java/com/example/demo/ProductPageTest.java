package com.example.demo;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.jupiter.api.*;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class ProductPageTest {

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
    }

    @BeforeEach
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
        open("https://vk.com/market/product/fyvaf-225299895-10044406");
        Thread.sleep(5_000);
    }

    @Test
    void productCard_ShouldDisplayMainElements() {
        ProductPage productPage = new ProductPage();
        productPage.breadcrumbLabel.shouldBe(visible);
        productPage.pageTitle.shouldBe(visible);
        productPage.disclaimer.shouldBe(visible);
        productPage.descriptionTitle.shouldBe(visible);
        productPage.descriptionContent.shouldBe(visible);
        productPage.groupName.shouldBe(visible);
        productPage.groupCategory.shouldBe(visible);
        productPage.groupSubscribeButton.shouldBe(visible);
        productPage.groupSubscribeButtonText.shouldBe(visible);
        productPage.groupAvatar.shouldBe(visible);
    }

    @Test
    void productCard_shareButton() {
        ProductPage productPage = new ProductPage();
        productPage.shareButton.shouldBe(visible).click();
        productPage.boxLayout.shouldBe(visible);
        productPage.boxTitleText.shouldBe(visible).shouldBe(text("Отправка услуги"));
    }

    @Test
    void productCard_primaryButton() {
        ProductPage productPage = new ProductPage();
        productPage.primaryButton.shouldBe(visible).click();
        productPage.boxLayout.shouldBe(visible);
        productPage.boxTitleText.should(visible).shouldBe(text("Новое сообщение"));
    }

    @Test
    void productCard_reportButton() {
        ProductPage productPage = new ProductPage();
        productPage.reportButton.shouldBe(visible).click();
        productPage.boxLayout.shouldBe(visible);
    }

    @Test
    void productCard_actionOpener() {
        ProductPage productPage = new ProductPage();
        productPage.actionOpenerNotCheckedButton.shouldBe(visible).click();
        productPage.dropDownActionSheetBookmarkNotChecked.shouldBe(visible).click();
        productPage.dropDownActionSheetBookmarkChecked.shouldBe(visible);
        productPage.dropDownActionSheetWishlistNotChecked.shouldBe(visible).click();
        productPage.dropDownActionSheetWishlistChecked.shouldBe(visible);
        productPage.actionOpenerCheckedButton.shouldBe(visible);
        productPage.dropDownActionSheetBookmarkNotChecked.click();
        productPage.dropDownActionSheetWishlistNotChecked.click();
    }

    @Test
    void productCard_ClickAvatar() {
        ProductPage productPage = new ProductPage();
        productPage.groupAvatar.shouldBe(visible).shouldHave(attribute("href"))
                .shouldHave(attributeMatching("href", "/club225299895"));
    }

    @Test
    public void search() throws InterruptedException {
        Thread.sleep(1_000);
    }
}
