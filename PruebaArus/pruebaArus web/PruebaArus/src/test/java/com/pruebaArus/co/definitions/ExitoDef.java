package com.pruebaArus.co.definitions;

import com.pruebaArus.co.pages.ExitoPage;
import com.pruebaArus.co.steps.ExitoStep;
import com.pruebaArus.co.utilis.website.WebSiteExito;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.util.List;
import java.util.Random;

public class ExitoDef {

    @Steps(shared = true)
    WebSiteExito url;

    @Steps(shared = true)
    ExitoStep exito;

    /*@Steps(shared = true)
    ValidationSteps validation;*/

    @Given("el usuario navega al sitio web")
    public void el_usuario_navega_al_sitio_web() {
        url.navigateTo("https://www.exito.com/");
        }

    @When("dirigirse al menuy seleccionar categoria y subcategoria")
    public void dirigirse_al_menuy_seleccionar_categoria_y_subcategoria() {
        exito.pathToCategorySubCategory();
       }

    @When("seleccionar productos")
    public void clickOnRandomProductElements() throws AWTException {
        exito.selectElement();
        }

    @When("ingresar cantidad de productos a seleccionar")
    public void ingresar_cantidad_de_productos_a_seleccionar() {
        exito.addQuantityProducts();
        }

    @Then("validar infromacion del carrito")
    public void validar_infromacion_del_carrito() {
       }
}
