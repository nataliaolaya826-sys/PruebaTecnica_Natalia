package co.sqasa.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;

public class Objects extends PageObject {


    @FindBy(id = "datepicker")
    public WebElementFacade inputDateField;

    @FindBy(xpath = "//a[text()='15']")
    public WebElementFacade dayFifteen;

}