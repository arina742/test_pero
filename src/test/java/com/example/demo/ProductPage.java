package com.example.demo;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;
import com.codeborne.selenide.SelenideDriver;

public class ProductPage {

    public SelenideElement breadcrumbLabel =  Selenide.$("[data-testid='breadcrumb-label']");
    public SelenideElement pageTitle = Selenide.$("[data-testid='market_item_page_title']");

    public SelenideElement disclaimer = Selenide.$("[data-testid='market_item_disclaimer']");
    public SelenideElement descriptionTitle = Selenide.$("[data-testid='market_item_description_title']");
    public SelenideElement descriptionContent = Selenide.$("[data-testid='showmoretext-in']");


    public SelenideElement shareButton = Selenide.$("[data-testid='market_item_page_share']");
    public SelenideElement primaryButton = Selenide.$("[data-testid='market_item_page_primary_button']");
    public SelenideElement reportButton = Selenide.$("[data-testid='market_item_page_report']");

    public SelenideElement actionOpenerNotCheckedButton = Selenide.$("[data-testid='market_item_page_actions_opener_button_not_checked']");
    public SelenideElement actionOpenerCheckedButton = Selenide.$("[data-testid='market_item_page_actions_opener_button_checked']");
    public SelenideElement dropDownActionSheet = Selenide.$("[data-testid='dropdownactionsheet']");
    public SelenideElement dropDownActionSheetBookmark = Selenide.$("[data-testid='dropdownactionsheet-item-bookmark']");
    public SelenideElement dropDownActionSheetWishlist = Selenide.$("[data-testid='dropdownactionsheet-item-dropdownactionsheet-item-wishlist']");
    public SelenideElement dropDownActionSheetBookmarkNotChecked = Selenide.$("[data-testid='dropdownactionsheet-item-bookmark-not-checked']");
    public SelenideElement dropDownActionSheetBookmarkChecked = Selenide.$("[data-testid='dropdownactionsheet-item-bookmark-checked']");
    public SelenideElement dropDownActionSheetWishlistNotChecked = Selenide.$("[data-testid='dropdownactionsheet-item-wishlist-not-checked']");
    public SelenideElement dropDownActionSheetWishlistChecked = Selenide.$("[data-testid='dropdownactionsheet-item-wishlist-checked']");

    public SelenideElement groupName = Selenide.$("[data-testid='market_item_page_shop_text']");
    public SelenideElement groupCategory = Selenide.$("[data-testid='market_item_page_group_link']");
    public SelenideElement groupSubscribeButton = Selenide.$("[data-testid='market_item_page_subscribe_button']");
    public SelenideElement groupSubscribeButtonText = Selenide.$("[data-testid='market_item_page_subscribed_button_text']");
    public SelenideElement groupAvatar = Selenide.$("[data-testid='market_item_page_group_avatar']");

    public SelenideElement boxLayout = Selenide.$("[data-testid='box_layout']");

    public SelenideElement boxTitleText = Selenide.$("[data-testid='box_title_text']");





}
