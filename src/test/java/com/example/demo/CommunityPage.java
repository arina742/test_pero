package com.example.demo;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class CommunityPage {
    public SelenideElement pageName =  Selenide.$(".page_name");
    public SelenideElement groupAvatar =  Selenide.$(".redesigned-group-avatar");
    public SelenideElement tabMarket =  Selenide.$("[data-testid='group_tab_market']");
    public SelenideElement productCardPicture =  Selenide.$("[data-testid='product_card_picture']");
    public SelenideElement tabServices =  Selenide.$("[data-testid='group_tab_services']");

    public SelenideElement pageBlock =  Selenide.$(".page_block");

    public SelenideElement moreInfo =  Selenide.$(".groups-redesigned-info-more");
    public SelenideElement boxInfo =  Selenide.$(".group-info-box");

    public SelenideElement rating =  Selenide.$("[data-testid='rating-layout-after']");



}
