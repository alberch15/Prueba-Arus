package com.pruebaArus.co.steps;

import com.pruebaArus.co.pages.ExitoPage;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExitoStep extends ExitoPage {

    @Before
    public void configureWebDriver() {
        String chromeDriverPath = WebDriverManager.chromedriver().getDownloadedDriverPath();
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        Serenity.setSessionVariable("chromeDriverPath").to(chromeDriverPath);


    }

    @Step("dirigirse al menuy seleccionar categoria y subcategoria")
    public void pathToCategorySubCategory() {
        menu_exito.isDisplayed();
        menu_exito.click();
        categoria_exito.isDisplayed();
        categoria_exito.click();
        subcategoria_exito.isDisplayed();
        subcategoria_exito.click();
    }

    @Step("seleccionar productos")
    public void selectElement() throws AWTException {
        Robot robot = new Robot();
        Random rand = new Random();
        int index = rand.nextInt(elementos.size());

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_MINUS);

        elementos.get(index).click();
        waitABit(2000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_MINUS);

        elementos.get(index).click();
        waitABit(2000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_MINUS);

        elementos.get(index).click();
        waitABit(2000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_MINUS);

        elementos.get(index).click();
        waitABit(2000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_MINUS);

        elementos.get(index).click();
        waitABit(2000);


    }

    @Step("ingresar cantidad de productos a seleccionar")
    public void addQuantityProducts() {


        Random rando = new Random();

        // Lista de cantidades de clics para cada elemento
        List<Integer> cantidadesClics = new ArrayList<>();
        for (int i = 0; i < plus.size(); i++) {
            int cantidadClics = rando.nextInt(10); // Generar una cantidad aleatoria de clics entre 1 y 10 para cada elemento
            cantidadesClics.add(cantidadClics);
        }

        // Aplicar clics a cada elemento
        for (int i = 0; i < plus.size(); i++) {
            WebElement elemento = plus.get(i);
            int cantidadClics = cantidadesClics.get(i);
            for (int j = 0; j < cantidadClics; j++) {
                elemento.click(); // Hacer clic en el elemento

            }
            waitABit(10000);
        }
    }

}
