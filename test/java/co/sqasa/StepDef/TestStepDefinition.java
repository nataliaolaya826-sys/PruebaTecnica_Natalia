package co.sqasa.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class TestStepDefinition {


    @Given("Abrir la pagina principal de JQuery Datepicker.")
    public void openJqueryPage() {
        onPage.openPage();
    }

    @When("Cambiar al iframe donde se encuentra el calendario.")
    public void switchToIframe() {
        onPage.getDriver().switchTo().frame(0);
    }

    @And("Hacer clic en el campo de seleccion de fecha.")
    public void clickOnDateField() {
        onPage.imputDateField.click
    }

    @And("Seleccionar el dia 15 del mes actual.")
    public void selectDayFifteen() {
        onPage.dayFifteen.click();
    }

    @Then("Validar que la fecha seleccionada aparece en el campo de texto")
    public void validateSelectedDate() {
        String expectedDate = "10/15/2025";
        onPage.inputDateField.shouldContainText(expectedDate);
    }
}


