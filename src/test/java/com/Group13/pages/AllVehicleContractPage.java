package com.Group13.pages;

import com.Group13.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.util.List;

public class AllVehicleContractPage extends BasePage {


    //@FindBy(xpath = "//a[@title='Create Vehicle Contract']")
    //public WebElement CreateVehicleContractBtn;

    @FindBy(css = "[class='btn main-group btn-primary pull-right ']")
    public WebElement createVehicleContract;

    @FindBy(xpath = "//i[contains(text(),'Next')]")
    public WebElement nextButton;

    @FindBy(xpath = "//tbody")
    public WebElement allrows;

    // @FindBy(xpath = "//label[contains(text(),'of 2 |')]")
    @FindBy(xpath = "//label[contains(text(),'of')]" )
    public WebElement numberOfPage;

    @FindBy(xpath = "(//*[@href='javascript:void(0);'])[5]")
    public WebElement threepoint;

    @FindBy(xpath = "//body/ul[1]/li[1]/ul[1]/li[2]/a[1]/i[1]")
    public WebElement editIcon;

    @FindBy(xpath = "//a[@data-size='100']")
    public WebElement dataSize100;

    @FindBy(xpath = "//a[@data-size='25']")
    public WebElement dataSize25;

    @FindBy(xpath = "//table/tbody/tr")
    public List<WebElement> row;

    @FindBy(xpath = "//label[contains(text(),'of')]")
    public WebElement totalPageNumber;

    @FindBy(xpath = "//i[@class='fa-chevron-right hide-text']")
    public WebElement rightArrow;

    @FindBy(css = ".fa-cog.hide-text")
    public WebElement settingButton;

    @FindBy(css = "#column-c340")
    public WebElement checkboxActivationCost;

    @FindBy(css = "#column-c339")
    public WebElement checkboxResponsible;

    @FindBy(xpath = "(//i[@class='fa-arrows-v handle'])[1]")
    public WebElement firstSortIcon;

    @FindBy(xpath = "(//i[@class='fa-arrows-v handle'])[2]")
    public WebElement secondSortIcon;

    @FindBy(xpath = "//a[@title='Reset']")
    public WebElement reset;

    @FindBy(xpath = "(//tbody//td/input)[2]")
    public WebElement responsibleChecked;

    @FindBy(xpath= "(//tbody//td/input)[4]")
    public WebElement activationCostChecked;

    @FindBy(xpath = "(//tbody//td/input)[1]")
    public WebElement idChecked;












}
