package com.example.demo;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.jupiter.api.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class CommunityPageTest {
    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
    }

    @BeforeEach
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
        open("https://vk.com/club225299895");
        Thread.sleep(3_000);
    }

    @Test
    void community_ShouldDisplayMainElements() {
        CommunityPage communityPage = new CommunityPage();
        communityPage.pageName.shouldBe(visible).should(text("Test public for test"));
        communityPage.groupAvatar.shouldBe(visible);
        communityPage.groupAvatar.shouldBe(visible);
        communityPage.pageBlock.scrollTo().shouldBe(visible);
        communityPage.moreInfo.shouldBe(visible);
    }

    @Test
    void community_clickTabMarket() {
        CommunityPage communityPage = new CommunityPage();
        communityPage.tabMarket.shouldBe(visible)
                .scrollIntoView("{block: 'center'}")
                .shouldHave(text("Товары"))
                .click();
        communityPage.productCardPicture.scrollTo().shouldBe(visible);
    }

    @Test
    void community_clickTabServices() {
        CommunityPage communityPage = new CommunityPage();
        communityPage.tabServices
                .shouldBe(visible)
                .scrollIntoView("{block: 'center'}")
                .shouldHave(text("Услуги"))
                .click();
        communityPage.productCardPicture.scrollTo().shouldBe(visible);
    }

    @Test
    void community_clickMoreInfo() {
        CommunityPage communityPage = new CommunityPage();
        communityPage.moreInfo.shouldBe(visible).click();
        communityPage.boxInfo.shouldBe(visible).shouldHave(text("Подробная информация"));
    }

    @Test
    void community_clickRating() {
        CommunityPage communityPage = new CommunityPage();
        communityPage.rating.shouldBe(visible).click();
        webdriver().shouldHave(urlContaining("https://vk.com/reviews-225299895"));
    }



    @Test
    public void search() throws InterruptedException {
        Thread.sleep(1_000);
    }

}
